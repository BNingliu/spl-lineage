package com.myxql.parser.postgresql.parser;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.postgresql.antlr4.PostgreSQLParser;
import com.myxql.parser.postgresql.antlr4.PostgreSQLParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

import static java.util.Objects.requireNonNull;

public class PostgreSQLTableLineageAstBuilder extends PostgreSQLParserBaseVisitor<StatementLineage> {
    private String command;
    private StatementType currentOptType = StatementType.UNKOWN;
    private Optional<Integer> limit = Optional.empty();
    private TableData tableData = new TableData();
    private List<List<String>> values = new ArrayList();

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    @Override
    public StatementLineage visitStmt(PostgreSQLParser.StmtContext ctx) {
        System.out.println("visitStmt, ctx="+ctx.getText());
        StatementLineage statementLineage = super.visitStmt(ctx);
        System.out.println("visitStmt, obj="+statementLineage);
//        return super.visitStmt(ctx);
        return statementLineage;
    }

    // ---------- database ------------------
    @Override
    public StatementLineage visitCreatedbstmt(PostgreSQLParser.CreatedbstmtContext ctx) {
        // 库名
        String databaseName = ctx.name().getText();

        //createDatabaseOption
        Map<String, String> properties = new HashMap<>();

        Database sqlData = new Database(null, databaseName, Optional.empty(), Optional.empty(), properties);

        StatementLineage statementLineage = new StatementLineage(StatementType.CREATE_DATABASE, Optional.of(sqlData));
        return statementLineage;
    }

    @Override
    public StatementLineage visitDropdbstmt(PostgreSQLParser.DropdbstmtContext ctx) {
        System.out.println("visitDropdbstmt, ctx="+ctx.getText());
        String databaseName = ctx.name().getText();
        Database sqlData = new Database(null, databaseName);
        return new StatementLineage(StatementType.DROP_DATABASE, Optional.of(sqlData));
    }


    // ---------------------- table ----------------------
    @Override
    public StatementLineage visitCreatestmt(PostgreSQLParser.CreatestmtContext ctx) {
        System.out.println("visitCreatestmt, ctx="+ctx.getText());
        return null;
    }

    @Override
    public StatementLineage visitCreateasstmt(PostgreSQLParser.CreateasstmtContext ctx) {
        System.out.println("visitCreateasstmt, ctx="+ctx.getText());
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT;
        TableName tableName = TableName.parseTableName(ctx.create_as_target().qualified_name().getText());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
        String querySql = this.subSourceSql(ctx.selectstmt());
        table.setQuerySql(Optional.of(querySql));
        this.visitSelectstmt(ctx.selectstmt());
        table.setTableData(Optional.of(this.tableData));
        table.setIfNotExists(ctx.IF_P() != null & ctx.NOT() != null && ctx.EXISTS() != null);

        return new StatementLineage(StatementType.CREATE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
    }

    @Override
    public StatementLineage visitSelectstmt(PostgreSQLParser.SelectstmtContext ctx) {
        this.currentOptType = StatementType.SELECT;
        super.visitSelectstmt(ctx);
        this.tableData.setLimit(this.limit);
        return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
    }
/*
    @Override
    public StatementLineage visitSimple_select(PostgreSQLParser.Simple_selectContext ctx) {
        System.out.println("visitSimple_select, ctx="+ctx.getText());
        // from table
        List<PostgreSQLParser.Table_refContext> tableRefContexts = Optional.ofNullable(ctx)
                .map(PostgreSQLParser.Simple_selectContext::from_clause)
                .map(PostgreSQLParser.From_clauseContext::from_list)
                .map(PostgreSQLParser.From_listContext::table_ref)
                .orElse(new ArrayList<>());
System.out.println("tableRefContexts.size="+tableRefContexts.size());
        List<PostgreSQLParser.Table_refContext> nonAnsiJoinTableRef = Optional.ofNullable(ctx.from_clause())
                .map(PostgreSQLParser.From_clauseContext::from_list)
                .map(PostgreSQLParser.From_listContext::non_ansi_join)
                .map(PostgreSQLParser.Non_ansi_joinContext::table_ref)
                .orElse(new ArrayList<>());
        System.out.println("nonAnsiJoinTableRef.size="+nonAnsiJoinTableRef.size());
        tableRefContexts.addAll(nonAnsiJoinTableRef);
        System.out.println("tableRefContexts.size="+tableRefContexts.size());

        for(PostgreSQLParser.Table_refContext tableRefContext : tableRefContexts) {
            Optional.ofNullable(tableRefContext.relation_expr())
                    .map(PostgreSQLParser.Relation_exprContext::qualified_name)
                    .map(qualified_nameContext -> {
                        TableName tableName = TableName.parseTableName(qualified_nameContext.getText());
                        this.tableData.getInputTables().add(tableName);
                        return null;
                    });
        }

        return super.visitSimple_select(ctx);
    }
*/
    @Override
    public StatementLineage visitTable_ref(PostgreSQLParser.Table_refContext ctx) {
        System.out.println("visitTable_ref, ctx=" + ctx.getText());
        Optional.ofNullable(ctx.relation_expr())
                .map(PostgreSQLParser.Relation_exprContext::qualified_name)
                .map(RuleContext::getText)
                .map(TableName::parseTableName)
                .map(tableName -> {
                    this.tableData.getInputTables().add(tableName);
                    return null;
                });
        return super.visitTable_ref(ctx);
    }


    protected <T> T typedVisit (ParseTree ctx) {
        return (T) ctx.accept(this);
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
