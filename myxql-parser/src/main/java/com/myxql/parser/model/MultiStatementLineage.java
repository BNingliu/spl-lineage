package com.myxql.parser.model;

import java.util.ArrayList;
import java.util.List;

public class MultiStatementLineage {
    private List<StatementLineage> statementLineages = new ArrayList<>();

    public List<StatementLineage> getStatementLineages() {
        return statementLineages;
    }

    public void setStatementLineages(List<StatementLineage> statementLineages) {
        this.statementLineages = statementLineages;
    }

    public void addStatementLineage(StatementLineage statementLineage) {
        this.statementLineages.add(statementLineage);
    }

    public StatementLineage get(int idx) {
        return this.statementLineages.get(idx);
    }
}
