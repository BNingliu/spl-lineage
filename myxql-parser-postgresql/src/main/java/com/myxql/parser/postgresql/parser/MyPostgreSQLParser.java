package com.myxql.parser.postgresql.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;

public class MyPostgreSQLParser extends SqlParserAbstract {

    private Integer dbType;
    private Integer relationship;


    public MyPostgreSQLParser(Integer dbType, Integer relationship) {
        this.dbType = dbType;
        this.relationship=relationship;
    }
    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        PostgreSQLTableLineageParser tableLineageParser = new PostgreSQLTableLineageParser();
        StatementLineage data = tableLineageParser.parse(sql);
        data.setRelationship(relationship);
        System.out.println("parseSqlTableLineage, data="+data);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        PostgreSQLFieldLineageParser fieldLineageParser = new PostgreSQLFieldLineageParser();
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }

}
