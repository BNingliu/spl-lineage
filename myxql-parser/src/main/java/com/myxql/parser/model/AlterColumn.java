package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class AlterColumn extends Statement {
    private Optional<CommonToken> token;
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<AlterColumnAction> action;

    public String getFullTableName() {
        return ModelHelper.innerFullTableName(this.catalogName, this.databaseName, this.tableName);
    }

    public Optional<CommonToken> getToken() {
        return this.token;
    }

    public void setToken(Optional<CommonToken> commonToken) {
        this.token = commonToken;
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

    public Optional<AlterColumnAction> getAction() {
        return this.action;
    }

    public AlterColumn(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<AlterColumnAction> action) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.action = action;
    }

    public AlterColumn(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        this(catalogName, databaseName, tableName, Optional.empty());
    }

    public AlterColumn(Optional<String> databaseName, String tableName) {
        this(Optional.empty(), databaseName, tableName, Optional.empty());
    }

    @Override
    public String toString() {
        return "AlterColumn(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", action=" + this.action + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.hashCode() : 0)) * 31;
        return var1 + (this.action.isPresent() ? this.action.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof AlterColumn) {
                AlterColumn var2 = (AlterColumn)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.action.equals(var2.action)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}