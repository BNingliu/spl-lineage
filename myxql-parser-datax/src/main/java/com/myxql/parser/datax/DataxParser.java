package com.myxql.parser.datax;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.datax.parser.ParserFactory;
import com.myxql.parser.model.StatementLineage;
import lombok.Data;

@Data
public class DataxParser extends SqlParserAbstract {
    private Integer dbType;

    public DataxParser() {
    }

    public DataxParser(Integer dbType) {
        this.dbType = dbType;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        StatementLineage statementLineage = ParserFactory.getrelationSqlHandler(sql);
        statementLineage.setRelationship(dbType);
        return statementLineage;
    }








}
