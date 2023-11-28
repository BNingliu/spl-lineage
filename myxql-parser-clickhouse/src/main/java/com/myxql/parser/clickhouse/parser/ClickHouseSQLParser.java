package com.myxql.parser.clickhouse.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.clickhouse.antlr4.CksqlLexer;
import com.myxql.parser.clickhouse.antlr4.CksqlParser;
import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.StatementLineage;
import lombok.Data;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

@Data
public class ClickHouseSQLParser extends SqlParserAbstract {
    private Integer dbType;
    private Integer relationship;

    public ClickHouseSQLParser() {
    }

    public ClickHouseSQLParser(Integer dbType, Integer relationship) {
        this.dbType = dbType;
        this.relationship=relationship;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        ClickHouseSQLTableLineageParser tableLineageParser = new ClickHouseSQLTableLineageParser(dbType,relationship);
        StatementLineage data = tableLineageParser.parse(sql);
        data.setRelationship(relationship);
        return data;
    }

    private ParseTree getParseTree(String sql) {
        CharStream input = CharStreams.fromString(sql);
        CksqlLexer lexer = new CksqlLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CksqlParser parser = new CksqlParser(tokenStream);
        return parser.program();
    }



    @Override
    public String parseSqlFormatter(String sql) {
        ClickHouseSqlFormatterParser visitor = new ClickHouseSqlFormatterParser(sql);
        visitor.visit(getParseTree(sql));
        return visitor.getFormattedSQL();
    }


    @Override
    public List<ColumnLineage> parseSqlFieldLineage2(String sql) {
        ClickHouSqlFieldLineageParser visitor = new ClickHouSqlFieldLineageParser(sql, dbType,relationship);
        visitor.visit(getParseTree(sql));
        List<ColumnLineage> hiveFieldLineage = visitor.getHiveFieldLineage();
        return hiveFieldLineage;
    }
}
