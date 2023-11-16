package com.myxql.parser.model;

import java.util.*;

public class View extends Statement {
    private HashSet functionNames;
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private Optional<String> querySql;
    private Optional<String> comment;
    private boolean ifNotExists;
    private boolean ifExists;
    private Map<String, String> properties;

    public HashSet getFunctionNames() {
        return this.functionNames;
    }

    public void setFunctionNames(HashSet var1) {
        this.functionNames = var1;
    }

    public final String getFullTableName() {
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

    public Optional<String> getQuerySql() {
        return this.querySql;
    }

    public void setQuerySql(Optional<String> var1) {
        this.querySql = var1;
    }

    public Optional<String> getComment() {
        return this.comment;
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

    public View(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> querySql, Optional<String> comment, boolean ifNotExists, boolean ifExists, Map<String, String> properties) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.querySql = querySql;
        this.comment = comment;
        this.ifNotExists = ifNotExists;
        this.ifExists = ifExists;
        this.properties = properties;
        this.functionNames = new HashSet();
    }

    public View(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<String> querySql, Optional<String> comment, boolean ifNotExists, boolean ifExists) {
        this(catalogName, databaseName, tableName, querySql, comment, ifNotExists, ifExists, new HashMap<>());
    }

    public View(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        this(catalogName, databaseName, tableName, Optional.empty(), Optional.empty(), false, false, new HashMap<>());
    }

    @Override
    public String toString() {
        return "View(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", querySql=" + this.querySql + ", comment=" + this.comment + ", ifNotExists=" + this.ifNotExists + ", ifExists=" + this.ifExists + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.querySql.isPresent() ? this.querySql.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.comment.isPresent() ? this.comment.get().hashCode() : 0)) * 31;
        int var2 = this.ifNotExists ? 1 : 0;
        var1 = (var1 + var2) * 31;
        var2 = this.ifExists ? 1 : 0;
        return var1 + var2;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof View) {
                View var2 = (View)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.querySql.equals(var2.querySql)
                        && this.comment.equals(var2.comment) && this.ifNotExists == var2.ifNotExists
                        && this.ifExists == var2.ifExists) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}