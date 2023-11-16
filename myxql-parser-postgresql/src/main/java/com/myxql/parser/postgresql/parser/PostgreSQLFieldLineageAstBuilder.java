package com.myxql.parser.postgresql.parser;

import com.myxql.parser.model.Statement;
import com.myxql.parser.model.StatementType;
import com.myxql.parser.postgresql.antlr4.PostgreSQLParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.Objects;

public class PostgreSQLFieldLineageAstBuilder extends PostgreSQLParserBaseVisitor<Statement> {
//    private Logger logger = LoggerFactory.getLogger(PostgreSQLFieldLineageAstBuilder.class);
    private String command = null;
    private StatementType statementType;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    protected <T> T typedVisit (ParseTree ctx) {
        return (T) ctx.accept(this);
    }

}
