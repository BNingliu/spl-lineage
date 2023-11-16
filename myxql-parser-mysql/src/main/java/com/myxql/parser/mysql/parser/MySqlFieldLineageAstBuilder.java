package com.myxql.parser.mysql.parser;

import com.myxql.parser.model.Statement;
import com.myxql.parser.model.StatementType;
import com.myxql.parser.mysql.antlr4.MySqlParser;
import com.myxql.parser.mysql.antlr4.MySqlParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.Objects;

public class MySqlFieldLineageAstBuilder extends MySqlParserBaseVisitor<Statement> {
//    private Logger logger = LoggerFactory.getLogger(MysqlFieldLineageAstBuilder.class);
    private String command = null;
    private StatementType statementType;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    protected <T> T typedVisit (ParseTree ctx) {
        return (T) ctx.accept(this);
    }

    @Override
    public Statement visitSqlStatement(MySqlParser.SqlStatementContext ctx) {
        System.out.println("visitSqlStatement, ctx="+ctx.getText());
        return super.visitSqlStatement(ctx);
    }

    @Override
    public Statement visitInsertStatement(MySqlParser.InsertStatementContext ctx) {
        System.out.println("visitInsertStatement, ctx="+ctx.getText());
        return null;
    }
}
