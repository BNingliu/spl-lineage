package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class CreateTableLike extends Statement {
    private Optional<String> oldDatabaseName;
    private Optional<String> oldTableName;
    private Optional<String> newDatabaseName;
    private String newTableName;
    private boolean ifNotExists;
    private boolean external;
    private boolean temporary;

    public Optional<String> getOldDatabaseName() {
        return this.oldDatabaseName;
    }

    public Optional<String> getOldTableName() {
        return this.oldTableName;
    }

    public Optional<String> getNewDatabaseName() {
        return this.newDatabaseName;
    }

    public String getNewTableName() {
        return this.newTableName;
    }

    public boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public void setIfNotExists(boolean var1) {
        this.ifNotExists = var1;
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

    public CreateTableLike(Optional<String> oldDatabaseName, Optional<String> oldTableName, Optional<String> newDatabaseName, String newTableName, boolean ifNotExists, boolean external, boolean temporary) {
        super();
        this.oldDatabaseName = oldDatabaseName;
        this.oldTableName = oldTableName;
        this.newDatabaseName = newDatabaseName;
        this.newTableName = Objects.requireNonNull(newTableName, "newTableName is null");
        this.ifNotExists = ifNotExists;
        this.external = external;
        this.temporary = temporary;
    }

    public CreateTableLike(Optional<String> oldDatabaseName, Optional<String> oldTableName, Optional<String> newDatabaseName, String newTableName) {
        this(oldDatabaseName, oldTableName, newDatabaseName, newTableName, false, false, false);
    }

    @Override
    public String toString() {
        return "CreateTableLike(oldDatabaseName=" + this.oldDatabaseName + ", oldTableName=" + this.oldTableName + ", newDatabaseName=" + this.newDatabaseName + ", newTableName=" + this.newTableName + ", ifNotExists=" + this.ifNotExists + ", external=" + this.external + ", temporary=" + this.temporary + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.oldDatabaseName.isPresent() ? this.oldDatabaseName.hashCode() : 0) * 31;
        var1 = (var1 + (this.oldTableName.isPresent() ? this.oldTableName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.newDatabaseName.isPresent() ? this.newDatabaseName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.newTableName != null ? this.newTableName.hashCode() : 0)) * 31;
        int var2 = this.ifNotExists ? 11 : 0;
        var1 = (var1 + var2) * 31;
        var2 = this.external ? 11 : 0;
        var1 = (var1 + var2) * 31;
        var2 = this.temporary ? 11 : 0;

        return var1 + var2;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof CreateTableLike) {
                CreateTableLike var2 = (CreateTableLike)that;
                if (this.oldDatabaseName.equals(var2.oldDatabaseName) && this.oldTableName.equals(var2.oldTableName)
                        && this.newDatabaseName.equals(var2.newDatabaseName) && this.newTableName.equals(var2.newTableName)
                        && this.ifNotExists == var2.ifNotExists && this.external == var2.external
                        && this.temporary == var2.temporary) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}