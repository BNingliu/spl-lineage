package com.myxql.parser.hive.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.hive.antlr4.HplsqlLexer;
import com.myxql.parser.hive.antlr4.HplsqlParser;
import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.StatementLineage;
import lombok.Data;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

@Data
public class DataSQLParser extends SqlParserAbstract {
    private Integer dbType;
    private Integer relationship;

    public DataSQLParser() {
    }

    public DataSQLParser(Integer dbType,Integer relationship) {
        this.dbType = dbType;
        this.relationship=relationship;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        HiveSQLTableLineageParser tableLineageParser = new HiveSQLTableLineageParser(dbType,relationship);
        StatementLineage data = tableLineageParser.parse(sql);
        data.setRelationship(relationship);
        return data;
    }

    private ParseTree getParseTree(String sql) {
        CharStream input = CharStreams.fromString(sql);
        HplsqlLexer lexer = new HplsqlLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokenStream);
        return parser.program();
    }


    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        HiveSQLFieldLineageParser fieldLineageParser = new HiveSQLFieldLineageParser(dbType);
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }

    @Override
    public String parseSqlFormatter(String sql) {
        HiveSqlFormatterParser visitor = new HiveSqlFormatterParser(sql);
        visitor.visit(getParseTree(sql));
        return visitor.getFormattedSQL();
    }


    @Override
    public List<ColumnLineage> parseSqlFieldLineage2(String sql) {
        HqlFieldLineageParser visitor = new HqlFieldLineageParser(sql, dbType,relationship);
        visitor.visit(getParseTree(sql));
        List<ColumnLineage> hiveFieldLineage = visitor.getHiveFieldLineage();
        return hiveFieldLineage;
    }
}
