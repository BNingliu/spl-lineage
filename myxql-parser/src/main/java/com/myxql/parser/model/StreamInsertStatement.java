package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public class StreamInsertStatement extends Statement {
    private Optional<String> databaseName;
    private String tableName;
    private Optional<String> querySql;

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Optional<String> getQuerySql() {
        return this.querySql;
    }

    public void setQuerySql(Optional<String> var1) {
        this.querySql = var1;
    }

    public StreamInsertStatement(Optional<String> databaseName, String tableName, Optional<String> querySql) {
        super();
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.querySql = querySql;
    }

    @Override
    public String toString() {
        return "StreamInsertStatement(databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", querySql=" + this.querySql + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        return var1 + (this.querySql.isPresent() ? this.querySql.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof StreamInsertStatement) {
                StreamInsertStatement var2 = (StreamInsertStatement)that;
                if (this.databaseName.equals(var2.databaseName) && this.tableName.equals(var2.tableName)
                        && this.querySql.equals(var2.querySql)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}