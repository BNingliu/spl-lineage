package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class RefreshData extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public RefreshData(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
    }

    @Override
    public String toString() {
        return "RefreshData(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.hashCode() : 0)) * 31;
        return var1 + (this.tableName != null ? this.tableName.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof RefreshData) {
                RefreshData var2 = (RefreshData)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}