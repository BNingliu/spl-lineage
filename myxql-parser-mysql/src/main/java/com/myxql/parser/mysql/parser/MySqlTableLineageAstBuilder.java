package com.myxql.parser.mysql.parser;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.mysql.antlr4.MySqlParser;
import com.myxql.parser.mysql.antlr4.MySqlParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class MySqlTableLineageAstBuilder extends MySqlParserBaseVisitor<StatementLineage> {
    private String command;
    private StatementType currentOptType = StatementType.UNKOWN;
    private Optional<Integer> limit = Optional.empty();
    private TableData tableData = new TableData();
    private List<List<String>> values = new ArrayList();

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    // ---------- database ------------------
    @Override
    public StatementLineage visitCreateDatabase(MySqlParser.CreateDatabaseContext ctx) {
        // 库名
        String databaseName = ctx.uid().getText();

        //createDatabaseOption
        Map<String, String> properties = new HashMap<>();

        Database sqlData = new Database(null, databaseName, Optional.empty(), Optional.empty(), properties);

        StatementLineage statementLineage = new StatementLineage(StatementType.CREATE_DATABASE, Optional.of(sqlData));
        return statementLineage;
    }

    @Override
    public StatementLineage visitDropDatabase(MySqlParser.DropDatabaseContext ctx) {
        String databaseName = ctx.uid().getText();
        Database sqlData = new Database(null, databaseName);
        return new StatementLineage(StatementType.DROP_DATABASE, Optional.of(sqlData));
    }

    // ---------- table ----------------------

    @Override
    public StatementLineage visitDropTable(MySqlParser.DropTableContext ctx) {
        List<TableName> tableNames = ctx.tables().tableName().stream()
                .map(MySqlParser.TableNameContext::fullId)
                .map(fullIdContext -> {
                    TableName tableName = TableName.parseTableName(fullIdContext.getText());
                    return tableName;
                }).collect(Collectors.toList());
        DropTable dropTable = new DropTable(tableNames);

        return new StatementLineage(StatementType.DROP_TABLE, Optional.of(dropTable));
    }

    @Override
    public StatementLineage visitTruncateTable(MySqlParser.TruncateTableContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.tableName().getText());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.TRUNCATE_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitCopyCreateTable(MySqlParser.CopyCreateTableContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.tableName(0).getText());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());

        TableName oldTableName = TableName.parseTableName(ctx.tableName(1).getText());

        CreateTableLike dcTable = new CreateTableLike(oldTableName.getDatabaseName(), Optional.ofNullable(oldTableName.getTableName()), table.getDatabaseName(), table.getTableName());
        dcTable.setIfNotExists(ctx.ifNotExists() != null);

        return new StatementLineage(StatementType.CREATE_TABLE_AS_LIKE, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitQueryCreateTable(MySqlParser.QueryCreateTableContext ctx) {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT;
        TableName tableName = TableName.parseTableName(ctx.tableName().getText());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
        String querySql = this.subSourceSql(ctx.selectStatement());
        table.setQuerySql(Optional.of(querySql));
        this.visitSelectStatement(ctx.selectStatement());
        table.setTableData(Optional.of(this.tableData));
        table.setIfNotExists(ctx.ifNotExists() != null);

        return new StatementLineage(StatementType.CREATE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
    }


    @Override
    public StatementLineage visitColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.tableName().getText());
        List<Column> columns = ctx.createDefinitions().createDefinition().stream()
                .map(definition -> {
                   if(definition instanceof MySqlParser.ColumnDeclarationContext) {
                       MySqlParser.ColumnDeclarationContext columnDeclarationContext = (MySqlParser.ColumnDeclarationContext) definition;
                       String colName = ModelHelper.dealNameMark(columnDeclarationContext.fullColumnName().getText());
                       String dataType = columnDeclarationContext.columnDefinition().dataType().getText();
                       Optional<String> colComment = Optional.empty();
                       return new Column(colName, Optional.of(dataType), colComment, true);
                   } else {
                       return null;
                   }
                }).collect(Collectors.toList());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.ofNullable(columns), Optional.empty(), Optional.empty());
        table.setIfNotExists(ctx.ifNotExists() != null);

        return new StatementLineage(StatementType.CREATE_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitSimpleDescribeStatement(MySqlParser.SimpleDescribeStatementContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.tableName().getText());
        Table sqlData = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.DESC_DATABASE, Optional.of(sqlData));
    }
/*
    @Override
    public StatementLineage visitFullDescribeStatement(MySqlParser.FullDescribeStatementContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());
        Table sqlData = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.DESC_DATABASE, Optional.of(sqlData));
    }
*/

    @Override
    public StatementLineage visitSelectStatement(MySqlParser.SelectStatementContext ctx) {
        this.currentOptType = StatementType.SELECT;
        super.visitSelectStatement(ctx);
        this.tableData.setLimit(this.limit);
        return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
    }

    @Override
    public StatementLineage visitSimpleSelect(MySqlParser.SimpleSelectContext ctx) {
        // from table
        List<MySqlParser.TableSourceContext> tableSources = Optional.ofNullable(ctx)
                .map(MySqlParser.SimpleSelectContext::querySpecification)
                .map(MySqlParser.QuerySpecificationContext::fromClause)
                .map(MySqlParser.FromClauseContext::tableSources)
                .map(MySqlParser.TableSourcesContext::tableSource)
                .orElse(new ArrayList<>());
        for(MySqlParser.TableSourceContext tableSourceContext : tableSources) {
            // tableSourceItem

            if(tableSourceContext.tableSourceItem().tableName() != null) {
                TableName tableName = TableName.parseTableName(tableSourceContext.tableSourceItem().tableName().getText());
                this.tableData.getInputTables().add(tableName);
            }
            // joinPart*
            for(MySqlParser.JoinPartContext joinPartContext : tableSourceContext.joinPart()) {
                MySqlParser.TableSourceItemContext tableSourceItemContext = joinPartContext.tableSourceItem();
                if(tableSourceItemContext.tableName() != null) {
                    TableName tableName = TableName.parseTableName(tableSourceItemContext.tableName().getText());
                    this.tableData.getInputTables().add(tableName);
                }
/*
                else if() {
                    this.visitSelectStatement(tableSourceItemContext.selectStatement());
                }

 */
            }
        }

        return super.visitSimpleSelect(ctx);
    }

    @Override
    public StatementLineage visitParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx) {
        List<MySqlParser.TableSourceContext> tableSources = Optional.ofNullable(ctx.queryExpression().querySpecification())
                .map(MySqlParser.QuerySpecificationContext::fromClause)
                .map(MySqlParser.FromClauseContext::tableSources)
                .map(MySqlParser.TableSourcesContext::tableSource)
                .orElse(new ArrayList<>());
        for(MySqlParser.TableSourceContext tableSourceContext : tableSources) {
            if(tableSourceContext.tableSourceItem().tableName() != null) {
                TableName tableName = TableName.parseTableName(tableSourceContext.tableSourceItem().tableName().getText());
                this.tableData.getInputTables().add(tableName);
            }
            for(MySqlParser.JoinPartContext joinPartContext : tableSourceContext.joinPart()) {
                TableName tableName = TableName.parseTableName(joinPartContext.tableSourceItem().tableName().getText());
                this.tableData.getInputTables().add(tableName);
            }
        }

        return super.visitParenthesisSelect(ctx);
    }

    @Override
    public StatementLineage visitUnionSelect(MySqlParser.UnionSelectContext ctx) {
        System.out.println("visitUnionSelect, ctx="+ctx.getText());
        return super.visitUnionSelect(ctx);
    }

    @Override
    public StatementLineage visitUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx) {
        System.out.println("visitUnionParenthesisSelect, ctx="+ctx.getText());
        return super.visitUnionParenthesisSelect(ctx);
    }

    @Override
    public StatementLineage visitWithLateralStatement(MySqlParser.WithLateralStatementContext ctx) {
        System.out.println("visitWithLateralStatement, ctx="+ctx.getText());
        return super.visitWithLateralStatement(ctx);
    }

    @Override
    public StatementLineage visitDropView(MySqlParser.DropViewContext ctx) {
        List<TableName> tableNames = ctx.fullId().stream()
                .map(fullIdContext -> {
                    TableName tableName = TableName.parseTableName(fullIdContext.getText());
                    return tableName;
                }).collect(Collectors.toList());
        DropTable dropTable = new DropTable(tableNames);
        dropTable.setView(true);

        return new StatementLineage(StatementType.DROP_TABLE, Optional.of(dropTable));
    }

    @Override
    public StatementLineage visitInsertStatement(MySqlParser.InsertStatementContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.tableName().getText());
        TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        this.tableData.getOutpuTables().add(table);
        this.tableData.setInsertMode(Optional.of(InsertMode.INTO));

        // INSERT_SELECT
        if(ctx.insertStatementValue().selectStatement() != null) {
            this.visitSelectStatement(ctx.insertStatementValue().selectStatement());
            this.currentOptType = StatementType.INSERT_SELECT;

            String querySql = this.subSourceSql(ctx.insertStatementValue().selectStatement());
//            if (ctx.cte_select_stmt() != null) {
//                this.parseCteTemplates(ctx.cte_select_stmt());
//            }
            return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(this.tableData), Optional.of(querySql), Optional.empty());
        } else if(ctx.insertStatementValue().insertFormat != null) {
            // INSERT_VALUES
            this.currentOptType = StatementType.INSERT_VALUES;
            for(MySqlParser.ExpressionsWithDefaultsContext valueContext : ctx.insertStatementValue().expressionsWithDefaults()) {
                List<String> rowValue = valueContext.expressionOrDefault()
                        .stream()
                        .map(RuleContext::getText)
                        .collect(Collectors.toList());
                this.values.add(rowValue);
            }

            // todo
//          if (this.values.size() != 0) {
                return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(values));
//          } else {
//              return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(singleValues));
//          }
        }

        return null;
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
