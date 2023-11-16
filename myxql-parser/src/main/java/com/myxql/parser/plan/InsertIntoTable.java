package com.myxql.parser.plan;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.model.TableName;

import java.util.*;

public class InsertIntoTable extends LogicalPlan {
    private TableName tableName;
    private List<String> userSpecifiedCols = new ArrayList<>();
    private Map<String, Optional<String>> partitionSpec;
    private LogicalPlan query;
    private Boolean overwrite;
    private Boolean ifPartitionNotExists;

    public InsertIntoTable(Origin location, TableName tableName,
                           List<String> cols, Map<String, Optional<String>> partitionKeys,
                           LogicalPlan query, Boolean overwrite, Boolean exists) {
        super(Optional.of(location));
        this.tableName = tableName;
        this.userSpecifiedCols = cols;
        this.partitionSpec = partitionKeys;
        this.query = query;
        this.overwrite = overwrite;
        this.ifPartitionNotExists = exists;
    }

    public TableName getTableName() {
        return tableName;
    }

    public void setTableName(TableName tableName) {
        this.tableName = tableName;
    }

    public List<String> getUserSpecifiedCols() {
        return userSpecifiedCols;
    }

    public void setUserSpecifiedCols(List<String> userSpecifiedCols) {
        this.userSpecifiedCols = userSpecifiedCols;
    }

    public Map<String, Optional<String>> getPartitionSpec() {
        return partitionSpec;
    }

    public void setPartitionSpec(Map<String, Optional<String>> partitionSpec) {
        this.partitionSpec = partitionSpec;
    }

    public LogicalPlan getQuery() {
        return query;
    }

    public void setQuery(LogicalPlan query) {
        this.query = query;
    }

    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public Boolean getIfPartitionNotExists() {
        return ifPartitionNotExists;
    }

    public void setIfPartitionNotExists(Boolean ifPartitionNotExists) {
        this.ifPartitionNotExists = ifPartitionNotExists;
    }
}
