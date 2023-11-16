package com.myxql.parser.model;

import java.util.*;

public final class Table extends Statement {
    private String createTableType;
    private Optional<CommonToken> token;
    private List hudiPrimaryKeys;
    private String hudiType;
    private String preCombineField;
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<String> comment;
    private Optional<Integer> lifeCycle;
    private Optional<List> partitionColumns;
    private Optional<List<Column>> columns;
    private Optional<Map<String, String>> properties;
    private Optional<String> fileFormat;
    private boolean ifNotExists;
    private boolean ifExists;
    private boolean external;
    private boolean temporary;
    private boolean location;
    private Optional<String> locationPath;
    private Optional<String> querySql;
    private Optional<TableData> tableData;
    private Optional<List> partitionColumnNames;
    private boolean isView = false;

    public String getCreateTableType() {
        return this.createTableType;
    }

    public void setCreateTableType(String var1) {
        this.createTableType = var1;
    }

    public Optional<CommonToken> getToken() {
        return this.token;
    }

    public void setToken(Optional<CommonToken> var1) {
        this.token = var1;
    }

    public List getHudiPrimaryKeys() {
        return this.hudiPrimaryKeys;
    }

    public void setHudiPrimaryKeys(List var1) {
        this.hudiPrimaryKeys = var1;
    }

    public String getHudiType() {
        return this.hudiType;
    }

    public void setHudiType(String var1) {
        this.hudiType = var1;
    }

    public String getPreCombineField() {
        return this.preCombineField;
    }

    public void setPreCombineField(String var1) {
        this.preCombineField = var1;
    }

    public String getFullTableName() {
        return ModelHelper.innerFullTableName(this.catalogName, this.databaseName, this.tableName);
    }

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Optional<String> getComment() {
        return this.comment;
    }

    public Optional<Integer> getLifeCycle() {
        return this.lifeCycle;
    }

    public void setLifeCycle(Optional<Integer> var1) {
        this.lifeCycle = var1;
    }

    public Optional<List> getPartitionColumns() {
        return this.partitionColumns;
    }

    public void setPartitionColumns(Optional<List> var1) {
        this.partitionColumns = var1;
    }

    public Optional<List<Column>> getColumns() {
        return this.columns;
    }

    public void setColumns(Optional<List<Column>> var1) {
        this.columns = var1;
    }

    public Optional<Map<String, String>> getProperties() {
        return this.properties;
    }

    public void setProperties(Optional<Map<String, String>> var1) {
        this.properties = var1;
    }

    public Optional<String> getFileFormat() {
        return this.fileFormat;
    }

    public void setFileFormat(Optional<String> var1) {
        this.fileFormat = var1;
    }

    public boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public void setIfNotExists(boolean var1) {
        this.ifNotExists = var1;
    }

    public boolean getIfExists() {
        return this.ifExists;
    }

    public void setIfExists(boolean var1) {
        this.ifExists = var1;
    }

    public boolean getExternal() {
        return this.external;
    }

    public void setExternal(boolean var1) {
        this.external = var1;
    }

    public boolean getTemporary() {
        return this.temporary;
    }

    public void setTemporary(boolean var1) {
        this.temporary = var1;
    }

    public boolean getLocation() {
        return this.location;
    }

    public void setLocation(boolean var1) {
        this.location = var1;
    }

    public Optional<String> getLocationPath() {
        return this.locationPath;
    }

    public void setLocationPath(Optional<String> var1) {
        this.locationPath = var1;
    }

    public Optional<String> getQuerySql() {
        return this.querySql;
    }

    public void setQuerySql(Optional<String> var1) {
        this.querySql = var1;
    }

    public Optional<TableData> getTableData() {
        return this.tableData;
    }

    public void setTableData(Optional<TableData> var1) {
        this.tableData = var1;
    }

    public Optional<List> getPartitionColumnNames() {
        return this.partitionColumnNames;
    }

    public void setPartitionColumnNames(Optional<List> var1) {
        this.partitionColumnNames = var1;
    }

    public boolean isView() {
        return isView;
    }

    public void setView(boolean view) {
        isView = view;
    }

    public Table(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> comment, Optional<Integer> lifeCycle,
                 Optional<List> partitionColumns, Optional<List<Column>> columns, Optional<Map<String, String>> properties, Optional<String> fileFormat, boolean ifNotExists,
                 boolean ifExists, boolean external, boolean temporary, boolean location, Optional<String> locationPath, Optional<String> querySql,
                 Optional<TableData> tableData, Optional<List> partitionColumnNames) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.comment = comment;
        this.lifeCycle = lifeCycle;
        this.partitionColumns = partitionColumns;
        this.columns = columns;
        this.properties = properties;
        this.fileFormat = fileFormat;
        this.ifNotExists = ifNotExists;
        this.ifExists = ifExists;
        this.external = external;
        this.temporary = temporary;
        this.location = location;
        this.locationPath = locationPath;
        this.querySql = querySql;
        this.tableData = tableData;
        this.partitionColumnNames = partitionColumnNames;
        this.createTableType = "hive";
        boolean var19 = false;
        this.hudiPrimaryKeys = new ArrayList();
        this.hudiType = "COW";
        this.preCombineField = "";
    }

    public Table(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> comment,
                 Optional<Integer> lifeCycle, Optional<List> partitionColumns, Optional<List<Column>> columns, Optional<Map<String, String>> properties, Optional<String> fileFormat) {
        this(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat, false, false, false, false, false, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Table(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> comment,
                 Optional<Integer> lifeCycle, Optional<List> partitionColumns, Optional<List<Column>> columns) {
        this(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, Optional.empty(), Optional.empty(), false, false, false, false, false, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public Table(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        this(catalogName, databaseName, tableName, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
                Optional.empty(), false, false, false, false, false,
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @Override
    public String toString() {
        return "Table(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", comment=" + this.comment + ", lifeCycle=" + this.lifeCycle + ", partitionColumns=" + this.partitionColumns + ", columns=" + this.columns + ", properties=" + this.properties + ", fileFormat=" + this.fileFormat + ", ifNotExists=" + this.ifNotExists + ", ifExists=" + this.ifExists + ", external=" + this.external + ", temporary=" + this.temporary + ", location=" + this.location + ", locationPath=" + this.locationPath + ", querySql=" + this.querySql + ", tableData=" + this.tableData + ", partitionColumnNames=" + this.partitionColumnNames + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.comment.isPresent() ? this.comment.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.lifeCycle.isPresent() ? this.lifeCycle.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.partitionColumns.isPresent() ? this.partitionColumns.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.columns.isPresent() ? this.columns.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.properties.isPresent() ? this.properties.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.fileFormat.isPresent() ? this.fileFormat.get().hashCode() : 0)) * 31;
        int var5 = this.ifNotExists ? 1 : 0;
        var1 = (var1 + var5) * 31;
        var5 = this.ifExists ? 1 : 0;
        var1 = (var1 + var5) * 31;
        var5 = this.external ? 1: 0;
        var1 = (var1 + var5) * 31;
        var5 = this.temporary ? 1 : 0;
        var1 = (var1 + var5) * 31;
        var5 = this.location ? 1 : 0;
        var1 = (var1 + var5) * 31;
        var1 = (var1 + (this.locationPath.isPresent() ? this.locationPath.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.querySql.isPresent() ? this.querySql.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableData.isPresent() ? this.tableData.get().hashCode() : 0)) * 31;
        return var1 + (this.partitionColumnNames.isPresent() ? this.partitionColumnNames.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof Table) {
                Table var2 = (Table)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.comment.equals(var2.comment)
                        && this.lifeCycle.equals(var2.lifeCycle) && this.partitionColumns.equals(var2.partitionColumns)
                        && this.columns.equals(var2.columns) && this.properties.equals(var2.properties)
                        && this.fileFormat.equals(var2.fileFormat) && this.ifNotExists == var2.ifNotExists
                        && this.ifExists == var2.ifExists && this.external == var2.external && this.temporary == var2.temporary
                        && this.location == var2.location && this.locationPath.equals(var2.locationPath)
                        && this.querySql.equals(var2.querySql) && this.tableData.equals(var2.tableData)
                        && this.partitionColumnNames.equals(var2.partitionColumnNames)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}