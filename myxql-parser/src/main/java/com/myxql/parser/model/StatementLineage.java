package com.myxql.parser.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StatementLineage extends Statement implements Serializable {
    private StatementType type;
    private Optional<Statement> statement;
    private Optional<String> querySql;
    private Optional<List<List<String>>> values;

    public StatementType getType() {
        return this.type;
    }

    public Optional<Statement> getStatement() {
        return this.statement;
    }

    public Optional<String> getQuerySql() {
        return this.querySql;
    }

    public void setQuerySql(Optional<String> var1) {
        this.querySql = var1;
    }

    public Optional<List<List<String>>> getValues() {
        return this.values;
    }

    public void setValues(Optional<List<List<String>>> var1) {
        this.values = var1;
    }

    public StatementLineage(StatementType type, Optional<Statement> statement, Optional<String> querySql, Optional<List<List<String>>> values) {
        super();
        this.type = Objects.requireNonNull(type, "type is null");
        this.statement = statement;
        this.querySql = querySql;
        this.values = values;
    }
    public StatementLineage(StatementType type, Optional<Statement> statement, String querySql) {
        this(type, statement, Optional.ofNullable(querySql), Optional.empty());
    }

    public StatementLineage(StatementType type, Optional<Statement> statement) {
        this(type, statement, Optional.empty(), Optional.empty());
    }

    public StatementLineage(StatementType type) {
        this(type, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @Override
    public String toString() {
        return "StatementData(type=" + this.type + ", statement=" + this.statement + ", querySql=" + this.querySql + ", values=" + this.values + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.type != null ? this.type.hashCode() : 0) * 31;
        var1 = (var1 + (this.statement.isPresent() ? this.statement.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.querySql.isPresent() ? this.querySql.get().hashCode() : 0)) * 31;
        return var1 + (this.values.isPresent() ? this.values.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof StatementLineage) {
                StatementLineage var2 = (StatementLineage)that;
                if (this.type.equals(var2.type) && this.statement.equals(var2.statement)
                        && this.querySql.equals(var2.querySql) && this.values.equals(var2.values)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}