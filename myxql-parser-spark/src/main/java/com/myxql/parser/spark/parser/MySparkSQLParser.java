package com.myxql.parser.spark.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MySparkSQLParser extends SqlParserAbstract {
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        SparkSQLTableLineageParser tableLineageParser = new SparkSQLTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        SparkSQLFieldLineageParser fieldLineageParser = new SparkSQLFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }

}
