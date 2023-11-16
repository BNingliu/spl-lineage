package com.myxql.parser.plan;

import com.myxql.parser.model.TableName;

public class FromTable {
    /**
     * 来源表，来源子select则为null
     */
    private TableName fromTable;

    /**
     * 表别名, 没有别名则为null
     */
    private String tableAlias;

    public FromTable(TableName fromTable, String alias) {
        this.fromTable = fromTable;
        this.tableAlias = alias;
    }

    public FromTable(TableName fromTable) {
        this(fromTable, null);
    }

    public FromTable(String alias) {
        this(null, alias);
    }

    public TableName getFromTable() {
        return fromTable;
    }

    public void setFromTable(TableName fromTable) {
        this.fromTable = fromTable;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }
}
