package com.myxql.parser.hive.parser;

import com.alibaba.fastjson.JSONObject;
import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.hive.antlr4.HplsqlBaseVisitor;
import com.myxql.parser.hive.antlr4.HplsqlParser;
import com.myxql.parser.model.*;
import com.myxql.parser.plan.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.tuple.Pair;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

import static com.myxql.parser.hive.parser.HiveSQLTableLineageAstBuilder.getLocation;

public class HiveSQLFieldLineageAstBuilder extends HplsqlBaseVisitor<Statement> {
//    private Logger logger = LoggerFactory.getLogger(HiveSQLFieldLineageAstBuilder.class);
    private String command = null;
    private StatementType statementType;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    protected <T> T typedVisit (ParseTree ctx) {
        return (T) ctx.accept(this);
    }

    @Override
    public StatementLineage visitStmt(HplsqlParser.StmtContext ctx) {
//        if(ctx.stmt().size() > 1) {
//            throw HiveSQLFieldLineageAstBuilder.parseError("不支持多个SQL的block", ctx);
//        }
//        Statement data = visit(ctx.stmt(0));
        Statement data = super.visitStmt(ctx);
        if (data == null) {
            throw HiveSQLFieldLineageAstBuilder.parseError("不支持的SQL: ", ctx);
        }

        // SingleInsertQuery or MultiInsertQuery
//        InsertInto plan = (InsertInto) visit(ctx.statement());
//        logger.info("visitBlock, plan=" + JSONObject.toJSONString(data));
        PlanParser planParser = new PlanParser();
        TableData tableData = planParser.parseTableData((InsertInto) data);
        StatementLineage statementLineage = new StatementLineage(this.statementType, Optional.ofNullable(tableData), this.command);
        return statementLineage;
    }

    @Override
    public LogicalPlan visitInsert_stmt(HplsqlParser.Insert_stmtContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());

        List<String> cols = Optional.ofNullable(ctx.insert_stmt_cols())
                .map(HplsqlParser.Insert_stmt_colsContext::ident)
                .orElseGet(() -> {
                    return new ArrayList<>();
                }).stream().map(RuleContext::getText)
                .collect(Collectors.toList());
        Map<String, Optional<String>> partitions = Optional.ofNullable(ctx.partitionSpec())
                .map(this::parsePartitionSpec)
                .orElse(new HashMap<>());

        LogicalPlan query = this.visitSelect_stmt(ctx.select_stmt());
        // todo

        this.statementType = StatementType.INSERT_SELECT;
        LogicalPlan logicalPlan = new InsertIntoTable(
                getLocation(ctx),
                tableName,
                cols,
                partitions,
                query,
                ctx.T_OVERWRITE() != null,
                partitions.isEmpty());

        InsertInto insertInto = new InsertInto(getLocation(ctx), InsertInto.TARGET_TYPE_TABLE);
        insertInto.addInsertInto(logicalPlan);

        // ctes
        return Optional.ofNullable(ctx.cte_select_stmt())
                .map(cteCtx -> withCTE(ctx.cte_select_stmt(), insertInto))
                .orElse(insertInto);
//        return insertInto;
    }

    @Override
    public LogicalPlan visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        LogicalPlan fullSelect = this.typedVisit(ctx.fullselect_stmt());

        // ctes
        return Optional.ofNullable(ctx.cte_select_stmt())
                .map(cteCtx -> withCTE(ctx.cte_select_stmt(), fullSelect))
                .orElse(fullSelect);
    }

    @Override
    public LogicalPlan visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        QueryData from = Optional.ofNullable(ctx.from_clause())
                .map(this::visitFrom_clause)
                .orElse(null);
        List<HplsqlParser.Select_list_itemContext> selectItemContexts = Optional.ofNullable(ctx.select_list())
                .map(HplsqlParser.Select_listContext::select_list_item)
                .orElse(new ArrayList<>());

        List<SelectItem> selectItemList = selectItemContexts.stream()
                .map(this::parseSelectListItem)
                .collect(Collectors.toList());

//        Boolean isDistinct = ctx.qualify_clause() != null &&
//                ctx.setQuantifier().DISTINCT() != null;

        return withSelectClausePlan(from, selectItemList, ctx.where_clause(), ctx.group_by_clause(), ctx.having_clause(), false);
    }

    /**
     * union
     */
    @Override
    public LogicalPlan visitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx) {
        QueryData union = new QueryData(getLocation(ctx));
        for(HplsqlParser.Fullselect_stmt_itemContext item : ctx.fullselect_stmt_item()) {
            union.setIsUnion(true);
            LogicalPlan query = this.typedVisit(item);
            union.addChild(query);
        }
        return union;
    }

    /**
     * 别名表达式
     */
    private SelectItem parseSelectListItem(HplsqlParser.Select_list_itemContext ctx) {
        SelectItem selectItem = new SelectItem();
        selectItem.setFieldNames(new HashSet<>());
        // 处理别名
        String alias = Optional.ofNullable(ctx.select_list_alias())
                .map(HplsqlParser.Select_list_aliasContext::ident)
                .map(RuleContext::getText)
                .orElse(null);
        selectItem.setAlias(alias);
        // 处理*
        if(ctx.select_list_asterisk() == null) {
            // process
            Optional.ofNullable(ctx.expr())
                    .map(this::subSourceSql)
                    .ifPresent(selectItem::setProcess);
        } else {
            // process
            Optional.ofNullable(ctx.select_list_asterisk())
                    .map(this::subSourceSql)
                    .ifPresent(selectItem::setProcess);
            selectItem.getFieldNames().add("*");
        }
        // 如果没有别名，取表达式
        if(alias == null) {
            selectItem.setAlias(selectItem.getProcess());
        }
        Pair<String, String> pair = SelectItem.parseAlias(selectItem.getAlias());
        if(pair.getRight() != null) {
            selectItem.setAlias(pair.getRight());
            selectItem.setTableName(pair.getLeft());
        }

        // sourceFields
        Optional.ofNullable(ctx.expr())
                .ifPresent(exprContext -> {
                    this.parseSourceFields(exprContext, selectItem);
                });

        return selectItem;
    }

    private SelectItem parseSourceFields(HplsqlParser.ExprContext ctx, SelectItem selectItem) {
        for(HplsqlParser.ExprContext exprContext : ctx.expr()) {
            SelectItem tmpItem = this.parseSourceFields(exprContext, selectItem);
            selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
        }
        if(ctx.expr_agg_window_func() != null) {
            Optional.ofNullable(ctx.expr_agg_window_func())
                    .map(HplsqlParser.Expr_agg_window_funcContext::expr)
                    .map(exprContexts -> exprContexts.stream().map(exprContext -> {
                        SelectItem tmpItem = this.parseSourceFields(exprContext, selectItem);
                        selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
                        return selectItem;
                    }));
        }
        if(ctx.expr_case() != null) {
            SelectItem tmpCaseItem = this.parseExprCase(ctx.expr_case(), selectItem);
            selectItem.getFieldNames().addAll(tmpCaseItem.getFieldNames());
        }
        if(ctx.expr_concat() != null) {
            List<HplsqlParser.Expr_concat_itemContext> concatItemContexts = Optional.ofNullable(ctx.expr_concat())
                    .map(HplsqlParser.Expr_concatContext::expr_concat_item)
                    .orElse(new ArrayList<>());
            for (HplsqlParser.Expr_concat_itemContext concatItemContext : concatItemContexts) {
                if (concatItemContext.expr() != null) {
                    SelectItem tmpItem = this.parseSourceFields(concatItemContext.expr(), selectItem);
                    selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
                } else if (concatItemContext.expr_agg_window_func() != null) {
                    SelectItem tmpAggItem = this.parseExprAggWindowFunc(concatItemContext.expr_agg_window_func(), selectItem);
                    selectItem.getFieldNames().addAll(tmpAggItem.getFieldNames());
                } else if (concatItemContext.expr_case() != null) {
                    SelectItem caseItem = this.parseExprCase(concatItemContext.expr_case(), selectItem);
                    selectItem.getFieldNames().addAll(caseItem.getFieldNames());
                } else if (concatItemContext.expr_func() != null) {
                    this.parseExprFunc(concatItemContext.expr_func(), selectItem);
                } else if (concatItemContext.expr_spec_func() != null) {
                    this.parseExprSpecFunc(concatItemContext.expr_spec_func(), selectItem);
                } else if (concatItemContext.expr_atom() != null) {
                    System.out.println("expr_atom, ignore: expr=" + concatItemContext.expr_atom().getText());
                }
            }
        }

        if(ctx.expr_agg_window_func() != null) {
            SelectItem tmpAggItem = this.parseExprAggWindowFunc(ctx.expr_agg_window_func(), selectItem);
        }
        if(ctx.expr_spec_func() != null) {
            this.parseExprSpecFunc(ctx.expr_spec_func(), selectItem);
        }
        if(ctx.expr_func() != null) {
            this.parseExprFunc(ctx.expr_func(), selectItem);
        }
        if(ctx.expr_atom() != null) {
            String strExpr = ctx.expr_atom().getText();
            String strName = ModelHelper.dealNameMark(strExpr);
            Pair<String, String> pair = SelectItem.parseAlias(strName);
            if (pair.getRight() != null) {
                selectItem.getFieldNames().add(pair.getRight());
            } else {
                selectItem.getFieldNames().add(pair.getLeft());
            }
            // 处理常量
            if(ctx.expr_atom().ident() != null) {
                selectItem.setFieldType(SelectItem.FIELD_TYPE_FIELD);
            } else {
                selectItem.setFieldType(SelectItem.FIELD_TYPE_CONST);
            }
        }
        return selectItem;
    }

    private SelectItem parseExprCase(HplsqlParser.Expr_caseContext ctx, SelectItem selectItem) {
        Optional.ofNullable(ctx)
                .map(HplsqlParser.Expr_caseContext::expr_case_searched)
                .map(HplsqlParser.Expr_case_searchedContext::expr)
                .map(searchedContexts -> searchedContexts.stream().map(searchedContext -> {
                    SelectItem tmpItem = this.parseSourceFields(searchedContext, selectItem);
                    selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
                    return selectItem;
                }));

        Optional.ofNullable(ctx)
                .map(HplsqlParser.Expr_caseContext::expr_case_simple)
                .map(HplsqlParser.Expr_case_simpleContext::expr)
                .map(searchedContexts -> searchedContexts.stream().map(simpleContext -> {
                    SelectItem tmpItem = this.parseSourceFields(simpleContext, selectItem);
                    selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
                    return selectItem;
                }));
        return selectItem;
    }

    private SelectItem parseExprAggWindowFunc(HplsqlParser.Expr_agg_window_funcContext ctx, SelectItem selectItem) {
        List<HplsqlParser.ExprContext> funcContexts = ctx.expr();
        for(HplsqlParser.ExprContext funcContext : funcContexts) {
            SelectItem tmpItem = this.parseSourceFields(funcContext, selectItem);
            selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
        }
        return selectItem;
    }

    private SelectItem parseExprFunc(HplsqlParser.Expr_funcContext ctx, SelectItem selectItem) {
        Optional.ofNullable(ctx.expr_func_params())
                .map(HplsqlParser.Expr_func_paramsContext::func_param)
                .map(exprContexts -> exprContexts.stream()
                        .map(HplsqlParser.Func_paramContext::expr).map(exprContext -> {
                            SelectItem tmpItem = this.parseSourceFields(exprContext, selectItem);
                            selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
                            return selectItem;
                        })
                );
        return selectItem;
    }

    private SelectItem parseExprSpecFunc(HplsqlParser.Expr_spec_funcContext ctx, SelectItem selectItem) {
        for(HplsqlParser.ExprContext exprContext : ctx.expr()) {
            SelectItem tmpItem = this.parseSourceFields(exprContext, selectItem);
            selectItem.getFieldNames().addAll(tmpItem.getFieldNames());
        }
        return selectItem;
    }

    /**
     * fromClause, 支持多个关系
     */
    @Override
    public QueryData visitFrom_clause(HplsqlParser.From_clauseContext ctx) {
        QueryData from = new QueryData(getLocation(ctx));

        from = this.parseFromTableClause(ctx.from_table_clause(), from);
        for(HplsqlParser.From_join_clauseContext joinClauseContext : ctx.from_join_clause()) {
            from = this.parseFromTableClause(joinClauseContext.from_table_clause(), from);
        }
        return from;
    }

    private QueryData parseFromTableClause(HplsqlParser.From_table_clauseContext ctx, QueryData from) {
        Integer thisId = ctx.getStart().getStartIndex();
        if(ctx.from_table_name_clause() != null) {
            TableAlias tableAlias = this.visitFrom_table_name_clause(ctx.from_table_name_clause());
            String alias = tableAlias.getAlias().isPresent() ? tableAlias.getAlias().get() : null;
            FromTable fromTable = new FromTable(tableAlias.getTabledName(), alias);
            from.addFromTable(fromTable);
        } else if(ctx.from_subselect_clause() != null) {
            HplsqlParser.From_subselect_clauseContext subselectClauseContext = ctx.from_subselect_clause();
            // 子查询
            QueryData query = this.typedVisit(subselectClauseContext.select_stmt());
            query.setId(thisId+"");
            String alias = Optional.ofNullable(subselectClauseContext.from_alias_clause())
                    .map(RuleContext::getText)
                    .orElse(null);
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
            from.addSubquery(query);
        } else if(ctx.from_table_values_clause() != null) {
            HplsqlParser.From_table_values_clauseContext valuesClauseContext = ctx.from_table_values_clause();
            String alias = Optional.ofNullable(valuesClauseContext.from_alias_clause())
                    .map(RuleContext::getText)
                    .orElse(null);
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
//            from.addSubquery(query);
        }
        return from;
    }

    /**
     * 带别名的表名，如：from clauses
     */
    @Override
    public TableAlias visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx) {
        TableName tableName = Optional.ofNullable(ctx.table_name())
                .map(RuleContext::getText)
                .map(TableName::parseTableName)
                .orElse(null);
        Optional<String> alias = Optional.ofNullable(ctx.from_alias_clause())
                .map(HplsqlParser.From_alias_clauseContext::ident)
                .map(RuleContext::getText);

        TableAlias tableAlias = new TableAlias(tableName, alias);
        return tableAlias;
    }

    private LogicalPlan withSelectClausePlan(
            QueryData from,
            List<SelectItem> selectItems, // selectClause
            HplsqlParser.Where_clauseContext whereClause,
            HplsqlParser.Group_by_clauseContext groupByClause,
            HplsqlParser.Having_clauseContext havingClause,
            Boolean isDistinct) {

        // Add aggregation or a project.
        from.setSelectItems(selectItems);

        return from;
    }

    private LogicalPlan withCTE(HplsqlParser.Cte_select_stmtContext ctx, LogicalPlan plan) {
        for(HplsqlParser.Cte_select_stmt_itemContext nCtx : ctx.cte_select_stmt_item()) {
            QueryData query = this.typedVisit(nCtx.fullselect_stmt());
            String strName = nCtx.ident().getText();
            // Check for duplicate names.
            if(plan.containsCte(strName)) {
                throw HiveSQLFieldLineageAstBuilder.parseError("duplicateCteDefinitionNamesError." + strName, ctx);
            }
            plan.addCte(strName, query);
        }
        return plan;
    }

    private Map<String, Optional<String>> parsePartitionSpec(HplsqlParser.PartitionSpecContext ctx) {
        Map<String, Optional<String>> parts = ctx.partition_clause().stream().map(pVal -> {
            String name = pVal.ident().getText();
            String value = Optional.ofNullable(pVal.expr())
                    .map(RuleContext::getText)
                    .orElse(null);
            return Pair.of(name, value);
        }).collect(Collectors.toMap(p -> p.getKey(), p-> Optional.of(p.getValue())));

        return parts;
    }

    private String subSourceSql(ParserRuleContext parserRuleContext) {
        return this.command.substring(
                parserRuleContext.getStart().getStartIndex(),
                parserRuleContext.getStop().getStopIndex() + 1);
    }

    private static ParseException parseError(String message, ParserRuleContext context) {
        return new ParseException(message, getLocation(context.start), getLocation(context.stop));
    }

}
