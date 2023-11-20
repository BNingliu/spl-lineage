package com.myxql.parser.model;

import lombok.Data;

import java.util.Objects;
import java.util.Optional;
@Data
public class TableName {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<String> metaType;
    private Integer dbType;

    public TableName(
            Optional<String> catalogName,
            Optional<String> databaseName,
            String tableName,
            Optional<String> metaType,
            Integer dbType
    ) {
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.metaType = metaType;
        this.dbType=dbType;
    }

    public TableName(
            Optional<String> catalogName,
            Optional<String> databaseName,
            String tableName,
            Optional<String> metaType
    ) {
        this(Optional.empty(), databaseName, tableName, metaType,0);
    }

    public TableName(Optional<String> databaseName, String tableName, Optional<String> metaType) {
        this(Optional.empty(), databaseName, tableName, metaType);
    }

    public TableName(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        this(catalogName, databaseName, tableName, Optional.empty());
    }

    public TableName(Optional<String> catalogName, Optional<String> databaseName, String tableName,Integer dbType) {
        this(catalogName, databaseName, tableName, Optional.empty(),dbType);
    }

    public TableName(Optional<String> databaseName, String tableName) {
        this(Optional.empty(), databaseName, tableName, Optional.empty());
    }

    public TableName(String tableName) {
        this(Optional.empty(), Optional.empty(), tableName, Optional.empty());
    }

    public TableName() {
        this(Optional.empty(), Optional.empty(), null, Optional.empty());
    }

    public final String getFullTableName() {
        if (this.catalogName.isPresent()) {
            return this.catalogName.get() + '.' + this.databaseName.get() + '.' + this.tableName;
        } else {
            return this.databaseName.isPresent() ? this.databaseName.get() + '.' + this.tableName : this.tableName;
        }
    }

    public final Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = Optional.ofNullable(catalogName);
    }

    public final Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = Optional.ofNullable(databaseName);
    }

    public final String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public final Optional<String> getMetaType() {
        return this.metaType;
    }
/*
    public static String dealNameMark(String name) {
        if(name.startsWith("`") && name.endsWith("`")) {
            return name.substring(1, name.length()-1);
        }else{
            return name;
        }
    }
*/
    public static TableName parseTableName(String names) {
        return parseTableName(names,0);
    }

    public static TableName parseTableName(String names,Integer dbType) {
        TableName tableName = new TableName();
        String[] splitTable = names.split("\\.");
        if(splitTable.length == 2) {
            tableName.setDatabaseName(ModelHelper.dealNameMark(splitTable[0]));
            tableName.setTableName(ModelHelper.dealNameMark(splitTable[1]));
        } else if(splitTable.length == 1) {
            tableName.setTableName(ModelHelper.dealNameMark(splitTable[0]));
        } else if(splitTable.length == 3) {
            tableName.setCatalogName(ModelHelper.dealNameMark(splitTable[0]));
            tableName.setDatabaseName(ModelHelper.dealNameMark(splitTable[1]));
            tableName.setTableName(ModelHelper.dealNameMark(splitTable[2]));
        }
        tableName.setDbType(dbType);
        return tableName;
    }

    @Override
    public String toString() {
        return "TableName(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", metaType=" + this.metaType + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.catalogName, this.databaseName, this.tableName);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof TableName) {
                TableName var2 = (TableName)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName) && this.tableName.equals(var2.tableName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}


