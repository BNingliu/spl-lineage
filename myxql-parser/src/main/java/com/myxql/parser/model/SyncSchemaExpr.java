package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public class SyncSchemaExpr extends Statement {
    private Optional<String> targetCatalog;
    private String targetSchema;
    private Optional<String> sourceCatalog;
    private String sourceSchema;
    private Optional<String> owner;

    public Optional<String> getTargetCatalog() {
        return this.targetCatalog;
    }

    public String getTargetSchema() {
        return this.targetSchema;
    }

    public Optional<String> getSourceCatalog() {
        return this.sourceCatalog;
    }

    public String getSourceSchema() {
        return this.sourceSchema;
    }

    public Optional<String> getOwner() {
        return this.owner;
    }

    public SyncSchemaExpr(Optional<String> targetCatalog, String targetSchema, Optional<String> sourceCatalog, String sourceSchema, Optional<String> owner) {
        super();
        this.targetCatalog = targetCatalog;
        this.targetSchema = Objects.requireNonNull(targetSchema, "targetSchema is null");
        this.sourceCatalog = Objects.requireNonNull(sourceCatalog, "sourceCatalog is null");
        this.sourceSchema = sourceSchema;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SyncSchemaExpr(targetCatalog=" + this.targetCatalog + ", targetSchema=" + this.targetSchema + ", sourceCatalog=" + this.sourceCatalog + ", sourceSchema=" + this.sourceSchema + ", owner=" + this.owner + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.targetCatalog.isPresent() ? this.targetCatalog.get().hashCode() : 0) * 31;
        var1 = (var1 + (this.targetSchema != null ? this.targetSchema.hashCode() : 0)) * 31;
        var1 = (var1 + (this.sourceCatalog.isPresent() ? this.sourceCatalog.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.sourceSchema != null ? this.sourceSchema.hashCode() : 0)) * 31;
        return var1 + (this.owner.isPresent() ? this.owner.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof SyncSchemaExpr) {
                SyncSchemaExpr var2 = (SyncSchemaExpr)that;
                if (this.targetCatalog.equals(var2.targetCatalog) && this.targetSchema.equals(var2.targetSchema)
                        && this.sourceCatalog.equals(var2.sourceCatalog) && this.sourceSchema.equals(var2.sourceSchema)
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