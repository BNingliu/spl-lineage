package com.myxql.parser.presto.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.presto.antlr4.SqlBaseBaseVisitor;
import com.myxql.parser.presto.antlr4.SqlBaseParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class PrestoTableLineageAstBuilder extends SqlBaseBaseVisitor<StatementLineage> {
    private String command;
    private StatementType currentOptType = StatementType.UNKOWN;
    private TableData tableData = new TableData();
    private String querySql = null;
    private Optional<Integer> limit = Optional.empty();
    private InsertMode insertMode = InsertMode.INTO;
    private List<List<String>> singleValues = new ArrayList();

    private Boolean isCTE = false;
    private Boolean insertSql = false;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    @Override
    public StatementLineage visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        StatementLineage data = visit(ctx.statement());
        if (data == null) {
            throw PrestoTableLineageAstBuilder.parseError("不支持的SQL: " + command, ctx);
        }

        return data;
    }

    // ---------- database ------------------
    @Override
    public StatementLineage visitCreateSchema(SqlBaseParser.CreateSchemaContext ctx) {
        DatabaseName databaseName = parseDatabaseName(ctx.qualifiedName());

        Map<String, String> properties = parseProperties(ctx.properties());

        Database sqlData = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName(), properties);

        StatementLineage statementLineage = new StatementLineage(StatementType.CREATE_DATABASE, Optional.of(sqlData));
        return statementLineage;
    }

    @Override
    public StatementLineage visitDropSchema(SqlBaseParser.DropSchemaContext ctx) {
        DatabaseName databaseName = parseDatabaseName(ctx.qualifiedName());
        Database sqlData = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName());
        return new StatementLineage(StatementType.DROP_DATABASE, Optional.of(sqlData));
    }

    // ---------- table ------------------
    @Override
    public StatementLineage visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        TableName tableName = this.parseTableName(ctx.qualifiedName());
        List<Column> columns = ctx.tableElement().stream().map(it -> {
            if(it.columnDefinition() != null) {
                SqlBaseParser.ColumnDefinitionContext cdContext = it.columnDefinition();
                String colName = cdContext.identifier().getText();
                String dataType = cdContext.type().getText();
                Boolean nullable = ctx.NOT() != null;
                String comment = Optional.ofNullable(cdContext.string())
                        .map(RuleContext::getText)
                        .orElse(null);
                if(cdContext.properties() != null) {
                    Map<String, String> properties = parseProperties(cdContext.properties());
                }
                return new Column(colName, Optional.of(dataType), Optional.ofNullable(comment), nullable);
            } else if(it.likeClause() != null){
                String colName = it.likeClause().qualifiedName().getText();
                return new Column(colName, Optional.empty(), Optional.empty(), false);
            } else {
                PrestoTableLineageAstBuilder.parseError("不支持的建表语句", ctx);
                return null;
            }
        }).collect(Collectors.toList());

        String comment = Optional.ofNullable(ctx.string())
                .map(RuleContext::getText)
                .orElse(null);

        Map<String, String> properties = this.parseProperties(ctx.properties());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.empty(), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.empty());
        return new StatementLineage(StatementType.CREATE_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitCreateTableAsSelect(SqlBaseParser.CreateTableAsSelectContext ctx) {
        TableName tableName = this.parseTableName(ctx.qualifiedName());
        List<Column> columns = Optional.ofNullable(ctx.columnAliases())
                .map(SqlBaseParser.ColumnAliasesContext::identifier)
                .map(identifierContexts -> identifierContexts.stream()
                        .map(identifierContext -> {
                            String colName = identifierContext.getText();
                            return new Column(colName, Optional.empty(), Optional.empty(), false);
                        })
                        .collect(Collectors.toList())
                ).orElse(new ArrayList<>());

        String comment = Optional.ofNullable(ctx.string())
                .map(RuleContext::getText)
                .orElse(null);

        Map<String, String> properties = this.parseProperties(ctx.properties());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.empty(), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.empty());

        String querySql = StringUtils.substring(command, ctx.query().start.getStartIndex());
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substringBetween(querySql, "(", ")");
        }

        table.setQuerySql(Optional.of(querySql));
        super.visitQuery(ctx.query());
        table.setTableData(Optional.of(this.tableData));
        return new StatementLineage(StatementType.CREATE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
    }

    @Override
    public StatementLineage visitDropTable(SqlBaseParser.DropTableContext ctx) {
        TableName tableName = parseTableName(ctx.qualifiedName());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        CommonToken token = new CommonToken(ctx.qualifiedName().start.getStartIndex(), ctx.qualifiedName().stop.getStopIndex());
        table.setIfExists(ctx.EXISTS() != null);
        table.setToken(Optional.of(token));
        return new StatementLineage(StatementType.DROP_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitDropView(SqlBaseParser.DropViewContext ctx) {
        TableName tableName = parseTableName(ctx.qualifiedName());

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        view.setIfExists(ctx.EXISTS() != null);
        return new StatementLineage(StatementType.DROP_VIEW, Optional.of(view));
    }

    @Override
    public StatementLineage visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        TableName tableName = parseTableName(ctx.qualifiedName());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.TRUNCATE_TABLE, Optional.of(table));
    }

    // ----------- view ------------------------
    public StatementLineage visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        TableName tableName = parseTableName(ctx.qualifiedName());

        SqlBaseParser.QueryContext query = ctx.query();
        this.querySql = StringUtils.substring(command, query.start.getStartIndex());
        this.currentOptType = StatementType.CREATE_VIEW;
        this.visitQuery(ctx.query());

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(querySql), Optional.empty(), false, false);
        view.setFunctionNames(this.tableData.getFunctionNames());
        return new StatementLineage(StatementType.CREATE_VIEW, Optional.of(view));
    }

    @Override
    public StatementLineage visitCreateMaterializedView(SqlBaseParser.CreateMaterializedViewContext ctx) {
        TableName tableName = parseTableName(ctx.qualifiedName());
        String comment = Optional.ofNullable(ctx.string())
                .map(RuleContext::getText)
                .orElse("");

        Map<String, String> properties = this.parseProperties(ctx.properties());
        SqlBaseParser.QueryContext query = ctx.query();
        this.querySql = StringUtils.substring(command, query.start.getStartIndex());
        this.currentOptType = StatementType.CREATE_VIEW;
        this.visitQuery(ctx.query());

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(querySql), Optional.of(comment), false, false, properties);
        view.setFunctionNames(this.tableData.getFunctionNames());
        return new StatementLineage(StatementType.CREATE_VIEW, Optional.of(view));
    }

    @Override
    public StatementLineage visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        TableName tableNameFrom = parseTableName(ctx.from);
        TableName tableNameTo = parseTableName(ctx.to);

        RenameTable dcTable = new RenameTable(tableNameFrom.getCatalogName(), tableNameFrom.getDatabaseName(), tableNameFrom.getTableName(), tableNameTo.getTableName());
        dcTable.setOldToken(Optional.of(new CommonToken(ctx.from.start.getStartIndex(), ctx.from.stop.getStopIndex())));
        dcTable.setNewToken(Optional.of(new CommonToken(ctx.to.start.getStartIndex(), ctx.to.stop.getStopIndex())));
        return new StatementLineage(StatementType.ALTER_TABLE_RENAME, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitAddColumn(SqlBaseParser.AddColumnContext ctx) {
        TableName tableName = this.parseTableName(ctx.tableName);
        String colName = ctx.column.identifier().getText();
        String dataType = ctx.column.type().getText();
        Boolean nullable = ctx.column.NOT() != null;
        String comment = Optional.ofNullable(ctx.column.string())
                .map(RuleContext::getText)
                .orElse(null);
        if(ctx.column.properties() != null) {
            Map<String, String> properties = parseProperties(ctx.column.properties());
        }
        Column column = new Column(colName, Optional.of(dataType), Optional.ofNullable(comment), nullable);
        List<Column> columns = new ArrayList<>();
        columns.add(column);

        Table table = new Table(Optional.empty(), Optional.empty(), tableName.getTableName());
        table.setColumns(Optional.of(columns));
        return new StatementLineage(StatementType.ALTER_TABLE_ADD_COL,Optional.of(table));
    }

    @Override
    public StatementLineage visitDropColumn(SqlBaseParser.DropColumnContext ctx) {
        TableName tableName = parseTableName(ctx.tableName);

        AlterColumn dcTable = new AlterColumn(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        dcTable.setToken(Optional.of(new CommonToken(ctx.tableName.start.getStartIndex(), ctx.tableName.stop.getStopIndex())));
        return new StatementLineage(StatementType.ALTER_TABLE_DROP_COL, Optional.of(dcTable));
    }

    // ------------- insert & query ---------------
    @Override
    public StatementLineage visitQuery(SqlBaseParser.QueryContext ctx) {
        if(ctx.with() != null) { // ctes
            this.isCTE = true;

            SqlBaseParser.QueryNoWithContext queryTermContext = ctx.queryNoWith();
            if (StringUtils.startsWithIgnoreCase(queryTermContext.getText(), "select")) {
                this.currentOptType = StatementType.SELECT;
                super.visitQuery(ctx);
                this.tableData.setLimit(limit);

                this.tableData.getCteTempTables().stream()
                        .map(tableName -> {
                            for (TableName table : this.tableData.getInputTables()) {
                                if (table.getDatabaseName().get().isEmpty() && tableName.equals(table.getTableName())) {
                                    tableData.getInputTables().remove(table);
                                    break;
                                }
                            }
                            return null;
                        });
                return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
            }
        }
        if (StringUtils.equalsIgnoreCase("select", ctx.start.getText())) {
            currentOptType = StatementType.SELECT;
            super.visitQuery(ctx);

            this.tableData.setLimit(limit);
            return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
        }

        return super.visitQuery(ctx);
    }

    @Override
    public StatementLineage visitQueryNoWith(SqlBaseParser.QueryNoWithContext ctx) {
        return super.visitQueryNoWith(ctx);
    }

    @Override
    public StatementLineage visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        if (this.querySql == null) {
            this.querySql = StringUtils.substring(this.command, ctx.start.getStartIndex());
        }
        return super.visitQueryTermDefault(ctx);
    }

    @Override
    public StatementLineage visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        if (this.isCTE) {
            this.tableData.getCteTempTables().add(ctx.name.getText());
        }
        return super.visitNamedQuery(ctx);
    }

    @Override
    public StatementLineage visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        if (this.insertSql) {
            this.currentOptType = StatementType.INSERT_SELECT;
        }
        return super.visitQueryPrimaryDefault(ctx);
    }

    @Override
    public StatementLineage visitTableName(SqlBaseParser.TableNameContext ctx) {
        TableName tableName = this.parseTableName(ctx.qualifiedName());
        this.tableData.getInputTables().add(tableName);
        return null;
    }

    @Override
    public StatementLineage visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        this.currentOptType = StatementType.INSERT_VALUES;
        for(SqlBaseParser.ExpressionContext expressionContext : ctx.expression()) {
            String text = expressionContext.getText();
            text = StringUtils.substringBetween(text, "(", ")").trim();
            text = ModelHelper.cleanQuote(text);
            List<String> list = new ArrayList();
            list.add(text);
            this.singleValues.add(list);
        }
        return super.visitInlineTable(ctx);
    }

    @Override
    public StatementLineage visitTable(SqlBaseParser.TableContext ctx) {
        TableName tableNameObj = parseTableName(ctx.qualifiedName());
        Optional<String> databaseName = tableNameObj.getDatabaseName();
        String tableName = tableNameObj.getTableName();
        Optional<String> metaAction = tableNameObj.getMetaType();
        TableName table = new TableName(databaseName, tableName, metaAction);

        int index = this.tableData.getInputTables().indexOf(table);
        if (index == -1) {
            this.tableData.getInputTables().add(table);
        }
        return null;
    }

    @Override
    public StatementLineage visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        TableName tableName = this.parseTableName(ctx.qualifiedName());
        this.insertSql = true;
        TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());

        this.tableData.getOutpuTables().add(table);

        this.insertMode = InsertMode.INTO;
        this.tableData.setInsertMode(Optional.of(this.insertMode));
        this.visitQuery(ctx.query());

        if (this.currentOptType == StatementType.INSERT_VALUES) {
            return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(singleValues));
        } else {
            return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(tableData), Optional.of(querySql), Optional.empty());
        }
    }



    private Map<String, String> parseProperties(SqlBaseParser.PropertiesContext ctx) {
        Map<String, String> properties = new HashMap<>();
        if (ctx != null) {
            for (SqlBaseParser.PropertyContext propertyContext : ctx.property()) {
                String key = propertyContext.identifier().getText();
                String value = propertyContext.expression().getText();
                properties.put(key, value);
            }
        }
        return properties;
    }

    private DatabaseName parseDatabaseName(SqlBaseParser.QualifiedNameContext ctx) {
        if (ctx.identifier().size() == 2) {
            return new DatabaseName(Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(0).getText())),
                    ModelHelper.dealNameMark(ctx.identifier().get(1).getText()));
        } else if (ctx.identifier().size() == 1) {
            return new DatabaseName(Optional.empty(), ModelHelper.dealNameMark(ctx.identifier().get(0).getText()));
        } else {
            throw PrestoTableLineageAstBuilder.parseError("parse DatabaseName multipart error: " + ctx.identifier().size(), ctx);
        }
    }

    protected TableName parseTableName(SqlBaseParser.QualifiedNameContext ctx) {
        if (ctx.identifier().size() == 4) {
            return new TableName(Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(0).getText())),
                    Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(1).getText())),
                    ModelHelper.dealNameMark(ctx.identifier().get(2).getText()),
                    Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(3).getText())));
        } else if (ctx.identifier().size() == 3) {
            return new TableName(Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(0).getText())),
                    Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(1).getText())),
                    ModelHelper.dealNameMark(ctx.identifier().get(2).getText()));
        } else if (ctx.identifier().size() == 2) {
            return new TableName(Optional.empty(), Optional.of(ModelHelper.dealNameMark(ctx.identifier().get(0).getText())),
                    ModelHelper.dealNameMark(ctx.identifier().get(1).getText()));
        } else if (ctx.identifier().size() == 1) {
            return new TableName(Optional.empty(), Optional.empty(), ModelHelper.dealNameMark(ctx.identifier().get(0).getText()));
        } else {
            throw PrestoTableLineageAstBuilder.parseError("parse TableName multipart error: " + ctx.identifier().size(), ctx);
        }
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
