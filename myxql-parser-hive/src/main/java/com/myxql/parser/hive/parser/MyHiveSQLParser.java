package com.myxql.parser.hive.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.model.StatementLineage;
import lombok.Data;

@Data
public class MyHiveSQLParser extends SqlParserAbstract {
    private Integer dbType;
    public MyHiveSQLParser() {
    }
    public MyHiveSQLParser(Integer dbType) {
        this.dbType = dbType;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        HiveSQLTableLineageParser tableLineageParser = new HiveSQLTableLineageParser(dbType);
        StatementLineage data = tableLineageParser.parse(sql);
        return data;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        HiveSQLFieldLineageParser fieldLineageParser = new HiveSQLFieldLineageParser(dbType);
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }
}
