package com.myxql.parser.model;

import java.util.List;

public class JobSql extends Statement {
    private String sql;

    public JobSql(String text) {
        this.sql = text;
    }

    public String getSql() {
        return this.sql;
    }

    public void setSql(String text) {
        this.sql = text;
    }

}
