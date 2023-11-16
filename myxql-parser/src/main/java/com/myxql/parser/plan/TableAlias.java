package com.myxql.parser.plan;

import com.myxql.parser.model.Statement;
import com.myxql.parser.model.TableName;

import java.util.Optional;

/**
 * An identifier that optionally specifies a database.
 *
 * Format (unquoted): "name" or "db.name"
 * Format (quoted): "`name`" or "`db`.`name`"
 */
public class TableAlias extends Statement {
    private TableName tabledName;
    private Optional<String> alias;

    public TableAlias(/*NodeLocation location,*/ TableName tableName, Optional<String> alias) {
//        super(location);
        this.tabledName = tableName;
        this.alias = alias;
    }

    public TableName getTabledName() {
        return tabledName;
    }

    public void setTabledName(TableName tabledName) {
        this.tabledName = tabledName;
    }

    public Optional<String> getAlias() {
        return alias;
    }

    public void setAlias(Optional<String> alias) {
        this.alias = alias;
    }
}
