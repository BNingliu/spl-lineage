package com.myxql.parser.clickhouse.parser;

import com.myxql.parser.clickhouse.antlr4.CksqlBaseVisitor;
import com.myxql.parser.clickhouse.antlr4.CksqlParser;
import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.ColumnName;
import com.myxql.parser.model.TableNameModel;
import com.myxql.parser.model.line.FieldLineageSelectItemModel;
import com.myxql.parser.model.line.FieldLineageSelectModel;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName HiveSqlFieldLineage
 * @description:
 * @author: again
 * @Date: 2021/3/10 8:54 下午
 */
public class ClickHouSqlFieldLineageParser extends CksqlBaseVisitor {

    private TableNameModel outputTable;

    private Integer dbType;

    private Integer relationship;

    private final HashMap<String, FieldLineageSelectModel> hiveFieldSelects = new LinkedHashMap<>();

    private final Map<Integer, String> selectParentKeyMap = new HashMap<>();

    private String thisSelectId;

    private final String sourceSQL;
    private String formattedSQL = "";

    private boolean firstSelect = true;

    /**
     * for select Item
     */
    private FieldLineageSelectItemModel selectItemModel;
    private List<FieldLineageSelectItemModel> selectFields = new ArrayList<>();
    private Boolean startSelectItem = false;

    public ClickHouSqlFieldLineageParser(String sql, Integer dbType, Integer relationship) {
        this.sourceSQL = sql;
        this.dbType = dbType;
        this.relationship=relationship;
    }

    private String subSourceSql(ParserRuleContext parserRuleContext) {
        return sourceSQL.substring(
                parserRuleContext.getStart().getStartIndex(),
                parserRuleContext.getStop().getStopIndex() + 1);
    }

    /**
     * insert解析结果表
     */
    @Override
    public Object visitInsert_stmt(CksqlParser.Insert_stmtContext ctx) {
        outputTable = Optional.ofNullable(ctx)
                .map(CksqlParser.Insert_stmtContext::table_name)
                .map(RuleContext::getText)
                .map(TableNameModel::parseTableName)
                .orElse(null);
        return super.visitInsert_stmt(ctx);
    }

    /**
     * 解析select每个selectItem里用到字段
     */
    @Override
    public Object visitExpr(CksqlParser.ExprContext ctx) {
        if (startSelectItem) {
            Optional.ofNullable(ctx)
                    .map(CksqlParser.ExprContext::expr_atom)
                    .map(CksqlParser.Expr_atomContext::ident)
                    .map(ParseTree::getText)
                    .ifPresent(s -> {
                        if (!StringUtils.isNumeric(s)) {
                            selectItemModel.getFieldNames().add(TableNameModel.dealNameMark(s));
                        }
                    });
        }
        return super.visitExpr(ctx);
    }

    /**
     * selectItem 获取别名名，初始化selectItem存相关字段的fieldNames
     */
    @Override
    public Object visitSelect_list_item(CksqlParser.Select_list_itemContext ctx) {
        startSelectItem = true;
        selectItemModel = new FieldLineageSelectItemModel();
        selectItemModel.setFieldNames(new HashSet<>());
        Optional.ofNullable(ctx)
                .map(CksqlParser.Select_list_itemContext::expr)
                .map(this::subSourceSql)
                .ifPresent(selectItemModel::setProcess);
        Optional.ofNullable(ctx)
                .map(CksqlParser.Select_list_itemContext::select_list_alias)
                .map(CksqlParser.Select_list_aliasContext::ident)
                .map(RuleContext::getText)
                .ifPresent(selectItemModel::setAlias);
        Object visit = super.visitSelect_list_item(ctx);
        selectFields.add(selectItemModel);
        return visit;
    }

    /**
     * from语句，处理于所有selectItem结束
     * 对上面解析出的字段名中的表别名进行处理 如t0.field
     */
    @Override
    public Object visitFrom_clause(CksqlParser.From_clauseContext ctx) {
        startSelectItem = false;
        HashMap<String, List<FieldLineageSelectItemModel>> fieldItems = new HashMap<>();
        for (FieldLineageSelectItemModel item : selectFields) {
            HashMap<String, HashSet<String>> aliasSet = new HashMap<>();
            for (String field : item.getFieldNames()) {
                String[] sp = field.split("\\.");
                if (sp.length == 2) {
                    String key = thisSelectId + "_" + sp[0];
                    aliasSet.computeIfAbsent(key, t -> new HashSet<>());
                    aliasSet.get(key).add(sp[1]);
                } else if (sp.length == 1) {
                    boolean flat = true;
                    for (String k : selectParentKeyMap.values()) {
                        if (k.startsWith(thisSelectId + "_")) {
                            aliasSet.computeIfAbsent(k, t -> new HashSet<>());
                            aliasSet.get(k).add(sp[0]);
                            flat = false;
                        }
                    }
                    if (flat) {
                        String key = thisSelectId + "_";
                        aliasSet.computeIfAbsent(key, t -> new HashSet<>());
                        aliasSet.get(key).add(sp[0]);
                    }
                }
            }
            for (String key : aliasSet.keySet()) {
                fieldItems.computeIfAbsent(key, k -> new ArrayList<>());
                FieldLineageSelectItemModel selectItemModel = new FieldLineageSelectItemModel();
                selectItemModel.setFieldNames(aliasSet.get(key));
                selectItemModel.setAlias(item.getAlias());
                selectItemModel.setProcess(item.getProcess());
                if (selectItemModel.getFieldNames().size() == 1 && selectItemModel.getAlias() == null) {
                    selectItemModel.setAlias(selectItemModel.getFieldNames().iterator().next());
                }
                fieldItems.get(key).add(selectItemModel);
            }
        }
        for (String key : fieldItems.keySet()) {
            if (hiveFieldSelects.get(key) != null) {
                hiveFieldSelects.get(key).setSelectItems(fieldItems.get(key));
            }
        }
        return super.visitFrom_clause(ctx);
    }

    /**
     * 进入select前
     * 解析每个select存信息并另存父子关系
     * 父子来源于from subSelect, join subSelect
     */
    @Override
    public Object visitSelect_stmt(CksqlParser.Select_stmtContext ctx) {
        List<CksqlParser.Fullselect_stmt_itemContext> selectItems = ctx.fullselect_stmt().fullselect_stmt_item();
        for (CksqlParser.Fullselect_stmt_itemContext selectItem : selectItems) {
            FieldLineageSelectModel fieldLineageSelectModel = new FieldLineageSelectModel();
            Integer thisId = selectItem.getStart().getStartIndex();
            CksqlParser.Subselect_stmtContext subSelect = selectItem.subselect_stmt();
            CksqlParser.From_table_name_clauseContext fromTableNameClause = Optional.ofNullable(subSelect)
                    .map(CksqlParser.Subselect_stmtContext::from_clause)
                    .map(CksqlParser.From_clauseContext::from_table_clause)
                    .map(CksqlParser.From_table_clauseContext::from_table_name_clause)
                    .orElse(null);
            Optional.ofNullable(fromTableNameClause)
                    .map(CksqlParser.From_table_name_clauseContext::table_name)
                    .map(RuleContext::getText)
                    .map(TableNameModel::parseTableName)
                    .ifPresent(fieldLineageSelectModel::setFromTable);
            Optional.ofNullable(fromTableNameClause)
                    .map(CksqlParser.From_table_name_clauseContext::from_alias_clause)
                    .map(CksqlParser.From_alias_clauseContext::ident)
                    .map(RuleContext::getText)
                    .ifPresent(fieldLineageSelectModel::setTableAlias);

            Optional.ofNullable(subSelect)
                    .map(CksqlParser.Subselect_stmtContext::from_clause)
                    .map(CksqlParser.From_clauseContext::from_table_clause)
                    .map(CksqlParser.From_table_clauseContext::from_subselect_clause)
                    .map(CksqlParser.From_subselect_clauseContext::from_alias_clause)
                    .map(RuleContext::getText)
                    .ifPresent(fieldLineageSelectModel::setTableAlias);

            String alias = fieldLineageSelectModel.getTableAlias();
            String thisKey = String.format("%s_%s", thisId, alias == null ? "" : alias);
            fieldLineageSelectModel.setId(thisKey + "");
            fieldLineageSelectModel.setParentId(selectParentKeyMap.get(thisId));
            fieldLineageSelectModel.setSelectItems(new ArrayList<>());
            hiveFieldSelects.put(thisKey, fieldLineageSelectModel);

            Optional.ofNullable(subSelect)
                    .map(CksqlParser.Subselect_stmtContext::from_clause)
                    .map(CksqlParser.From_clauseContext::from_table_clause)
                    .map(CksqlParser.From_table_clauseContext::from_subselect_clause)
                    .map(CksqlParser.From_subselect_clauseContext::select_stmt)
                    .map(CksqlParser.Select_stmtContext::fullselect_stmt)
                    .map(CksqlParser.Fullselect_stmtContext::fullselect_stmt_item)
                    .ifPresent(subSelects ->
                            subSelects.forEach(item ->
                                    selectParentKeyMap.put(item.getStart().getStartIndex(), thisKey)));

            List<CksqlParser.From_join_clauseContext> fromJoinClauses = Optional.ofNullable(subSelect)
                    .map(CksqlParser.Subselect_stmtContext::from_clause)
                    .map(CksqlParser.From_clauseContext::from_join_clause)
                    .orElse(new ArrayList<>());
            for (CksqlParser.From_join_clauseContext fromJoinClauseContext : fromJoinClauses) {
                FieldLineageSelectModel joinSelect = new FieldLineageSelectModel();
                Optional.ofNullable(fromJoinClauseContext)
                        .map(CksqlParser.From_join_clauseContext::from_table_clause)
                        .map(CksqlParser.From_table_clauseContext::from_table_name_clause)
                        .map(CksqlParser.From_table_name_clauseContext::table_name)
                        .map(RuleContext::getText)
                        .map(TableNameModel::parseTableName)
                        .ifPresent(joinSelect::setFromTable);
                Optional.ofNullable(fromJoinClauseContext)
                        .map(CksqlParser.From_join_clauseContext::from_table_clause)
                        .map(CksqlParser.From_table_clauseContext::from_table_name_clause)
                        .map(CksqlParser.From_table_name_clauseContext::from_alias_clause)
                        .map(CksqlParser.From_alias_clauseContext::ident)
                        .map(RuleContext::getText)
                        .ifPresent(joinSelect::setTableAlias);

                Optional.ofNullable(fromJoinClauseContext)
                        .map(CksqlParser.From_join_clauseContext::from_table_clause)
                        .map(CksqlParser.From_table_clauseContext::from_subselect_clause)
                        .map(CksqlParser.From_subselect_clauseContext::from_alias_clause)
                        .map(RuleContext::getText)
                        .ifPresent(joinSelect::setTableAlias);

                String jalias = joinSelect.getTableAlias();
                String jkey = String.format("%s_%s", thisId, jalias == null ? "" : jalias);
                joinSelect.setId(jkey);
                joinSelect.setParentId(selectParentKeyMap.get(thisId));
                joinSelect.setSelectItems(new ArrayList<>());
                hiveFieldSelects.put(jkey, joinSelect);

                Optional.ofNullable(fromJoinClauseContext)
                        .map(CksqlParser.From_join_clauseContext::from_table_clause)
                        .map(CksqlParser.From_table_clauseContext::from_subselect_clause)
                        .map(CksqlParser.From_subselect_clauseContext::select_stmt)
                        .map(CksqlParser.Select_stmtContext::fullselect_stmt)
                        .map(CksqlParser.Fullselect_stmtContext::fullselect_stmt_item)
                        .ifPresent(subSelects ->
                                subSelects.forEach(item ->
                                        selectParentKeyMap.put(item.getStart().getStartIndex(), jkey)));
            }
        }
        return super.visitSelect_stmt(ctx);
    }

    /**
     * 处理每个子select进入前，
     * 初始化selectItem相关的变量
     */
    @Override
    public Object visitSubselect_stmt(CksqlParser.Subselect_stmtContext ctx) {
        thisSelectId = ctx.getStart().getStartIndex() + "";
        selectFields = new ArrayList<>();
        return super.visitSubselect_stmt(ctx);
    }

    private final List<FieldLineageSelectModel> hiveFieldSelectList = new ArrayList<>();

    /**
     * 转换HashMap存储为List
     */
    private void transSelectToList() {
        for (String key : hiveFieldSelects.keySet()) {
            hiveFieldSelectList.add(hiveFieldSelects.get(key));
        }
    }

    /**
     * 获取目标字段
     * 也就是parentId为null的最外层select的字段别名
     *  FieldNameModel
     */
    private List<ColumnName> getTargetFields() {
        List<List<String>> items = hiveFieldSelectList.stream()
                .filter(item -> item.getParentId() == null)
                .map(FieldLineageSelectModel::getSelectItems)
                .map(fields -> fields.stream()
                        .map(FieldLineageSelectItemModel::getAlias)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        List<String> res = new ArrayList<>();
        for (List<String> item : items) {
            res.addAll(item);
        }
        res = res.stream().distinct().collect(Collectors.toList());
        List<ColumnName> fieldNameModels = new ArrayList<>();
        for (String i : res) {
            ColumnName fieldNameModel = new ColumnName();
            if (outputTable != null) {
                fieldNameModel.setDbName(Optional.ofNullable(outputTable.getDbName()));
                fieldNameModel.setTableName(outputTable.getTableName());
            }
            fieldNameModel.setDbType(dbType);
            fieldNameModel.setFieldName(i);
            fieldNameModels.add(fieldNameModel);
        }
        return fieldNameModels;
    }

    private HashSet<ColumnName> sourceFields;
    private String fieldProcess = "";

    /**
     * 递归按每个字段从外到内寻找每个字段的来源
     * 逻辑为最外的字段别名，父id -> 匹配子id别名 ->
     * -> 如果是来源是表，存储，如果来源是子select，继续递归
     */
    private void findFieldSource(String targetField, String parentId) {
        hiveFieldSelectList.forEach(select -> {
            if ((parentId == null && select.getParentId() == null) ||
                    (select.getParentId() != null && select.getParentId().equals(parentId))) {
                if (select.getSelectItems() != null) {
                    if (select.getFromTable() == null) {
                        select.getSelectItems().forEach(selectItem -> {
                            if (selectItem.getAlias().equals(targetField)) {
                                if (selectItem.getProcess().length() > fieldProcess.length()) {
                                    fieldProcess = selectItem.getProcess();
                                }
                                for (String field : selectItem.getFieldNames()) {
                                    findFieldSource(field, select.getId());
                                }
                            }
                        });
                    } else {
                        select.getSelectItems().forEach(selectItem -> {
                            if (selectItem.getAlias().equals(targetField)) {
                                if (selectItem.getProcess().length() > fieldProcess.length()) {
                                    fieldProcess = selectItem.getProcess();
                                }
                                for (String field : selectItem.getFieldNames()) {
                                    ColumnName fieldNameWithProcessModel = new ColumnName();
                                    fieldNameWithProcessModel.setDbName(Optional.ofNullable(select.getFromTable().getDbName()));
                                    fieldNameWithProcessModel.setTableName(select.getFromTable().getTableName());
                                    fieldNameWithProcessModel.setFieldName(field);
                                    fieldNameWithProcessModel.setProcess(Optional.ofNullable(fieldProcess));
                                    fieldNameWithProcessModel.setDbType(dbType);
                                    sourceFields.add(fieldNameWithProcessModel);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    /**
     * 获取字段血缘列表
     */
    public List<ColumnLineage> getHiveFieldLineage() {
        transSelectToList();
        List<ColumnName> targetFields = getTargetFields();
        List<ColumnLineage> fieldLineageModelList = new ArrayList<>();
        for (ColumnName targetField : targetFields) {
            ColumnLineage columnLineage = new ColumnLineage();
            columnLineage.setTargetField(targetField);
            sourceFields = new HashSet<>();
            fieldProcess = "";
            findFieldSource(targetField.getFieldName(), null);
            columnLineage.setSourceFields(sourceFields);
            columnLineage.setRelationship(relationship);
            fieldLineageModelList.add(columnLineage);
        }
        return fieldLineageModelList;
    }

    /**
     * 获取sql解析处理后的结果
     */
    public HashMap<String, FieldLineageSelectModel> getHiveFieldSelects() {
        return hiveFieldSelects;
    }
}
