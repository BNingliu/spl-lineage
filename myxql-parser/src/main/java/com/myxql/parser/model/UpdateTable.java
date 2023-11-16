package com.myxql.parser.model;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class UpdateTable extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<Map> upset;
    private Optional<String> where;

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

    public Optional<Map> getUpset() {
        return this.upset;
    }

    public Optional<String> getWhere() {
        return this.where;
    }

    public UpdateTable(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<Map> upset, Optional<String> where) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.upset = upset;
        this.where = where;
    }

    @Override
    public String toString() {
        return "UpdateTable(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", upset=" + this.upset + ", where=" + this.where + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.upset.isPresent() ? this.upset.get().hashCode() : 0)) * 31;
        return var1 + (this.where.isPresent() ? this.where.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof UpdateTable) {
                UpdateTable var2 = (UpdateTable)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.upset.equals(var2.upset)
                        && this.where.equals(var2.where)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}