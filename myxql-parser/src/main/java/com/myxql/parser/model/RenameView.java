package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class RenameView extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private final String oldName;
    private final String newName;

    public String getFullTableName() {
        return ModelHelper.innerFullTableName(this.catalogName, this.databaseName, this.oldName);
    }

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public String getOldName() {
        return this.oldName;
    }

    public String getNewName() {
        return this.newName;
    }

    public RenameView(Optional<String> catalogName, Optional<String> databaseName, String oldName, String newName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.oldName = Objects.requireNonNull(oldName, "oldName is null");
        this.newName = Objects.requireNonNull(newName, "newName is null");
    }

    @Override
    public String toString() {
        return "RenameView(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", oldName=" + this.oldName + ", newName=" + this.newName + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.oldName != null ? this.oldName.hashCode() : 0)) * 31;
        return var1 + (this.newName != null ? this.newName.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof RenameView) {
                RenameView var2 = (RenameView)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.oldName.equals(var2.oldName) && this.newName.equals(var2.newName)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}