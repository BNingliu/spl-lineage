package com.myxql.parser.plan;

import com.alibaba.fastjson.JSONObject;
import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.ColumnName;
import com.myxql.parser.model.SelectItem;
import com.myxql.parser.model.TableData;
import org.apache.commons.lang3.tuple.Pair;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.*;

public class PlanParser {
//    private Logger logger = LoggerFactory.getLogger(PlanParser.class);

    private Boolean hasCtes = false;
    private Map<String, LogicalPlan> ctes;

    /**
     * 解析字段血缘列表
     */
    public TableData parseTableData(InsertInto insertInto) {
        // 获取ctes
        this.hasCtes = insertInto.hasCtes();
        this.ctes = insertInto.getCtes();

        List<ColumnLineage> resultList = new ArrayList<>();
        for(LogicalPlan logicalPlan : insertInto.getInsertIntos()) {
            if(insertInto.getTargetType().equals(InsertInto.TARGET_TYPE_TABLE)) {
                List<ColumnLineage> retList = this.parseSingleInsertTable((InsertIntoTable) logicalPlan);
                resultList.addAll(retList);
            } else {
                System.out.println("unsupport into dir statement");
            }
        }

        TableData tableData = new TableData();
        tableData.setColumnDatas(Optional.ofNullable(resultList));
        return tableData;
    }

    private List<ColumnLineage> parseSingleInsertTable(InsertIntoTable insertIntoTable) {
        List<ColumnLineage> targetColumnList = new ArrayList<>();
        QueryData queryData = ((QueryData) insertIntoTable.getQuery());
        List<ColumnName> columnNameList= this.getTargetColumnList(queryData);

        if(queryData.getIsUnion()) {
            for(int idx = 0; idx < columnNameList.size(); idx++) {
                ColumnName targetColumnName = columnNameList.get(idx);
                List<Pair<SelectItem, QueryData>> sourceItems = new ArrayList<>();
                for(LogicalPlan plan : queryData.getChildren()) {
                    QueryData planData = (QueryData) plan;

                    SelectItem selectItem = planData.getSelectItems().get(idx);
                    sourceItems.add(Pair.of(selectItem, planData));
                }
                targetColumnName.setDbName(insertIntoTable.getTableName().getDatabaseName());
                targetColumnName.setTableName(insertIntoTable.getTableName().getTableName());
                ColumnLineage columnLineage = new ColumnLineage();
                columnLineage.setTargetField(targetColumnName);
                Set<ColumnName> sourceFields = new HashSet<>();
                for(Pair<SelectItem, QueryData> itemPair : sourceItems) {
                    SelectItem item = itemPair.getLeft();
                    if(item.getFieldType().equals(SelectItem.FIELD_TYPE_CONST))
                        continue;
                    this.sourceFieldResult = new SourceFieldResult();

                    this.findFieldSource(item.getAlias(), itemPair.getRight());
                    sourceFields.addAll(this.sourceFieldResult.getSourceFields());
                }
                columnLineage.setSourceFields(sourceFields);
                targetColumnList.add(columnLineage);
            }
        } else {
            columnNameList.forEach(columnName -> {
                ColumnLineage columnLineage = new ColumnLineage();
                ColumnName targetColumnName = new ColumnName();
                targetColumnName.setDbName(insertIntoTable.getTableName().getDatabaseName());
                targetColumnName.setTableName(insertIntoTable.getTableName().getTableName());
                targetColumnName.setFieldName(columnName.getFieldName());
                columnLineage.setTargetField(targetColumnName);

                this.sourceFieldResult = new SourceFieldResult();
                this.findFieldSource(targetColumnName.getFieldName(), queryData);
                columnLineage.setSourceFields(this.sourceFieldResult.getSourceFields());

                targetColumnList.add(columnLineage);
            });
        }

        // 指定了插入字段
        List<ColumnLineage> resultList = new ArrayList<>();
        for(int idx = 0; idx < insertIntoTable.getUserSpecifiedCols().size(); idx++) {
            String colName = insertIntoTable.getUserSpecifiedCols().get(idx);
            ColumnName targetColumnName = new ColumnName();
            targetColumnName.setDbName(insertIntoTable.getTableName().getDatabaseName());
            targetColumnName.setTableName(insertIntoTable.getTableName().getTableName());
            targetColumnName.setFieldName(colName);
            ColumnLineage columnLineage = new ColumnLineage();
            columnLineage.setTargetField(targetColumnName);
            columnLineage.setSourceFields(targetColumnList.get(idx).getSourceFields());
            resultList.add(columnLineage);
        }

        if(resultList.isEmpty()) {
            resultList.addAll(targetColumnList);
        }

//        logger.info("resultList=" + JSONObject.toJSONString(resultList));
        return resultList;
    }

    // parent==null 表示是root
    private SourceFieldResult findFieldSource(String targetField, QueryData parent) {
        if(parent.getIsUnion() && parent.hasChildren()) {
            parent.getChildren().forEach(logicalPlan -> {
                QueryData queryData = ((QueryData) logicalPlan);
                findFieldSource(targetField, queryData);
            });
        } else {
            parent.getSelectItems().forEach(selectItem -> {
                if (selectItem.getAlias().equals(targetField)) {
                    if (selectItem.getProcess().length() > this.sourceFieldResult.getFieldProcess().length()) {
                        this.sourceFieldResult.setFieldProcess(selectItem.getProcess());
                    }
                    for (String field : selectItem.getFieldNames()) {
                        if (parent.hasChildren()) {
                            parent.getChildren().forEach(logicalPlan -> {
                                QueryData queryData = ((QueryData) logicalPlan);
                                findFieldSource(field, queryData);
                            });
                        } else {
                            ColumnName fieldName = new ColumnName();
                            fieldName.setFieldName(field);
                            fieldName.setProcess(Optional.of(sourceFieldResult.getFieldProcess()));

                            // 设置字段所属表名、库名
                            QueryData cteQueryData = null;
                            for(FromTable fromTable : parent.getFromTables()) {
                                // 子查询为空
                                if (fromTable.getFromTable() != null) {
                                    if(selectItem.getTableName() != null) {
                                        if(selectItem.getTableName().equals(fromTable.getTableAlias())
                                                || selectItem.getTableName().equals(fromTable.getFromTable().getTableName())) {
                                            fieldName.setDbName(fromTable.getFromTable().getDatabaseName());
                                            fieldName.setTableName(fromTable.getFromTable().getTableName());
                                        }
                                    } else if(parent.getFromTables().size() == 1){
                                        fieldName.setDbName(fromTable.getFromTable().getDatabaseName());
                                        fieldName.setTableName(fromTable.getFromTable().getTableName());
                                    }
                                } else {
                                    fieldName.setTableName(fromTable.getTableAlias());
                                }
                                // ctes
                                if(this.hasCtes) {
                                    cteQueryData = (QueryData) this.ctes.get(fieldName.getTableName());
                                    if(cteQueryData != null) {
                                        findFieldSource(targetField, cteQueryData);
                                    }
                                }
                            }
                            if(this.hasCtes && cteQueryData == null)
                                sourceFieldResult.getSourceFields().add(fieldName);
                            else if(!this.hasCtes) {
                                sourceFieldResult.getSourceFields().add(fieldName);
                            }
                        }
                    }

                }
            });

        }
        return this.sourceFieldResult;
    }

    /**
     * 获取SQL输出的目标字段, 通常有多个
     * 也就是parentId为null的最外层select的字段别名
     */
    private List<ColumnName> getTargetColumnList(QueryData queryData) {
        List<ColumnName> targetColumnList = new ArrayList<>();
        if(queryData.getIsUnion()) {
            QueryData query = (QueryData) queryData.getChildren().get(0);
            for(int itemIdx = 0; itemIdx < query.getSelectItems().size(); itemIdx++) {
                SelectItem tmpSelectItem = query.getSelectItems().get(itemIdx);
                // 取第一个child作为target
                ColumnName columnName = new ColumnName();
                columnName.setFieldName(tmpSelectItem.getAlias());
                targetColumnList.add(columnName);
            }
        } else {
            queryData.getSelectItems().forEach(selectItem -> {
                ColumnName columnName = new ColumnName();
                columnName.setFieldName(selectItem.getAlias());
                targetColumnList.add(columnName);
            });
        }
        return targetColumnList;
    }

    private SourceFieldResult sourceFieldResult;

    private class SourceFieldResult {
        private HashSet<ColumnName> sourceFields = new HashSet<>();
        private String fieldProcess = "";

        public HashSet<ColumnName> getSourceFields() {
            return sourceFields;
        }

        public void setSourceFields(HashSet<ColumnName> sourceFields) {
            this.sourceFields = sourceFields;
        }

        public String getFieldProcess() {
            return fieldProcess;
        }

        public void setFieldProcess(String fieldProcess) {
            this.fieldProcess = fieldProcess;
        }
    }
}