package com.myxql.parser.flink.parser;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.flink.antlr4.FlinkSqlParser;
import com.myxql.parser.flink.antlr4.FlinkSqlParserBaseVisitor;
import com.myxql.parser.model.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class FlinkSQLTableLineageAstBuilder extends FlinkSqlParserBaseVisitor<Statement> {
    private String command = "";
    private List<Statement> statements = new ArrayList();

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    @Override
    public Statement visitSqlStatements(FlinkSqlParser.SqlStatementsContext ctx) {
        for(FlinkSqlParser.SqlStatementContext sqlStatementContext : ctx.sqlStatement()) {
            Statement statement = this.visitSqlStatement(sqlStatementContext);
            this.statements.add(statement);
        }
        return null;
    }

    @Override
    public Statement visitSqlStatement(FlinkSqlParser.SqlStatementContext ctx) {
        Statement statement = super.visitSqlStatement(ctx);
        if (statement == null) {
//            String startToken = StringUtils.lowerCase(ctx.getStart().getText());
            throw FlinkSQLTableLineageAstBuilder.parseError("不支持的SQL: " + command, ctx);
        }
        return statement;
    }

    @Override
    public Statement visitSimpleCreateTable(FlinkSqlParser.SimpleCreateTableContext ctx) {
        TableName tableName = parseSourceTable(ctx.sourceTable().uid());
        String comment = ctx.commentSpec() != null ? ctx.commentSpec().STRING_LITERAL().getText() : null;
        Map<String, String> properties = parseTableOptions(ctx.withOption().tablePropertyList());
        Boolean ifNotExists = ctx.ifNotExists() != null ? true : false;

        List<Column> columns = ctx.columnOptionDefinition().stream().map(it -> {
            ParseTree columnCtx = it.getChild(0);
            if (columnCtx instanceof FlinkSqlParser.PhysicalColumnDefinitionContext) {
                FlinkSqlParser.PhysicalColumnDefinitionContext columnDefinitionContext = (FlinkSqlParser.PhysicalColumnDefinitionContext) columnCtx;
                String colName = columnDefinitionContext.columnName().getText();
                String dataType = columnDefinitionContext.columnType().getText();
                String colComment = columnDefinitionContext.commentSpec() != null ? columnDefinitionContext.commentSpec().STRING_LITERAL().getText() : null;
                return new Column(colName, Optional.of(dataType), Optional.ofNullable(colComment), false /*, "PHYSICAL"*/);
            } else if (columnCtx instanceof FlinkSqlParser.MetadataColumnDefinitionContext) {
                FlinkSqlParser.MetadataColumnDefinitionContext columnDefinitionContext = (FlinkSqlParser.MetadataColumnDefinitionContext) columnCtx;
                String colName = columnDefinitionContext.columnName().getText();
                String dataType = columnDefinitionContext.columnType().getText();
                String metadataKey = null;
                if (columnDefinitionContext.metadataKey() != null) {
                    metadataKey = ModelHelper.cleanQuote(columnDefinitionContext.metadataKey().getText());
                }
                Column column = new Column(colName, Optional.of(dataType), null, false /*ColumnDefType.METADATA*/);
//                column.metadataKey = metadataKey
                return column;
            } else {
                FlinkSqlParser.ComputedColumnDefinitionContext computedColumn = (FlinkSqlParser.ComputedColumnDefinitionContext) columnCtx;
                String colName = computedColumn.columnName().getText();
                String colComment = computedColumn.commentSpec() != null ? computedColumn.commentSpec().STRING_LITERAL().getText() : null;
                String computedExpr = this.subSourceSql(computedColumn.computedColumnExpression().expression());
                Column column = new Column(colName, null, Optional.of(colComment), false /*ColumnDefType.COMPUTED*/);
                column.setExpression(Optional.of(computedExpr));
                return column;
            }
        }).collect(Collectors.toList());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.empty(), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.empty());
        return new StatementLineage(StatementType.CREATE_TABLE, Optional.of(table));
    }




    private TableName parseSourceTable(FlinkSqlParser.UidContext uid) {
        List<FlinkSqlParser.IdentifierContext> nodes = uid.identifier();
        if (nodes.size() == 3) {
            String catalog = ModelHelper.cleanQuote(nodes.get(0).getText());
            String schema = ModelHelper.cleanQuote(nodes.get(1).getText());
            String tableName = ModelHelper.cleanQuote(nodes.get(2).getText());
            return new TableName(Optional.of(catalog), Optional.of(schema), tableName);
        } else if (nodes.size() == 2) {
            String schema = ModelHelper.cleanQuote(nodes.get(0).getText());
            String tableName = ModelHelper.cleanQuote(nodes.get(1).getText());
            return new TableName(Optional.of(schema), tableName);
        } else if (nodes.size() == 1) {
            String tableName = ModelHelper.cleanQuote(nodes.get(0).getText());
            return new TableName(tableName);
        } else {
            throw FlinkSQLTableLineageAstBuilder.parseError("parse multipart error: " + nodes.size(), uid);
        }
    }

    private Map<String, String> parseTableOptions(FlinkSqlParser.TablePropertyListContext ctx) {
        Map<String, String> properties = new HashMap<>();
        if (ctx != null) {
            ctx.tableProperty().forEach( propertyContext -> {
                String key = ModelHelper.cleanQuote(propertyContext.key.getText());
                String value = ModelHelper.cleanQuote(propertyContext.value.getText());
                properties.put(key, value);
            });
        }

        return properties;
    }

    private String subSourceSql(ParserRuleContext parserRuleContext) {
        return this.command.substring(
                parserRuleContext.getStart().getStartIndex(),
                parserRuleContext.getStop().getStopIndex() + 1);
    }

    public static Origin getLocation(TerminalNode terminalNode) {
        requireNonNull(terminalNode, "terminalNode is null");
        return getLocation(terminalNode.getSymbol());
    }

    public static Origin getLocation(ParserRuleContext parserRuleContext) {
        requireNonNull(parserRuleContext, "parserRuleContext is null");
        return getLocation(parserRuleContext.getStart());
    }

    public static Origin getLocation(Token token) {
        requireNonNull(token, "token is null");
        return new Origin(token.getLine(), token.getCharPositionInLine());
    }

    private static ParseException parseError(String message, ParserRuleContext context) {
        return new ParseException(message, getLocation(context.start), getLocation(context.stop));
    }
}
