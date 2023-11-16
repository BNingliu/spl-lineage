package com.myxql.parser.flink.parser;

import com.myxql.parser.flink.antlr4.FlinkSqlParserBaseVisitor;
import com.myxql.parser.model.Statement;
import com.myxql.parser.model.StatementType;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class FlinkSQLFieldLineageAstBuilder extends FlinkSqlParserBaseVisitor<Statement> {
    private Logger logger = LoggerFactory.getLogger(FlinkSQLFieldLineageAstBuilder.class);

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
