package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TouchTable extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
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

    public List getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public void setPartitionSpecs(List var1) {
        this.partitionSpecs = var1;
    }

    public TouchTable(Optional<String> catalogName, Optional<String> databaseName, String tableName, List partitionSpecs) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.partitionSpecs = Objects.requireNonNull(partitionSpecs, "partitionSpecs is null");
    }

    @Override
    public String toString() {
        return "TouchTable(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", partitionSpecs=" + this.partitionSpecs + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        return var1 + (this.partitionSpecs != null ? this.partitionSpecs.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof TouchTable) {
                TouchTable var2 = (TouchTable)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.partitionSpecs.equals(var2.partitionSpecs)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}