package com.myxql.parser.model;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

public final class TableData extends Statement {
    private List<String> cteTempTables;
    private HashSet<String> functionNames;
    private List<TableName> inputTables;
    private List<TableName> outpuTables;
    private Optional<Integer> limit;
    private Optional<InsertMode> insertMode;
    private Optional<HashMap> partitions;
    // 字段血缘
    private Optional<List<ColumnLineage>> columnDatas;

    public List<String> getCteTempTables() {
        return this.cteTempTables;
    }

    public HashSet<String> getFunctionNames() {
        return this.functionNames;
    }

    public List<TableName> getInputTables() {
        return this.inputTables;
    }

    public void setInputTables(List<TableName> var1) {
        this.inputTables = var1;
    }

    public List<TableName> getOutpuTables() {
        return this.outpuTables;
    }

    public void setOutpuTables(List<TableName> var1) {
        this.outpuTables = var1;
    }

    public Optional<Integer> getLimit() {
        return this.limit;
    }

    public void setLimit(Optional<Integer> var1) {
        this.limit = var1;
    }

    public Optional<InsertMode> getInsertMode() {
        return this.insertMode;
    }

    public void setInsertMode(Optional<InsertMode> var1) {
        this.insertMode = var1;
    }

    public Optional<HashMap> getPartitions() {
        return this.partitions;
    }

    public void setPartitions(Optional<HashMap> var1) {
        this.partitions = var1;
    }

    public Optional<List<ColumnLineage>> getColumnDatas() {
        return columnDatas;
    }

    public void setColumnDatas(Optional<List<ColumnLineage>> columnDatas) {
        this.columnDatas = columnDatas;
    }

    public TableData() {
        this(new ArrayList(), new ArrayList(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    public TableData(ArrayList inputTables, ArrayList outpuTables, Optional<Integer> limit, Optional<InsertMode> insertMode, Optional<HashMap> partitions) {
        super();
        this.inputTables = Objects.requireNonNull(inputTables, "inputTables is null");
        this.outpuTables = Objects.requireNonNull(outpuTables, "outpuTables is null");
        this.limit = limit;
        this.insertMode = insertMode;
        this.partitions = partitions;
        this.cteTempTables = new ArrayList();
        this.functionNames = new HashSet();
    }

    @Override
    public String toString() {
        return "TableData(inputTables=" + this.inputTables + ", outpuTables=" + this.outpuTables + ", limit=" + this.limit + ", insertMode=" + this.insertMode + ", partitions=" + this.partitions + ", columnDatas=" + this.columnDatas + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.inputTables != null ? this.inputTables.hashCode() : 0) * 31;
        var1 = (var1 + (this.outpuTables != null ? this.outpuTables.hashCode() : 0)) * 31;
        var1 = (var1 + (this.limit.isPresent() ? this.limit.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.insertMode.isPresent() ? this.insertMode.get().hashCode() : 0)) * 31;
        return var1 + (this.partitions.isPresent() ? this.partitions.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof TableData) {
                TableData var2 = (TableData)that;
                if (this.inputTables.equals(var2.inputTables) && this.outpuTables.equals(var2.outpuTables)
                        && this.limit.equals(var2.limit) && this.insertMode.equals(var2.insertMode)
                        && this.partitions.equals(var2.partitions)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}