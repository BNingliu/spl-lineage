package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class SyncTableExpr extends Statement {
    private Optional<String> targetCatalog;
    private Optional<String> targetSchema;
    private String targetTable;
    private Optional<String> sourceCatalog;
    private Optional<String> sourceSchema;
    private String sourceTable;
    private Optional<String> owner;

    public Optional<String> getTargetCatalog() {
        return this.targetCatalog;
    }

    public Optional<String> getTargetSchema() {
        return this.targetSchema;
    }

    public String getTargetTable() {
        return this.targetTable;
    }

    public Optional<String> getSourceCatalog() {
        return this.sourceCatalog;
    }

    public Optional<String> getSourceSchema() {
        return this.sourceSchema;
    }

    public String getSourceTable() {
        return this.sourceTable;
    }

    public Optional<String> getOwner() {
        return this.owner;
    }

    public SyncTableExpr(Optional<String> targetCatalog, Optional<String> targetSchema, String targetTable, Optional<String> sourceCatalog, Optional<String> sourceSchema, String sourceTable, Optional<String> owner) {
        super();
        this.targetCatalog = targetCatalog;
        this.targetSchema = targetSchema;
        this.targetTable = Objects.requireNonNull(targetTable, "targetTable is null");
        this.sourceCatalog = Objects.requireNonNull(sourceCatalog, "sourceCatalog is null");
        this.sourceSchema = sourceSchema;
        this.sourceTable = sourceTable;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SyncTableExpr(targetCatalog=" + this.targetCatalog + ", targetSchema=" + this.targetSchema + ", targetTable=" + this.targetTable + ", sourceCatalog=" + this.sourceCatalog + ", sourceSchema=" + this.sourceSchema + ", sourceTable=" + this.sourceTable + ", owner=" + this.owner + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.targetCatalog.isPresent() ? this.targetCatalog.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.targetSchema.isPresent() ? this.targetSchema.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.targetTable != null ? this.targetTable.hashCode() : 0)) * 31;
        var1 = (var1 + (this.sourceCatalog.isPresent() ? this.sourceCatalog.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.sourceSchema.isPresent() ? this.sourceSchema.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.sourceTable != null ? this.sourceTable.hashCode() : 0)) * 31;
        return var1 + (this.owner.isPresent() ? this.owner.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof SyncTableExpr) {
                SyncTableExpr var2 = (SyncTableExpr)that;
                if (this.targetCatalog.equals(var2.targetCatalog) && this.targetSchema.equals(var2.targetSchema)
                        && this.targetTable.equals(var2.targetTable) && this.sourceCatalog.equals(var2.sourceCatalog)
                        && this.sourceSchema.equals(var2.sourceSchema) && this.sourceTable.equals(var2.sourceTable)
                        && this.owner.equals(var2.owner)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}