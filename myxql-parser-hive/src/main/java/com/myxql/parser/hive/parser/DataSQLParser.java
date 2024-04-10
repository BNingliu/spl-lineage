package com.myxql.parser.hive.parser;

import com.myxql.parser.SqlParserAbstract;
import com.myxql.parser.hive.RemoveAliases;
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

    public DataSQLParser(Integer dbType) {
        this.dbType = dbType;
    }

    public DataSQLParser(Integer dbType, Integer relationship) {
        this.dbType = dbType;
        this.relationship = relationship;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
//        sql  = sql.replaceAll("'","").replaceAll("\"","");
        // 匹配where条件中的单引号并替换为空字符串
        String pattern = "(?i)where\\s+([^']+)'([^']+)'";
        sql = sql.replaceAll(pattern, "WHERE $1$2");
        sql = RemoveAliases.removeQuotesFromAliases(sql);
//        String pattern = "'(\\w+)'";

        // 使用replaceAll方法替换匹配到的单引号为空字符串
        HiveSQLTableLineageParser tableLineageParser = new HiveSQLTableLineageParser(dbType, relationship);
        StatementLineage data = tableLineageParser.parse(sql);
//        data.setRelationship(relationship);
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
        sql = sql.replaceAll("'", "").replaceAll("\"", "");
        HiveSQLFieldLineageParser fieldLineageParser = new HiveSQLFieldLineageParser(dbType);
        StatementLineage data = fieldLineageParser.parse(sql);
        return data;
    }

    @Override
    public String parseSqlFormatter(String sql) {
        sql = sql.replaceAll("'", "").replaceAll("\"", "");
        HiveSqlFormatterParser visitor = new HiveSqlFormatterParser(sql);
        visitor.visit(getParseTree(sql));
        return visitor.getFormattedSQL();
    }


    @Override
    public List<ColumnLineage> parseSqlFieldLineage2(String sql) {
        sql = sql.replaceAll("'", "").replaceAll("\"", "");
        HqlFieldLineageParser visitor = new HqlFieldLineageParser(sql, dbType, relationship);
        visitor.visit(getParseTree(sql));
        List<ColumnLineage> hiveFieldLineage = visitor.getHiveFieldLineage();
        return hiveFieldLineage;
    }
}
