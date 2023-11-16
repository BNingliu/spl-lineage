package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class MergeData extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private final String tableName;
    private Optional<List> partitionVals;

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Optional<List> getPartitionVals() {
        return this.partitionVals;
    }

    public MergeData(Optional<String> catalogName, Optional<String> databaseName, String tableName, Optional<List> partitionVals) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.partitionVals = partitionVals;
    }

    @Override
    public String toString() {
        return "MergeData(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", partitionVals=" + this.partitionVals + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        return var1 + (this.partitionVals.isPresent() ? this.partitionVals.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof MergeData) {
                MergeData var2 = (MergeData)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.partitionVals.equals(var2.partitionVals)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}