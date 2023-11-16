package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class DropTablePartition extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private boolean ifExists;
    private List partitionSpecs;

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

    public boolean getIfExists() {
        return this.ifExists;
    }

    public void setIfExists(boolean var1) {
        this.ifExists = var1;
    }

    public List getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public void setPartitionSpecs(List var1) {
        this.partitionSpecs = var1;
    }

    public DropTablePartition(Optional<String> catalogName, Optional<String> databaseName, String tableName, boolean ifExists, List partitionSpecs) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.ifExists = ifExists;
        this.partitionSpecs = Objects.requireNonNull(partitionSpecs, "partitionSpecs is null");
    }

    @Override
    public String toString() {
        return "DropTablePartition(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", ifExists=" + this.ifExists + ", partitionSpecs=" + this.partitionSpecs + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        int var2 = this.ifExists ? 1 : 0;
        var1 = (var1 + var2) * 31;
        List var3 = this.partitionSpecs;
        return var1 + (var3 != null ? var3.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof DropTablePartition) {
                DropTablePartition var2 = (DropTablePartition)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.ifExists == var2.ifExists
                        && this.partitionSpecs.equals(var2.partitionSpecs)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}