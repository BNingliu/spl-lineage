package com.myxql.parser.model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public final class TableSource extends Statement {
    private ArrayList tokens;
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;

    public ArrayList getTokens() {
        return this.tokens;
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

    public void setDatabaseName(Optional<String> var1) {
        this.databaseName = var1;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String var1) {
        this.tableName = Objects.requireNonNull(var1, "tableName is null");
    }

    public TableSource(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.tokens = new ArrayList();
    }

    public TableSource(Optional<String> databaseName, String tableName) {
        this(Optional.empty(), databaseName, tableName);
    }

    @Override
    public String toString() {
        return "TableSource(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        return var1 + (this.tableName != null ? this.tableName.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof TableSource) {
                TableSource var2 = (TableSource)that;
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