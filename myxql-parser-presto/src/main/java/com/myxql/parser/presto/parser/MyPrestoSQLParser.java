package com.myxql.parser.presto.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MyPrestoSQLParser extends SqlParserAbstract {
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        PrestoTableLineageParser tableLineageParser = new PrestoTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        PrestoFieldLineageParser fieldLineageParser = new PrestoFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }
}
