package com.myxql.parser.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class StreamTable extends Statement {
    private String tableName;
    private List columns;
    private Map properties;

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String var1) {
        this.tableName = var1;
    }

    public List getColumns() {
        return this.columns;
    }

    public void setColumns(List var1) {
        this.columns = var1;
    }

    public Map getProperties() {
        return this.properties;
    }

    public void setProperties(Map var1) {
        this.properties = var1;
    }

    public StreamTable(String tableName, List columns, Map properties) {
        super();
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.columns = Objects.requireNonNull(columns, "columns is null");
        this.properties = Objects.requireNonNull(properties, "properties is null");
    }

    @Override
    public String toString() {
        return "StreamTable(tableName=" + this.tableName + ", columns=" + this.columns + ", properties=" + this.properties + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.tableName != null ? this.tableName.hashCode() : 0) * 31;
        var1 = (var1 + (this.columns != null ? this.columns.hashCode() : 0)) * 31;
        return var1 + (this.properties != null ? this.properties.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }

        if (this != that) {
            if (that instanceof StreamTable) {
                StreamTable var2 = (StreamTable)that;
                if (this.tableName.equals(var2.tableName) && this.columns.equals(var2.columns)
                        && this.properties.equals(var2.properties)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}