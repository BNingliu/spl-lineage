package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public class ColumnName {
    private Optional<String> dbName;

    private  Integer dbType;
    private String tableName;
    private String fieldName;
    private Optional<String> process;

    public ColumnName() {
    }

    public Integer getDbType() {
        return dbType;
    }

    public void setDbType(Integer dbType) {
        this.dbType = dbType;
    }

    public ColumnName(Optional<String> dbName, String tableName, String fieldName, Optional<String> process) {
        this.dbName = dbName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.fieldName = Objects.requireNonNull(fieldName, "fieldName is null");
        this.process = process;
    }

    public ColumnName(String tableName, String fieldName, Optional<String> process) {
        this(Optional.empty(), tableName, fieldName, process);
    }

    public ColumnName(String tableName, String fieldName) {
        this(Optional.empty(), tableName, fieldName, Optional.empty());
    }


    public Optional<String> getDbName() {
        return dbName;
    }

    public void setDbName(Optional<String> dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Optional<String> getProcess() {
        return process;
    }

    public void setProcess(Optional<String> process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "ColumnName(dbName=" + this.dbName + ", tableName=" + this.tableName + ", fieldName=" + this.fieldName + ", process=" + this.process +")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.dbName, this.tableName, this.fieldName);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof ColumnName) {
                ColumnName var2 = (ColumnName)that;
                if (this.dbName.equals(var2.dbName) && this.tableName.equals(var2.tableName) && this.fieldName.equals(var2.fieldName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
