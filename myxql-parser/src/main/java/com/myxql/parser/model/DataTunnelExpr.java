package com.myxql.parser.model;

import java.util.*;

public final class DataTunnelExpr extends Statement {
    private Optional<ArrayList> inputTables;
    private Optional<ArrayList> cteTempTables;
    private Optional<HashSet> functionNames;
    private String srcType;
    private Map srcOptions;
    private Optional<String> transformSql;
    private String distType;
    private Map distOptions;
    private boolean cte;

    public Optional<ArrayList> getInputTables() {
        return this.inputTables;
    }

    public void setInputTables(Optional<ArrayList> var1) {
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

    public String getSrcType() {
        return this.srcType;
    }

    public Map getSrcOptions() {
        return this.srcOptions;
    }

    public void setSrcOptions(Map var1) {
        this.srcOptions = var1;
    }

    public Optional<String> getTransformSql() {
        return this.transformSql;
    }

    public String getDistType() {
        return this.distType;
    }

    public Map getDistOptions() {
        return this.distOptions;
    }

    public void setDistOptions(Map var1) {
        this.distOptions = var1;
    }

    public boolean getCte() {
        return this.cte;
    }

    public void setCte(boolean var1) {
        this.cte = var1;
    }

    public DataTunnelExpr(String srcType, Map srcOptions, Optional<String> transformSql, String distType, Map distOptions, boolean cte) {
        super();
        this.srcType = Objects.requireNonNull(srcType, "srcType is null");
        this.srcOptions = Objects.requireNonNull(srcOptions, "srcOptions is null");
        this.transformSql = Objects.requireNonNull(transformSql, "transformSql is null");
        this.distType = Objects.requireNonNull(distType, "distType is null");
        this.distOptions = Objects.requireNonNull(distOptions, "distOptions is null");
        this.cte = cte;
    }

    @Override
    public String toString() {
        return "DataTunnelExpr(srcType=" + this.srcType + ", srcOptions=" + this.srcOptions + ", transformSql=" + this.transformSql + ", distType=" + this.distType + ", distOptions=" + this.distOptions + ", cte=" + this.cte + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.srcType != null ? this.srcType.hashCode() : 0) * 31;
        var1 = (var1 + (this.srcOptions != null ? this.srcOptions.hashCode() : 0)) * 31;
        var1 = (var1 + (this.transformSql.isPresent() ? this.transformSql.hashCode() : 0)) * 31;
        var1 = (var1 + (this.distType != null ? this.distType.hashCode() : 0)) * 31;
        var1 = (var1 + (this.distOptions != null ? this.distOptions.hashCode() : 0)) * 31;
        int var3 = this.cte ? 1 : 0;

        return var1 + var3;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof DataTunnelExpr) {
                DataTunnelExpr var2 = (DataTunnelExpr)that;
                if (this.srcType.equals(var2.srcType) && this.srcOptions.equals(var2.srcOptions)
                        && this.transformSql.equals(var2.transformSql) && this.distType.equals(var2.distType)
                        && this.distOptions.equals(var2.distOptions) && this.cte == var2.cte) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}