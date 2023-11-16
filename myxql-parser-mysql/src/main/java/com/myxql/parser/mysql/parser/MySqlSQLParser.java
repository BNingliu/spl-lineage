package com.myxql.parser.mysql.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MySqlSQLParser extends SqlParserAbstract {
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        MySqlTableLineageParser tableLineageParser = new MySqlTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        MySqlFieldLineageParser fieldLineageParser = new MySqlFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }
}
