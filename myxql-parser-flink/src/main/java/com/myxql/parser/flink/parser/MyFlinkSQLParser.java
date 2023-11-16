package com.myxql.parser.flink.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MyFlinkSQLParser extends SqlParserAbstract {
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        FlinkSQLTableLineageParser tableLineageParser = new FlinkSQLTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        FlinkSQLFieldLineageParser fieldLineageParser = new FlinkSQLFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }
}