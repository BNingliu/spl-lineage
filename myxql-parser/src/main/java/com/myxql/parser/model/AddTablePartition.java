package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class AddTablePartition extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private boolean ifNotExists;
    private List partitionSpecs;

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

    public boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public void setIfNotExists(boolean var1) {
        this.ifNotExists = var1;
    }

    public List getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public void setPartitionSpecs(List var1) {
        this.partitionSpecs = Objects.requireNonNull(var1, "partition list is null");
    }

    public AddTablePartition(Optional<String> catalogName, Optional<String> databaseName, String tableName, boolean ifNotExists, List partitionSpecs) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.ifNotExists = ifNotExists;
        this.partitionSpecs = Objects.requireNonNull(partitionSpecs, "partitionSpecs is null");
    }

    @Override
    public String toString() {
        return "AddTablePartition(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", ifNotExists=" + this.ifNotExists + ", partitionSpecs=" + this.partitionSpecs + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        int var2 = this.ifNotExists ? 1 : 0;
        var1 = (var1 + var2) * 31;
        return var1 + (this.partitionSpecs != null ? this.partitionSpecs.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof AddTablePartition) {
                AddTablePartition var2 = (AddTablePartition)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.ifNotExists == var2.ifNotExists
                        && this.partitionSpecs.equals( var2.partitionSpecs)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}