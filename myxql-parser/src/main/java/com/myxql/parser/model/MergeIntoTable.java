package com.myxql.parser.model;

import java.util.HashSet;
import java.util.Objects;

public final class MergeIntoTable extends Statement {
    private HashSet<TableName> sourceTables = new HashSet();
    private TableSource targetTable;

    public MergeIntoTable(TableSource source) {
        this.targetTable = source;
    }

    public HashSet getSourceTables() {
        return this.sourceTables;
    }

    public void setSourceTables(HashSet var1) {
        this.sourceTables = var1;
    }

    public TableSource getTargetTable() {
        return this.targetTable;
    }

    public void setTargetTable(TableSource var1) {
        this.targetTable = var1;
    }

    public MergeIntoTable(HashSet sourceTables, TableSource targetTable) {
        super();
        this.sourceTables = Objects.requireNonNull(sourceTables, "sourceTables is null");
        this.targetTable = Objects.requireNonNull(targetTable, "targetTable is null");
    }

    @Override
    public String toString() {
        return "MergeIntoTable(sourceTables=" + this.sourceTables + ", targetTable=" + this.targetTable + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.sourceTables != null ? this.sourceTables.hashCode() : 0) * 31;
        return var1 + (this.targetTable != null ? this.targetTable.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof MergeIntoTable) {
                MergeIntoTable var2 = (MergeIntoTable)that;
                if (this.sourceTables.equals(var2.sourceTables) && this.targetTable.equals(var2.targetTable)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}