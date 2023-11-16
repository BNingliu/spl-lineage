package com.myxql.parser.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;

public final class ExportData extends Statement {
    private Optional<String> catalogName;
    private Optional<String> databaseName;
    private String tableName;
    private boolean cte;
    private ArrayList inputTables;
    private Optional<ArrayList> cteTempTables;
    private Optional<HashSet> functionNames;

    public Optional<String> getCatalogName() {
        return this.catalogName;
    }

    public Optional<String> getDatabaseName() {
        return this.databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public boolean getCte() {
        return this.cte;
    }

    public ArrayList getInputTables() {
        return this.inputTables;
    }

    public void setInputTables(ArrayList var1) {
        this.inputTables = var1;
    }

    public Optional<ArrayList> getCteTempTables() {
        return this.cteTempTables;
    }

    public void setCteTempTables(Optional<ArrayList> var1) {
        this.cteTempTables = var1;
    }

    public Optional<HashSet> getFunctionNames() {
        return this.functionNames;
    }

    public void setFunctionNames(Optional<HashSet> var1) {
        this.functionNames = var1;
    }

    public ExportData(Optional<String> catalogName, Optional<String> databaseName, String tableName, boolean cte, ArrayList inputTables, Optional<ArrayList> cteTempTables, Optional<HashSet> functionNames) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = Objects.requireNonNull(tableName, "tableName is null");
        this.cte = cte;
        this.inputTables = Objects.requireNonNull(inputTables, "inputTables is null");
        this.cteTempTables = cteTempTables;
        this.functionNames = functionNames;
    }

    @Override
    public String toString() {
        return "ExportData(catalogName=" + this.catalogName + ", databaseName=" + this.databaseName + ", tableName=" + this.tableName + ", cte=" + this.cte + ", inputTables=" + this.inputTables + ", cteTempTables=" + this.cteTempTables + ", functionNames=" + this.functionNames + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.catalogName.isPresent() ? this.catalogName.hashCode() : 0) * 31;
        var1 = (var1 + (this.databaseName.isPresent() ? this.databaseName.hashCode() : 0)) * 31;
        var1 = (var1 + (this.tableName != null ? this.tableName.hashCode() : 0)) * 31;
        int var2 = this.cte ? 1 : 0;
        var1 = (var1 + var2) * 31;
        var1 = (var1 + (this.inputTables != null ? this.inputTables.hashCode() : 0)) * 31;
        var1 = (var1 + (this.cteTempTables.isPresent() ? this.cteTempTables.hashCode() : 0)) * 31;
        return var1 + (this.functionNames.isPresent() ? this.functionNames.hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof ExportData) {
                ExportData var2 = (ExportData)that;
                if (this.catalogName.equals(var2.catalogName) && this.databaseName.equals(var2.databaseName)
                        && this.tableName.equals(var2.tableName) && this.cte == var2.cte
                        && this.inputTables.equals(var2.inputTables) && this.cteTempTables.equals(var2.cteTempTables)
                        && this.functionNames.equals(var2.functionNames)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}