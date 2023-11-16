package com.myxql.parser.model;


public class JobUse extends Statement {
    private String dbName;

    public JobUse(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return this.dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

}