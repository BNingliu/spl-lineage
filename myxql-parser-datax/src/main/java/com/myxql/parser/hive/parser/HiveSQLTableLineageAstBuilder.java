package com.myxql.parser.hive.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.hive.antlr4.HplsqlBaseVisitor;
import com.myxql.parser.hive.antlr4.HplsqlParser;
import com.myxql.parser.model.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

public class HiveSQLTableLineageAstBuilder extends HplsqlBaseVisitor<StatementLineage> {
    private Integer dbType;

    public HiveSQLTableLineageAstBuilder(Integer dbType) {
        this.dbType = dbType;
    }

    private StatementType currentOptType = StatementType.UNKOWN;
    private TableData tableData = new TableData();
    private Optional<String> multiInsertToken = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private String command = "";
    private InsertMode insertMode = InsertMode.OVERWRITE;
    private String querySql = null;
    private List<List<String>> values = new ArrayList();
    private List<List<String>> singleValues = new ArrayList();
    private LinkedHashMap<String, String> partitions = new LinkedHashMap();

    private Boolean insertSql = false;
    private Boolean isCTE = false;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = command;
    }

    @Override
    public StatementLineage visitBlock(HplsqlParser.BlockContext ctx) {
        System.out.println("visitBlock, ctx="+ctx.getText());
        if(ctx.stmt().size() > 1) {
            throw HiveSQLTableLineageAstBuilder.parseError("不支持多个SQL的block", ctx);
        }
        StatementLineage data = visit(ctx.stmt(0));
        if (data == null) {
            throw HiveSQLTableLineageAstBuilder.parseError("不支持的SQL: ", ctx);
        }

        return data;
    }

    @Override
    public StatementLineage visitStmt(HplsqlParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    private Pair<String, String> parseKeyValueProperty(String str) {
        String rest[] = str.split("=");
        return Pair.of(rest[0], rest[1]);
    }

    // ---------- database ------------------
    @Override
    public StatementLineage visitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx) {
        // 库名
        String databaseName = ctx.expr().getText();

        String location = null;
        String comment = null;
        Map<String, String> properties = new HashMap<>();
        for(HplsqlParser.Create_database_optionContext optionContext : ctx.create_database_option()) {
            if (optionContext.T_LOCATION() != null) {
                 location = ModelHelper.cleanQuote(optionContext.expr().getText());
            } else if (optionContext.T_COMMENT() != null) {
                comment = ModelHelper.cleanQuote(optionContext.expr().getText());
            } else {
                Pair<String, String> pair = this.parseKeyValueProperty(optionContext.getText());
                properties.put(pair.getLeft(), pair.getRight());
            }
        }

        Database sqlData = new Database(null, databaseName, Optional.ofNullable(location), Optional.ofNullable(comment), properties);

        StatementLineage statementLineage = new StatementLineage(StatementType.CREATE_DATABASE, Optional.of(sqlData));
        return statementLineage;
    }

    @Override
    public StatementLineage visitDrop_database(HplsqlParser.Drop_databaseContext ctx) {
        String databaseName = ctx.expr().getText();
        Database sqlData = new Database(null, databaseName);
        return new StatementLineage(StatementType.DROP_DATABASE, Optional.of(sqlData));
    }

    @Override
    public StatementLineage visitDrop_table(HplsqlParser.Drop_tableContext ctx) {
        if(ctx.T_TABLE() != null) {
            TableName tableName = TableName.parseTableName(ctx.table_name().getText());
            Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
            table.setIfExists(ctx.T_EXISTS() != null);
            return new StatementLineage(StatementType.DROP_TABLE, Optional.of(table));
        } else if(ctx.T_VIEW() != null) {
            TableName tableName = TableName.parseTableName(ctx.table_name().getText());
            View table = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
            table.setIfExists(ctx.T_EXISTS() != null);
            return new StatementLineage(StatementType.DROP_VIEW, Optional.of(table));
        } else {
            throw HiveSQLTableLineageAstBuilder.parseError("不不支持的删除语句", ctx);
        }
    }

    @Override
    public StatementLineage visitTruncate_stmt(HplsqlParser.Truncate_stmtContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.TRUNCATE_TABLE, Optional.of(table));
    }

    // ---------- table ----------------------
    @Override
    public StatementLineage visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());
        String fileFormat = null;

        List<HplsqlParser.Create_table_preoptions_itemContext> preoptionsItems = Optional.ofNullable(ctx.create_table_preoptions())
                .map(HplsqlParser.Create_table_preoptionsContext::create_table_preoptions_item)
                .orElse(new ArrayList<>());
        for(HplsqlParser.Create_table_preoptions_itemContext preoptionsItem : preoptionsItems) {
            if(preoptionsItem.create_table_options_hive_item() != null) {
                HplsqlParser.Create_table_options_hive_itemContext hiveItemContext = preoptionsItem.create_table_options_hive_item();
                if(hiveItemContext.ident() != null) { // stored as
                    fileFormat = hiveItemContext.ident().getText();
                } else if(hiveItemContext.create_table_hive_row_format() != null) {
                    // todo
                }
            }
        }

        String comment = null;
        List<Column> columns = new ArrayList<>();
        List<Column> partitionColumns = new ArrayList<>();
        List<String> partitionColumnNames = new ArrayList<>();
        if(ctx.create_table_definition() != null) {
            HplsqlParser.Create_table_columnsContext columnsContext = ctx.create_table_definition().create_table_columns();
            if(columnsContext != null) {
                columns = columnsContext.create_table_columns_item().stream().map(it -> {
                    String colName = it.column_name().getText();
                    String dataType = it.dtype().getText();
                    Optional<String> colComment = Optional.ofNullable(it.column_comment())
                            .map(RuleContext::getText)
                            .map(ModelHelper::cleanQuote);
                    return new Column(colName, Optional.of(dataType), colComment, true);
                }).collect(Collectors.toList());
            }
            List<HplsqlParser.Create_table_options_itemContext> optionsItemContexts = Optional.ofNullable(ctx.create_table_definition().create_table_options())
                    .map(HplsqlParser.Create_table_optionsContext::create_table_options_item)
                    .orElse(new ArrayList<>());

            for(HplsqlParser.Create_table_options_itemContext optionsItem : optionsItemContexts) {
                if(optionsItem.create_table_options_hive_item() != null) {
                    HplsqlParser.Create_table_options_hive_itemContext hiveItemContext = optionsItem.create_table_options_hive_item();
                    if(hiveItemContext.T_STORED() != null) { // stored as
                        fileFormat = hiveItemContext.ident().getText();
                    } else if(hiveItemContext.T_COMMENT() != null) {
                        comment = hiveItemContext.expr().getText();
                    } else if(hiveItemContext.partitioning != null) {
                        partitionColumns = hiveItemContext.partitioning.fields.stream()
                                .map(item -> {
                                    String colName = ModelHelper.dealNameMark(item.ident().getText());
                                    String dataType = Optional.ofNullable(item.dtype())
                                            .map(RuleContext::getText)
                                            .map(ModelHelper::cleanQuote)
                                            .orElse("");
                                    if(!dataType.equals("")) {
                                        checkPartitionDataType(dataType);
                                    }

                                    String partitionComment = Optional.ofNullable(item.expr())
                                            .map(RuleContext::getText)
                                            .orElse("");
                                    partitionColumnNames.add(colName);
                                    return new Column(colName, Optional.ofNullable(dataType), Optional.ofNullable(partitionComment), true);
                                }).collect(Collectors.toList());

                    } else if(hiveItemContext.create_table_hive_row_format() != null) {
                        // todo
                    }
                }
            }

        }

        Map<String, String> properties = new HashMap();
        // todo

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.ofNullable(partitionColumns), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.ofNullable(fileFormat));
        table.setPartitionColumnNames(Optional.of(partitionColumnNames));

        HplsqlParser.Create_table_definitionContext definitionContext = ctx.create_table_definition();
        if (definitionContext.select_stmt() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT;
//            String querySql = StringUtils.substring(command, definitionContext.select_stmt().start.getStartIndex());
            String querySql = this.subSourceSql(definitionContext.select_stmt());
            table.setQuerySql(Optional.of(querySql));
            super.visitSelect_stmt(definitionContext.select_stmt());
            table.setTableData(Optional.of(this.tableData));
            return new StatementLineage(StatementType.CREATE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
        } else if(definitionContext.T_LIKE() != null) {
            TableName oldTableName = TableName.parseTableName(definitionContext.table_name().getText());

            CreateTableLike dcTable = new CreateTableLike(oldTableName.getDatabaseName(), Optional.ofNullable(oldTableName.getTableName()), table.getDatabaseName(), table.getTableName());
            dcTable.setIfNotExists(ctx.T_NOT() != null);

            return new StatementLineage(StatementType.CREATE_TABLE_AS_LIKE, Optional.of(dcTable));
        } else {
            return new StatementLineage(StatementType.CREATE_TABLE, Optional.of(table));
        }
    }

    @Override
    public StatementLineage visitDescribe_stmt(HplsqlParser.Describe_stmtContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());
        Table sqlData = new Table(
                tableName.getCatalogName(),
                tableName.getDatabaseName(),
                tableName.getTableName()
        );
        return new StatementLineage(StatementType.DESC_DATABASE, Optional.of(sqlData));
    }

    // ---------- select ----------------------
    @Override
    public StatementLineage visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        if(ctx.cte_select_stmt() != null) {
/*
            this.isCTE = true;
System.out.println("visitSelect_stmt, xxxxxxxxxxxxxxxxx");
            List<HplsqlParser.Cte_select_stmt_itemContext> cteSelectItems = ctx.cte_select_stmt().cte_select_stmt_item();
            for(HplsqlParser.Cte_select_stmt_itemContext cteSelectItem : cteSelectItems) {
                List<HplsqlParser.Fullselect_stmt_itemContext> fullselectItems = cteSelectItem.fullselect_stmt().fullselect_stmt_item();
                for(HplsqlParser.Fullselect_stmt_itemContext fullselectItem : fullselectItems) {
                    if(fullselectItem.fullselect_stmt() != null) {
                        this.visit(fullselectItem.fullselect_stmt());
                    } else if(fullselectItem.subselect_stmt() != null) {
                        this.visit(fullselectItem.subselect_stmt());
                    } else {
                        HiveSQLTableLineageAstBuilder.parseError("不支持的Fullselect_stmt_item", fullselectItem);
                    }
                }
            }
 */
            this.parseCteTemplates(ctx.cte_select_stmt());
        }
        if (StringUtils.equalsIgnoreCase("select", ctx.start.getText())) {
            this.currentOptType = StatementType.SELECT;
            super.visitSelect_stmt(ctx);

            this.tableData.setLimit(this.limit);
            return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
        }
        return null;
    }

    @Override
    public StatementLineage visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        // from table
        Optional.ofNullable(ctx.from_clause())
                .map(HplsqlParser.From_clauseContext::from_table_clause)
                .map(HplsqlParser.From_table_clauseContext::from_table_name_clause)
                .map(HplsqlParser.From_table_name_clauseContext::table_name)
                .map(RuleContext::getText)
                .map((m)->TableName.parseTableName(m,dbType))
                .map(tableName -> {
                    this.tableData.getInputTables().add(tableName);
                    return null;
                });

        // join table
        List<HplsqlParser.From_join_clauseContext> joinClauseContexts = Optional.ofNullable(ctx.from_clause())
                .map(HplsqlParser.From_clauseContext::from_join_clause).orElse(new ArrayList<>());
        for(HplsqlParser.From_join_clauseContext joinClauseContext: joinClauseContexts) {
            Optional.ofNullable(joinClauseContext.from_table_clause())
                    .map(HplsqlParser.From_table_clauseContext::from_table_name_clause)
                    .map(HplsqlParser.From_table_name_clauseContext::table_name)
                    .map(RuleContext::getText)
                    .map((m)->TableName.parseTableName(m,dbType))
                    .map(tableName -> this.tableData.getInputTables().add(tableName));
        }

        return super.visitSubselect_stmt(ctx);
    }

    @Override
    public StatementLineage visitSelect_options_item(HplsqlParser.Select_options_itemContext ctx) {
        if(ctx.T_LIMIT() != null) {
            String strLimit = ctx.expr().getText();
            this.limit = Optional.ofNullable(Integer.valueOf(strLimit));
        }
        return null;
    }

    @Override
    public StatementLineage visitInsert_stmt(HplsqlParser.Insert_stmtContext ctx) {
        TableName tableName = TableName.parseTableName(ctx.table_name().getText());
        TableName table = new TableName(
                tableName.getCatalogName(),
                tableName.getDatabaseName(),
                tableName.getTableName(),
                dbType
        );
        this.tableData.getOutpuTables().add(table);

        // insert mode
        if(ctx.T_OVERWRITE() != null) {
            this.insertMode = InsertMode.OVERWRITE;
        } else {
            this.insertMode = InsertMode.INTO;
        }
        this.tableData.setInsertMode(Optional.of(this.insertMode));

        // partition
        if(ctx.partitionSpec() != null) {
            List<HplsqlParser.Partition_clauseContext> partitionClauseContexts = ctx.partitionSpec().partition_clause();
            for (HplsqlParser.Partition_clauseContext partitionContext : partitionClauseContexts) {
                this.partitions.put(partitionContext.ident().getText(), partitionContext.expr().getText());
            }
            this.tableData.setPartitions(Optional.of(this.partitions));
        }

        if(ctx.select_stmt() != null) {
            this.visitSelect_stmt(ctx.select_stmt());
            this.currentOptType = StatementType.INSERT_SELECT;
            if (this.currentOptType == StatementType.INSERT_SELECT) {
                String querySql = this.subSourceSql(ctx.select_stmt());
                if(ctx.cte_select_stmt() != null) {
                    this.parseCteTemplates(ctx.cte_select_stmt());
                }
                return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(this.tableData), Optional.of(querySql), Optional.empty());
            }
        }
        if(ctx.insert_stmt_rows() != null) {
            this.currentOptType = StatementType.INSERT_VALUES;
            for(HplsqlParser.Insert_stmt_rowContext rowContext : ctx.insert_stmt_rows().insert_stmt_row()) {
                List<String> rowValue = rowContext.expr()
                        .stream()
                        .map(RuleContext::getText)
                        .collect(Collectors.toList());
                this.values.add(rowValue);
            }

            // todo
            if (this.currentOptType == StatementType.INSERT_VALUES) {
                if (this.values.size() != 0) {
                    return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(values));
                } else {
                    return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(singleValues));
                }
            } else {
                return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(tableData), Optional.of(querySql), Optional.empty());
            }
        }

        return null;
    }

    private void parseCteTemplates(HplsqlParser.Cte_select_stmtContext ctx) {
        this.isCTE = true;
        for(HplsqlParser.Cte_select_stmt_itemContext itemContext : ctx.cte_select_stmt_item()) {
            this.currentOptType = StatementType.SELECT;
            this.visitCte_select_stmt_item(itemContext);
            this.tableData.setLimit(limit);
        }
        for(String cteIdent : this.tableData.getCteTempTables()) {
            Iterator<TableName> it = this.tableData.getInputTables().iterator();
            while (it.hasNext()) {
                TableName cteTable = it.next();
                if (cteTable.getDatabaseName().get().isEmpty() && cteIdent.equals(cteTable.getTableName())) {
                    it.remove();
                }
            }
        }
    }

    @Override
    public StatementLineage visitCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx) {
        if (this.isCTE) {
            this.tableData.getCteTempTables().add(ctx.ident().getText());
        }
        return super.visitCte_select_stmt_item(ctx);
    }

    /**
     * 分区支持数据类型
     */
    private Boolean checkPartitionDataType(String dataType) {
        Boolean ret = false;
        switch (dataType.toLowerCase()) {
            case "string":
            case "int":
            case "bigint":
                ret = true;
                break;
            default:
                throw new IllegalStateException("不支持数据类型：" + dataType);
        }
        return ret;
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream()
                .map(this::visit)
                .map(clazz::cast)
                .collect(toList());
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
