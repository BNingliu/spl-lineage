package com.myxql.parser.hive.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MyHiveSQLParser extends SqlParserAbstract {
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        HiveSQLTableLineageParser tableLineageParser = new HiveSQLTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        HiveSQLFieldLineageParser fieldLineageParser = new HiveSQLFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }
}
