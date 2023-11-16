package com.myxql.parser.spark.parser;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.spark.antlr4.SqlBaseParser;
import com.myxql.parser.spark.antlr4.SqlBaseParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class SparkSQLTableLineageAstBuilder extends SqlBaseParserBaseVisitor<StatementLineage> {
    private StatementType currentOptType = StatementType.UNKOWN;
    private TableData tableData = new TableData();
    private Optional<String> multiInsertToken = Optional.empty();
    private Optional<Integer> limit = Optional.empty();
    private Optional<String> command = Optional.empty();
    private InsertMode insertMode = InsertMode.OVERWRITE;
    private String querySql = null;
    private List<List<String>> values = new ArrayList();
    private List<List<String>> singleValues = new ArrayList();
    private LinkedHashMap<String, String> partitions = new LinkedHashMap();

    private Boolean insertSql = false;
    private Boolean isCTE = false;

    public void setCommand(String command) {
        Objects.requireNonNull(command, "command is null");
        this.command = Optional.of(command);
    }

    @Override
    public StatementLineage visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        StatementLineage data = visit(ctx.statement());
        if (data == null) {
            throw SparkSQLTableLineageAstBuilder.parseError("不支持的SQL: " + command, ctx);
        }

        return data;
    }


    private DatabaseName parseDatabase(SqlBaseParser.MultipartIdentifierContext ctx) {
        if (ctx.parts.size() == 2) {
            return new DatabaseName(Optional.of(ctx.parts.get(0).getText()), ctx.parts.get(1).getText());
        } else if (ctx.parts.size() == 1) {
            return new DatabaseName(Optional.empty(), ctx.parts.get(0).getText());
        } else {
            throw SparkSQLTableLineageAstBuilder.parseError("parse DatabaseName multipart error: " + ctx.parts.size(), ctx);
        }
    }

    protected TableName parseTableName(SqlBaseParser.MultipartIdentifierContext ctx) {
        if (ctx.parts.size() == 4) {
            return new TableName(Optional.of(ctx.parts.get(0).getText()), Optional.of(ctx.parts.get(1).getText()),
                    ctx.parts.get(2).getText(), Optional.of(ctx.parts.get(3).getText()));
        } else if (ctx.parts.size() == 3) {
            return new TableName(Optional.of(ctx.parts.get(0).getText()), Optional.of(ctx.parts.get(1).getText()), ctx.parts.get(2).getText());
        } else if (ctx.parts.size() == 2) {
            return new TableName(Optional.empty(), Optional.of(ctx.parts.get(0).getText()), ctx.parts.get(1).getText());
        } else if (ctx.parts.size() == 1) {
            return new TableName(Optional.empty(), Optional.empty(), ctx.parts.get(0).getText());
        } else {
            throw SparkSQLTableLineageAstBuilder.parseError("parse TableName multipart error: " + ctx.parts.size(), ctx);
        }
    }

    private Pair<Boolean, String> parseColDefinition(List<SqlBaseParser.ColDefinitionOptionContext> colDefs) {
        Boolean isNullable = true;
        String strCommet = "";
        for(SqlBaseParser.ColDefinitionOptionContext colDef : colDefs) {
            isNullable = Optional.ofNullable(colDef)
                    .map(RuleContext::getText)
                    .map(item -> {
                        if(item != null) return true; else return false;
                    }).orElse(false);
            strCommet = Optional.ofNullable(colDef)
                    .map(SqlBaseParser.ColDefinitionOptionContext::commentSpec)
                    .map(SqlBaseParser.CommentSpecContext::stringLit)
                    .map(RuleContext::getText)
                    .map(ModelHelper::cleanQuote)
                    .orElse(null);
        }

        return Pair.of(isNullable, strCommet);
    }

    private AlterColumnAction parseAlterColumnAction(SqlBaseParser.AlterColumnActionContext ctx) {
        AlterColumnAction action = new AlterColumnAction();
        Optional.ofNullable(ctx.dataType()).ifPresent(dt -> {
            action.setDataType(Optional.of(StringUtils.substring(command.get(), dt.start.getStartIndex(), dt.stop.getStopIndex() + 1)));
        });
        Optional.ofNullable(ctx.commentSpec()).ifPresent(cs -> {
            action.setComment(Optional.of(ModelHelper.cleanQuote(cs.stringLit().getText())));
        });
        Optional.ofNullable(ctx.colPosition()).ifPresent(cp -> {
            Optional.ofNullable(cp.FIRST()).ifPresent(first -> {
                action.setPosition(Optional.of("first"));
            });
            Optional.ofNullable(cp.AFTER()).ifPresent(after -> {
                action.setPosition(Optional.of("after"));
                action.setAfterCol(Optional.of(cp.afterCol.getText()));
            });
        });
        Optional.ofNullable(ctx.setOrDrop).ifPresent(od -> {
            if (StringUtils.containsIgnoreCase(od.getText(), "drop")) {
                action.setSetOrDrop(Optional.of("DROP"));
            } else {
                action.setSetOrDrop(Optional.of("SET"));
            }
        });
        Optional.ofNullable(ctx.defaultExpression()).ifPresent(de -> {
            SqlBaseParser.ExpressionContext expr = ctx.defaultExpression().expression();
            action.setDefaultExpression(Optional.of(StringUtils.substring(command.get(), expr.start.getStartIndex(),
                    expr.stop.getStopIndex() + 1)));
        });
        Optional.ofNullable(ctx.dropDefault).ifPresent(dd -> action.setDropDefault(true));

        return action;
    }

    // ---------- database ------------------
    @Override
    public StatementLineage visitCreateNamespace(SqlBaseParser.CreateNamespaceContext ctx) {
        DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());

        List<String> locations = ctx.locationSpec().stream()
                .map(SqlBaseParser.LocationSpecContext::stringLit)
                .map(RuleContext::getText)
                .map(ModelHelper::cleanQuote)
                .collect(Collectors.toList());
        String location = locations.size()>0 ? locations.get(0) : "";

        Database sqlData = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName(), Optional.of(location));

        StatementLineage statementLineage = new StatementLineage(StatementType.CREATE_DATABASE, Optional.of(sqlData));
        return statementLineage;
    }

    @Override
    public StatementLineage visitDropNamespace(SqlBaseParser.DropNamespaceContext ctx) {
        DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());
        Database sqlData = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName());
        return new StatementLineage(StatementType.DROP_DATABASE, Optional.of(sqlData));
    }

    @Override
    public StatementLineage visitDescribeNamespace(SqlBaseParser.DescribeNamespaceContext ctx) {
        DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());
        Database sqlData = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName());
        return new StatementLineage(StatementType.DESC_DATABASE, Optional.of(sqlData));
    }

    @Override
    public StatementLineage visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        if (ctx.getChildCount() > 2) {
            DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());
            return new StatementLineage(StatementType.SHOW_TABLES, Optional.of(new Database(databaseName.getCatalogName(), databaseName.getDatabaseName())));
        } else {
            return new StatementLineage(StatementType.SHOW_TABLES);
        }
    }

    @Override
    public StatementLineage visitShowViews(SqlBaseParser.ShowViewsContext ctx) {
        if (ctx.getChildCount() > 2) {
            DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());
            return new StatementLineage(StatementType.SHOW_VIEWS, Optional.of(new Database(databaseName.getCatalogName(), databaseName.getDatabaseName())));
        } else {
            return new StatementLineage(StatementType.SHOW_VIEWS);
        }
    }

    // ---------- table ----------------------
    @Override
    public StatementLineage visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        TableName tableName = Optional.ofNullable(ctx.createTableHeader())
                .map(SqlBaseParser.CreateTableHeaderContext::multipartIdentifier)
                .map(this::parseTableName)
                .orElse(null);
        List<SqlBaseParser.CommentSpecContext> commentSpecList = Optional.ofNullable(ctx.createTableClauses().commentSpec()).orElse(new ArrayList());
        String comment = null;
        for(SqlBaseParser.CommentSpecContext commentSpec: commentSpecList) {
            comment = Optional.ofNullable(commentSpec)
                    .map(SqlBaseParser.CommentSpecContext::stringLit)
                    .map(RuleContext::getText)
                    .orElse(null);
        }

        ctx.children.forEach(it -> {
            if (it instanceof SqlBaseParser.RowFormatDelimitedContext) {
                throw SparkSQLTableLineageAstBuilder.parseError("不支持row format 语法", (SqlBaseParser.RowFormatDelimitedContext)it);
            } else if (it instanceof SqlBaseParser.RowFormatSerdeContext) {
                throw SparkSQLTableLineageAstBuilder.parseError("不支持row format 语法", (SqlBaseParser.RowFormatSerdeContext)it);
            }
        });

        List<Column> partitionColumns = new ArrayList<>();
        List<String> partitionColumnNames = new ArrayList<>();
        List<Column> columns = new ArrayList<>();
        String createTableType = "spark";
        if (ctx.query() == null) {
            columns = ctx.createOrReplaceTableColTypeList().createOrReplaceTableColType()
                    .stream().map(it -> {
                        String colName = it.colName.getText();
                        String dataType = it.dataType().getText();
                        Pair colDefinition = parseColDefinition(it.colDefinitionOption());
                        String value1 = colDefinition.getRight() != null ? (String) colDefinition.getRight() : "";
                        Boolean value0 = colDefinition.getLeft() != null ? (Boolean) colDefinition.getLeft() : false;
                        return new Column(colName, Optional.of(dataType), Optional.of(value1), value0);
                    }).collect(Collectors.toList());

            if (ctx.tableProvider() == null) {
                createTableType = "hive";
            }

            if (ctx.createTableClauses().partitioning != null) {
                if ("spark".equals(createTableType)) {
                    ctx.createTableClauses().partitioning.children.stream()
                            .filter(it -> it instanceof SqlBaseParser.PartitionTransformContext)
                            .map(item -> {
                                SqlBaseParser.PartitionTransformContext column = (SqlBaseParser.PartitionTransformContext) item;
                                partitionColumnNames.add(column.getText());
                                return partitionColumnNames;
                            }).collect(Collectors.toList());

                    if (partitionColumnNames.size() == 0) {
                        throw SparkSQLTableLineageAstBuilder.parseError("spark create table 语法创建表，创建分区字段语法错误，请参考文档", ctx);
                    }
                } else {
                    partitionColumns = ctx.createTableClauses().partitioning.children.stream()
                            .filter(it -> it instanceof SqlBaseParser.PartitionColumnContext)
                            .map(item -> {
                                SqlBaseParser.PartitionColumnContext column = (SqlBaseParser.PartitionColumnContext)item;
                                String colName = column.colType().colName.getText();
                                String dataType = column.colType().dataType().getText();
                                checkPartitionDataType(dataType);

                                partitionColumnNames.add(colName);
                                String colComment = column.colType().commentSpec() != null ? ModelHelper.cleanQuote(column.colType().commentSpec().getText()) : null;
                                return new Column(colName, Optional.ofNullable(dataType), Optional.ofNullable(colComment), true);
                            }).collect(Collectors.toList());
                }
            }
        } else {
            if (ctx.createTableClauses().partitioning != null) {
                ctx.createTableClauses().partitioning.children.stream()
                        .filter(it -> it instanceof SqlBaseParser.PartitionTransformContext)
                        .map(item -> {
                            SqlBaseParser.PartitionTransformContext column = (SqlBaseParser.PartitionTransformContext) item;
                            partitionColumnNames.add(column.getText());
                            return partitionColumnNames;
                        });
            }
        }



        Map<String, String> properties = new HashMap();
        if (ctx.createTableClauses().tableProps != null) {
            for(ParseTree parseTree : ctx.createTableClauses().tableProps.children) {
                if(parseTree instanceof SqlBaseParser.PropertyContext) {
                    SqlBaseParser.PropertyContext property = (SqlBaseParser.PropertyContext) parseTree;
                    String key = ModelHelper.cleanQuote(property.key.getText());
                    String value = ModelHelper.cleanQuote(property.value.getText());
                    properties.put(key, value);
                }
            }
        }

        String fileFormat = Optional.ofNullable(ctx.tableProvider()).map(it -> it.multipartIdentifier()).map(it -> it.getText()).orElse(null);
        if (ctx.createTableClauses().createFileFormat().size() == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().getText();
        }

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.ofNullable(partitionColumns), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.ofNullable(fileFormat));
        table.setCreateTableType(createTableType);
        table.setIfNotExists(ctx.createTableHeader().NOT() != null);
        table.setExternal(ctx.createTableHeader().EXTERNAL() != null);
        table.setTemporary(ctx.createTableHeader().TEMPORARY() != null);
        table.setLocation(ctx.createTableClauses().locationSpec().size() > 0);
        if (table.getLocation()) {
            table.setLocationPath(Optional.of(ctx.createTableClauses().locationSpec().get(0).getText()));
        }

        if (fileFormat != null && "hudi".equals(fileFormat.toLowerCase())) {
            String primaryKey = (String) properties.get("primaryKey");
            if (StringUtils.isNotBlank(primaryKey)) {
                List<String> primaryKeys = Arrays.asList(StringUtils.split(primaryKey, ","));
                table.setHudiPrimaryKeys(primaryKeys.stream().map(it -> StringUtils.trim(it)).collect(Collectors.toList()));
            }

            String type = (String) properties.getOrDefault("type", "COW");
            if (StringUtils.isNotBlank(type)) {
                table.setHudiType(type);
            }

            String preCombineField = (String) properties.getOrDefault("preCombineField", "");
            if (StringUtils.isNotBlank(preCombineField)) {
                table.setPreCombineField(preCombineField);
            }
        }

        table.setPartitionColumnNames(Optional.of(partitionColumnNames));

        if (ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT;
            String querySql = StringUtils.substring(command.get(), ctx.query().start.getStartIndex());
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")");
            }

            table.setQuerySql(Optional.of(querySql));
            super.visitQuery(ctx.query());
            table.setTableData(Optional.of(this.tableData));
            return new StatementLineage(StatementType.CREATE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
        } else {
            return new StatementLineage(StatementType.CREATE_TABLE, Optional.of(table));
        }
    }

    @Override
    public StatementLineage visitReplaceTable(SqlBaseParser.ReplaceTableContext ctx) {
        TableName tableName = parseTableName(ctx.replaceTableHeader().multipartIdentifier());
        String comment = ctx.createTableClauses().commentSpec().size() > 0 ? ModelHelper.cleanQuote(ctx.createTableClauses().commentSpec(0).getText()) : null;

        ctx.children.stream()
                .map(it -> {
                    if (it instanceof SqlBaseParser.RowFormatDelimitedContext) {
                        throw SparkSQLTableLineageAstBuilder.parseError("不支持row format 语法", (SqlBaseParser.RowFormatDelimitedContext) it);
                    } else if (it instanceof SqlBaseParser.RowFormatSerdeContext) {
                        throw SparkSQLTableLineageAstBuilder.parseError("不支持row format 语法", (SqlBaseParser.RowFormatSerdeContext) it);
                    }
                    return null;
                });

        List<Column> partitionColumns = new ArrayList<>();
        List<String> partitionColumnNames = new ArrayList<>();
        List<Column> columns = new ArrayList<>();
        // 默认为hive
        AtomicReference<String> createTableType = new AtomicReference<>("hive");
        SqlBaseParser.QueryContext queryContext1 = Optional.ofNullable(ctx.query()).get();

        if(queryContext1!=null){
            Optional.ofNullable(ctx.createTableClauses())
                    .map(SqlBaseParser.CreateTableClausesContext::partitionFieldList)
                    .filter(it -> it instanceof SqlBaseParser.PartitionTransformContext)
                    .ifPresent(fields ->
                            fields.stream()
                                    .map(SqlBaseParser.PartitionFieldListContext::partitionField)
                                    .map(items -> items.stream()
                                            .map(RuleContext::getText)
                                            .map(partitionColumnNames::add))
                    );

        }else {
            Optional.ofNullable(ctx.createOrReplaceTableColTypeList())
                    .map(SqlBaseParser.CreateOrReplaceTableColTypeListContext::createOrReplaceTableColType)
                    .ifPresent(colTypes -> {
                        colTypes.stream().map(it -> {
                            String colName = it.colName.getText();
                            String dataType = it.dataType().getText();
                            Pair pair = parseColDefinition(it.colDefinitionOption());
                            Column column = new Column(colName, Optional.of(dataType), Optional.ofNullable((String) pair.getRight()), (Boolean) pair.getLeft());
                            columns.add(column);
                            return null;
                        });
                    });

            Optional.ofNullable(ctx.tableProvider()).ifPresent(it -> {
                createTableType.set("spark");
            });

            Optional.ofNullable(ctx.createTableClauses().partitioning).ifPresent(pflc -> {
                if ("spark".equals(createTableType.get())) {
                    for(ParseTree it : ctx.createTableClauses().partitioning.children) {
                        if(it instanceof SqlBaseParser.PartitionTransformContext) {
                            SqlBaseParser.PartitionTransformContext column = (SqlBaseParser.PartitionTransformContext) it;
                            partitionColumnNames.add(column.getText());
                        }
                    }
                    if (partitionColumnNames.size() == 0) {
                        throw SparkSQLTableLineageAstBuilder.parseError("spark create table 语法创建表，创建分区字段语法错误，请参考文档", pflc);
                    }
                } else {
                    List<Column> ptColumns = ctx.createTableClauses().partitioning.children.stream()
                            .filter(it -> it instanceof SqlBaseParser.PartitionColumnContext)
                            .map(item -> {
                                SqlBaseParser.PartitionColumnContext column = (SqlBaseParser.PartitionColumnContext) item;
                                String colName = column.colType().colName.getText();
                                String dataType = column.colType().dataType().getText();
                                checkPartitionDataType(dataType);

                                partitionColumnNames.add(colName);
                                String colComment = column.colType().commentSpec() != null ? ModelHelper.cleanQuote(column.colType().commentSpec().getText()) : null;
                                return new Column(colName, Optional.of(dataType), Optional.of(colComment), true);
                            }).collect(Collectors.toList());
                    partitionColumns.addAll(ptColumns);
                }
            });
        }

//        Optional.ofNullable(ctx.query()).ifPresentOrElse(
//                (queryContext -> { // ctx.query == null
//                    Optional.ofNullable(ctx.createTableClauses())
//                            .map(SqlBaseParser.CreateTableClausesContext::partitionFieldList)
//                            .filter(it -> it instanceof SqlBaseParser.PartitionTransformContext)
//                            .ifPresent(fields ->
//                                fields.stream()
//                                        .map(SqlBaseParser.PartitionFieldListContext::partitionField)
//                                        .map(items -> items.stream()
//                                                .map(RuleContext::getText)
//                                                .map(partitionColumnNames::add))
//                            );
//                }),
//                () -> { // ctx.query == null
//                    Optional.ofNullable(ctx.createOrReplaceTableColTypeList())
//                            .map(SqlBaseParser.CreateOrReplaceTableColTypeListContext::createOrReplaceTableColType)
//                            .ifPresent(colTypes -> {
//                                colTypes.stream().map(it -> {
//                                    String colName = it.colName.getText();
//                                    String dataType = it.dataType().getText();
//                                    Pair pair = parseColDefinition(it.colDefinitionOption());
//                                    Column column = new Column(colName, Optional.of(dataType), Optional.ofNullable((String) pair.getRight()), (Boolean) pair.getLeft());
//                                    columns.add(column);
//                                    return null;
//                                });
//                            });
//
//                    Optional.ofNullable(ctx.tableProvider()).ifPresent(it -> {
//                        createTableType.set("spark");
//                    });
//
//                    Optional.ofNullable(ctx.createTableClauses().partitioning).ifPresent(pflc -> {
//                        if ("spark".equals(createTableType.get())) {
//                            for(ParseTree it : ctx.createTableClauses().partitioning.children) {
//                                if(it instanceof SqlBaseParser.PartitionTransformContext) {
//                                    SqlBaseParser.PartitionTransformContext column = (SqlBaseParser.PartitionTransformContext) it;
//                                    partitionColumnNames.add(column.getText());
//                                }
//                            }
//                            if (partitionColumnNames.size() == 0) {
//                                throw SparkSQLTableLineageAstBuilder.parseError("spark create table 语法创建表，创建分区字段语法错误，请参考文档", pflc);
//                            }
//                        } else {
//                            List<Column> ptColumns = ctx.createTableClauses().partitioning.children.stream()
//                                    .filter(it -> it instanceof SqlBaseParser.PartitionColumnContext)
//                                    .map(item -> {
//                                        SqlBaseParser.PartitionColumnContext column = (SqlBaseParser.PartitionColumnContext) item;
//                                        String colName = column.colType().colName.getText();
//                                        String dataType = column.colType().dataType().getText();
//                                        checkPartitionDataType(dataType);
//
//                                        partitionColumnNames.add(colName);
//                                        String colComment = column.colType().commentSpec() != null ? ModelHelper.cleanQuote(column.colType().commentSpec().getText()) : null;
//                                        return new Column(colName, Optional.of(dataType), Optional.of(colComment), true);
//                                    }).collect(Collectors.toList());
//                            partitionColumns.addAll(ptColumns);
//                        }
//                    });
//                });


        Map properties = new HashMap<String, String>();

        Optional.ofNullable(ctx.createTableClauses().tableProps)
                .map(SqlBaseParser.PropertyListContext::property)
                .ifPresent(items -> {
                    for(SqlBaseParser.PropertyContext item : items) {
                        if(item instanceof SqlBaseParser.PropertyContext) {
                            SqlBaseParser.PropertyContext property = item;
                            String key = ModelHelper.cleanQuote(property.key.getText());
                            String value = ModelHelper.cleanQuote(property.value.getText());
                            properties.put(key, value);
                        }
                    }
                });

        String fileFormat = Optional.ofNullable(ctx.tableProvider())
                .map(it -> it.multipartIdentifier())
                .map(RuleContext::getText)
                .orElse(null);

        if (ctx.createTableClauses().createFileFormat().size() == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().getText();
        }
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(comment), Optional.empty(),
                Optional.ofNullable(partitionColumns), Optional.ofNullable(columns), Optional.ofNullable(properties), Optional.ofNullable(fileFormat));
        table.setCreateTableType(createTableType.get());

        List<SqlBaseParser.LocationSpecContext> locationSpecContextList = Optional.ofNullable(ctx.createTableClauses().locationSpec()).orElse(new ArrayList<>());
        table.setLocation(locationSpecContextList.size() > 0);
        if (table.getLocation()) {
            table.setLocationPath(Optional.of(locationSpecContextList.get(0).getText()));
        }

        if (fileFormat != null && "hudi".equals(fileFormat.toLowerCase())) {
            String primaryKey = (String) properties.get("primaryKey");
            if (StringUtils.isNotBlank(primaryKey)) {
                List<String> primaryKeys = Arrays.asList(StringUtils.split(primaryKey, ","));
                table.setHudiPrimaryKeys(primaryKeys.stream().map(it -> StringUtils.trim(it)).collect(Collectors.toList()));
            }

            String type = (String) properties.getOrDefault("type", "COW");
            if (StringUtils.isNotBlank(type)) {
                table.setHudiType(type);
            }

            String preCombineField = (String) properties.getOrDefault("preCombineField", "");
            if (StringUtils.isNotBlank(preCombineField)) {
                table.setPreCombineField(preCombineField);
            }
        }

        table.setPartitionColumnNames(Optional.of(partitionColumnNames));
        if (Optional.ofNullable(ctx.query()).isPresent()) {
            currentOptType = StatementType.REPLACE_TABLE_AS_SELECT;
            String querySql = StringUtils.substring(command.get(), ctx.query().start.getStartIndex());
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")");
            }

            table.setQuerySql(Optional.of(querySql));
            super.visitQuery(ctx.query());
            table.setTableData(Optional.of(this.tableData));
            return new StatementLineage(StatementType.REPLACE_TABLE_AS_SELECT, Optional.of(table), Optional.of(querySql), Optional.empty());
        } else {
            return new StatementLineage(StatementType.REPLACE_TABLE, Optional.of(table));
        }
    }

    @Override
    public StatementLineage visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        String newDatabaseName = Optional.ofNullable(ctx.target.db).map(RuleContext::getText).orElse(null);
        String newTableName = Optional.ofNullable(ctx.target.table).map(RuleContext::getText).orElse(null);

        String oldDatabaseName = Optional.ofNullable(ctx.source.db).map(RuleContext::getText).orElse(null);
        String oldTableName = Optional.ofNullable(ctx.source.table).map(RuleContext::getText).orElse(null);

        CreateTableLike dcTable = new CreateTableLike(Optional.of(oldDatabaseName), Optional.of(oldTableName), Optional.of(newDatabaseName), newTableName);
        dcTable.setIfNotExists(ctx.NOT() != null);

        return new StatementLineage(StatementType.CREATE_TABLE_AS_LIKE, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitDropTable(SqlBaseParser.DropTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        CommonToken token = new CommonToken(ctx.multipartIdentifier().start.getStartIndex(), ctx.multipartIdentifier().stop.getStopIndex());
        table.setIfExists(ctx.EXISTS() != null);
        table.setToken(Optional.of(token));
        return new StatementLineage(StatementType.DROP_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitDropView(SqlBaseParser.DropViewContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        view.setIfExists(ctx.EXISTS() != null);
        return new StatementLineage(StatementType.DROP_VIEW, Optional.of(view));
    }

    @Override
    public StatementLineage visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.TRUNCATE_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());
        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.MSCK_TABLE, Optional.of(table));
    }

    @Override
    public StatementLineage visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        TableName tableNameFrom = parseTableName(ctx.from);
        TableName tableNameTo = parseTableName(ctx.to);

        if (ctx.VIEW() != null) {
            RenameView dcView = new RenameView(tableNameFrom.getCatalogName(), tableNameFrom.getDatabaseName(), tableNameFrom.getTableName(), tableNameTo.getTableName());
            return new StatementLineage(StatementType.ALTER_VIEW_RENAME, Optional.of(dcView));
        } else {
            RenameTable dcTable = new RenameTable(tableNameFrom.getCatalogName(), tableNameFrom.getDatabaseName(), tableNameFrom.getTableName(), tableNameTo.getTableName());
            dcTable.setOldToken(Optional.of(new CommonToken(ctx.from.start.getStartIndex(), ctx.from.stop.getStopIndex())));
            dcTable.setNewToken(Optional.of(new CommonToken(ctx.to.start.getStartIndex(), ctx.to.stop.getStopIndex())));
            return new StatementLineage(StatementType.ALTER_TABLE_RENAME, Optional.of(dcTable));
        }
    }

    @Override
    public StatementLineage visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Map<String, String> properties = new HashMap<>();
        Optional.ofNullable(ctx.propertyList())
                .map(SqlBaseParser.PropertyListContext::property)
                .filter(it -> it instanceof SqlBaseParser.PropertyContext)
                .ifPresent(propertyList -> {
                    propertyList.stream().map(item -> {
                        SqlBaseParser.PropertyContext property = item;
                        String key = ModelHelper.cleanQuote(property.key.getText());
                        String value = ModelHelper.cleanQuote(property.value.getText());
                        properties.put(key, value);
                        return null;
                    });
                });

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty(), Optional.of(properties), Optional.empty(), false,
                false, false, false,false, Optional.empty(), Optional.empty(),
                Optional.empty(), Optional.empty());

        if (!Optional.ofNullable(ctx.VIEW()).isPresent()) {
            return new StatementLineage(StatementType.ALTER_TABLE_PROPERTIES, Optional.of(data));
        } else {
            return new StatementLineage(StatementType.ALTER_VIEW_PROPERTIES, Optional.of(data));
        }
    }

    @Override
    public StatementLineage visitAddTableColumns(SqlBaseParser.AddTableColumnsContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());
        List<Column> columns = ctx.columns.children.stream()
            .filter(it -> it instanceof SqlBaseParser.QualifiedColTypeWithPositionContext)
            .map(item -> {
                SqlBaseParser.QualifiedColTypeWithPositionContext column = (SqlBaseParser.QualifiedColTypeWithPositionContext) item;
                String colName = Optional.ofNullable(column.multipartIdentifier()).map(RuleContext::getText).orElse(null);
                String dataType = Optional.ofNullable(column.dataType()).map(RuleContext::getText).orElse(null);
                Optional<SqlBaseParser.CommentSpecContext> commentSpec = Optional.ofNullable(column.commentSpec());
                String colComment = commentSpec.map(RuleContext::getText).map(ModelHelper::cleanQuote).orElse(null);
                String position = null;
                String afterCol = null;
                if (column.colPosition() != null) {
                    if (column.colPosition().FIRST() != null) {
                        position = "first";
                    } else if (column.colPosition().AFTER() != null) {
                        position = "after";
                        afterCol = column.colPosition().afterCol.getText();
                    }
                }
                Column col = new Column(colName, Optional.ofNullable(dataType), Optional.ofNullable(colComment), false);
                col.setPosition(Optional.ofNullable(position));
                col.setAfterCol(Optional.ofNullable(afterCol));
                return col;
            }).collect(Collectors.toList());

        Table table = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(columns));
        table.setToken(Optional.of(new CommonToken(ctx.multipartIdentifier().start.getStartIndex(), ctx.multipartIdentifier().stop.getStopIndex())));
        if(ctx.COLUMNS() != null) {
            return new StatementLineage(StatementType.ALTER_TABLE_ADD_COLS, Optional.of(table));
        } else {
            return new StatementLineage(StatementType.ALTER_TABLE_ADD_COL, Optional.of(table));
        }
    }

    @Override
    public StatementLineage visitHiveChangeColumn(SqlBaseParser.HiveChangeColumnContext ctx) {
        TableName tableName = parseTableName(ctx.table);

        String columnName = ctx.colName.parts.get(0).getText();
        String dataType = ctx.colType().dataType().getText();
        SqlBaseParser.StringLitContext commentNode = Optional.ofNullable(ctx.colType().commentSpec()).map(txt -> txt.stringLit()).orElse(null);
        String comment = commentNode != null ? ModelHelper.cleanQuote(commentNode.getText()) : null;

        AlterColumnAction action = new AlterColumnAction();
        action.setColumName(Optional.of(columnName));
        action.setComment(Optional.ofNullable(comment));
        action.setDataType(Optional.of(dataType));
        if (ctx.colPosition() != null) {
            if (ctx.colPosition().FIRST() != null) {
                action.setPosition(Optional.of("first"));
            } else if (ctx.colPosition().AFTER() != null) {
                action.setPosition(Optional.of("after"));
                action.setAfterCol(Optional.of(ctx.colPosition().afterCol.getText()));
            }
        }

        AlterColumn data = new AlterColumn(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(action));
        return new StatementLineage(StatementType.ALTER_TABLE_CHANGE_COL, Optional.of(data));
    }

    @Override
    public StatementLineage visitRenameTableColumn(SqlBaseParser.RenameTableColumnContext ctx) {
        TableName tableName = parseTableName(ctx.table);

        String oldName = ctx.from.getText();
        String newName = ctx.to.getText();

        AlterColumnAction action = new AlterColumnAction(Optional.of(oldName), Optional.of(newName));
        AlterColumn dcTable = new AlterColumn(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(action));
        dcTable.setToken(Optional.of(new CommonToken(ctx.table.start.getStartIndex(), ctx.table.stop.getStopIndex())));
        return new StatementLineage(StatementType.ALTER_TABLE_RENAME_COL, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitAlterTableAlterColumn(SqlBaseParser.AlterTableAlterColumnContext ctx) {
        TableName tableName = parseTableName(ctx.table);

        AlterColumnAction action = parseAlterColumnAction(ctx.alterColumnAction());
        action.setColumName(Optional.of(ctx.column.getText()));
        AlterColumn dcTable = new AlterColumn(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(action));
        dcTable.setToken(Optional.of(new CommonToken(ctx.table.start.getStartIndex(), ctx.table.stop.getStopIndex())));
        return new StatementLineage(StatementType.ALTER_TABLE_CHANGE_COL, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitDropTableColumns(SqlBaseParser.DropTableColumnsContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        AlterColumn dcTable = new AlterColumn(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        dcTable.setToken(Optional.of(new CommonToken(ctx.multipartIdentifier().start.getStartIndex(), ctx.multipartIdentifier().stop.getStopIndex())));
        return new StatementLineage(StatementType.ALTER_TABLE_DROP_COL, Optional.of(dcTable));
    }

    @Override
    public StatementLineage visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        TableSource tableSource = new TableSource(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        CommonToken token = new CommonToken(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        tableSource.getTokens().add(token);
        return new StatementLineage(StatementType.ALTER_TABLE_SET_LOCATION, Optional.of(tableSource));
    }

    @Override
    public StatementLineage visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());
        RefreshData data = new RefreshData(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());

        return new StatementLineage(StatementType.REFRESH_TABLE, Optional.of(data));
    }

    @Override
    public StatementLineage visitDescribeRelation(SqlBaseParser.DescribeRelationContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.DESC_TABLE, Optional.of(data));
    }

    @Override
    public StatementLineage visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        TableName tableName = parseTableName(ctx.table);

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.SHOW_COLUMNS, Optional.of(data));
    }

    @Override
    public StatementLineage visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.SHOW_CREATE_TABLE, Optional.of(data));
    }

    @Override
    public StatementLineage visitShowTableExtended(SqlBaseParser.ShowTableExtendedContext ctx) {
        return new StatementLineage(StatementType.SHOW_TABLE_EXTENDED, Optional.empty());
    }

    @Override
    public StatementLineage visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        TableName tableName = parseTableName(ctx.table);

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.SHOW_TABLE_PROPERTIES, Optional.of(data));
    }

    @Override
    public StatementLineage visitAnalyzeTables(SqlBaseParser.AnalyzeTablesContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.ANALYZE_TABLE, Optional.of(data));
    }

    // ---------- partition ------------------
    @Override
    public StatementLineage visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        List<String> partitions = ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.PartitionSpecLocationContext)
                .map(partition -> {
                    StringBuilder sb = new StringBuilder();
                    int len = partition.getChildCount() - 2;
                    for (int index = 2; index < len; index++) {
                        sb.append(partition.getChild(index).getText());
                    }

                    return sb.toString();
                }).collect(Collectors.toList());

        Boolean ifNotExists = ctx.NOT() != null;
        AddTablePartition data = new AddTablePartition(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), ifNotExists, partitions);
        return new StatementLineage(StatementType.ALTER_TABLE_ADD_PARTS, Optional.of(data));
    }

    @Override
    public StatementLineage visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        List<String> partitions = ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.PartitionSpecContext)
                .map(partition -> {
                    StringBuilder sb = new StringBuilder();
                    int len = partition.getChildCount() - 2;
                    for (int index = 2; index < len; index++) {
                        sb.append(partition.getChild(index).getText());
                    }
                    return sb.toString();
                }).collect(Collectors.toList());

        Boolean ifExists = ctx.EXISTS() != null;
        DropTablePartition data = new DropTablePartition(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), ifExists, partitions);
        return new StatementLineage(StatementType.ALTER_TABLE_DROP_PARTS, Optional.of(data));
    }

    @Override
    public StatementLineage visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.ALTER_TABLE_RENAME_PART, Optional.of(data));
    }

    @Override
    public StatementLineage visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Table data = new Table(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        return new StatementLineage(StatementType.SHOW_PARTITIONS, Optional.of(data));
    }

    // ----------- view ------------------------
    public StatementLineage visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        List<String> commentList = ctx.commentSpec().stream()
                .map(SqlBaseParser.CommentSpecContext::stringLit)
                .map(RuleContext::getText)
                .map(ModelHelper::cleanQuote)
                .collect(Collectors.toList());
        String comment = commentList.size() > 0 ? commentList.get(0) : null;

        TableName tableName = parseTableName(ctx.multipartIdentifier());
        Boolean ifNotExists = ctx.NOT() != null;

        AtomicReference<String> querySql = new AtomicReference<>("");
        ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.QueryContext)
                .map(it -> {
                    SqlBaseParser.QueryContext query = (SqlBaseParser.QueryContext) it;
                    querySql.set(StringUtils.substring(command.get(), query.start.getStartIndex()));
                    return null;
                });

        currentOptType = StatementType.CREATE_VIEW;
        this.visitQuery(ctx.query());

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(querySql.get()), Optional.of(comment), ifNotExists, false);
        view.setFunctionNames(this.tableData.getFunctionNames());
        return new StatementLineage(StatementType.CREATE_VIEW, Optional.of(view));
    }

    @Override
    public StatementLineage visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        AtomicReference<String> querySql = new AtomicReference<>("");
        ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.QueryContext)
                .map(it -> {
                    SqlBaseParser.QueryContext query = (SqlBaseParser.QueryContext) it;
                    querySql.set(StringUtils.substring(command.get(), query.start.getStartIndex()));
                    return null;
                });

        View view = new View(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
        view.setQuerySql(Optional.of(querySql.get()));
        return new StatementLineage(StatementType.ALTER_VIEW_QUERY, Optional.of(view));
    }

    // ------------ function --------------------
    @Override
    public StatementLineage visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        String name = ctx.multipartIdentifier().parts.get(0).getText();
        String classNmae = ctx.className.getText();

        Boolean temporary = false;
        String file = null;
        if (ctx.TEMPORARY() != null) {
            temporary = true;
        } else {
            file = ctx.resource(0).stringLit().getText();
        }

        Function data = new Function(name, temporary, Optional.of(classNmae), Optional.ofNullable(file));
        return new StatementLineage(StatementType.CREATE_FUNCTION, Optional.of(data));
    }

    @Override
    public StatementLineage visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        String name = ctx.multipartIdentifier().parts.get(0).getText();
        Function data = new Function(name);
        return new StatementLineage(StatementType.DROP_FUNCTION, Optional.of(data));
    }

    @Override
    public StatementLineage visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        String name = ctx.describeFuncName().getText();
        Function data = new Function(name);
        return new StatementLineage(StatementType.DESC_FUNCTION, Optional.of(data));
    }

    @Override
    public StatementLineage visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        return new StatementLineage(StatementType.SHOW_FUNCTIONS);
    }

    // ------------ cache -----------------------
    @Override
    public StatementLineage visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        return new StatementLineage(StatementType.CACHE);
    }

    @Override
    public StatementLineage visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        return new StatementLineage(StatementType.UNCACHE);
    }

    @Override
    public StatementLineage visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        return new StatementLineage(StatementType.CLEAR_CACHE);
    }

    // ------------- other ---------------------
    @Override
    public StatementLineage visitExplain(SqlBaseParser.ExplainContext ctx) {
        return new StatementLineage(StatementType.EXPLAIN);
    }

    @Override
    public StatementLineage visitUse(SqlBaseParser.UseContext ctx) {
        DatabaseName databaseName = parseDatabase(ctx.multipartIdentifier());
        Database data = new Database(databaseName.getCatalogName(), databaseName.getDatabaseName());
        return new StatementLineage(StatementType.USE, Optional.of(data));
    }

    @Override
    public StatementLineage visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        return new StatementLineage(StatementType.SET);
    }

    // ------------- insert & query ---------------
    @Override
    public StatementLineage visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        if(ctx.query().ctes() != null) {
            this.isCTE = true;

            SqlBaseParser.QueryTermContext queryTermContext = ctx.query().queryTerm();
            if (StringUtils.startsWithIgnoreCase(queryTermContext.getText(), "select")) {
                this.currentOptType = StatementType.SELECT;
                super.visitStatementDefault(ctx);
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
            super.visitStatementDefault(ctx);

            this.tableData.setLimit(limit);
            return new StatementLineage(StatementType.SELECT, Optional.of(this.tableData));
        }
        return null;
    }

    @Override
    public StatementLineage visitDmlStatement(SqlBaseParser.DmlStatementContext ctx) {
        if(ctx.ctes() != null) {
            this.isCTE = true;

            SqlBaseParser.SingleInsertQueryContext childNode = (SqlBaseParser.SingleInsertQueryContext) ctx.getChild(1);
            if (childNode instanceof SqlBaseParser.SingleInsertQueryContext) {
                this.insertSql = true;
                super.visitDmlStatement(ctx);

                ParseTree tableContext = childNode.getChild(0);
                SqlBaseParser.MultipartIdentifierContext multipartIdentifier = tableContext instanceof SqlBaseParser.InsertIntoTableContext
                        ? ((SqlBaseParser.InsertIntoTableContext) tableContext).multipartIdentifier() : ((SqlBaseParser.InsertOverwriteTableContext)tableContext).multipartIdentifier();

                TableName tableName = parseTableName(multipartIdentifier);
                TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
                this.tableData.getOutpuTables().add(table);
                this.tableData.setPartitions(Optional.of(this.partitions));

                if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).getText())) {
                    this.insertMode = InsertMode.INTO;
                }
                this.tableData.setInsertMode(Optional.of(this.insertMode));

                for(String name : this.tableData.getCteTempTables()) {
                    for (TableName index : this.tableData.getInputTables()) {
                        if (index.getDatabaseName().get().isEmpty() && name.equals(index.getTableName())) {
                            this.tableData.getInputTables().remove(index);
                            break;
                        }
                    }
                }

                for (TableName index : this.tableData.getInputTables()) {
                    if (tableName.getDatabaseName().equals(index.getDatabaseName()) && tableName.getTableName().equals(index.getTableName())) {
                        this.tableData.getInputTables().remove(index);
                        break;
                    }
                }

                if (this.currentOptType == StatementType.INSERT_SELECT) {
                    return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(tableData), Optional.of(querySql), Optional.empty());
                }
            }
            return null;
        }

        if(ctx.dmlStatementNoWith() instanceof SqlBaseParser.SingleInsertQueryContext) {
            this.insertSql = true;
            ParseTree tableContext = ctx.dmlStatementNoWith().getChild(0);
            ParseTree queryContext = ctx.dmlStatementNoWith().getChild(1);
            super.visitDmlStatement(ctx);

            SqlBaseParser.MultipartIdentifierContext multipartIdentifier = null;
            if(tableContext instanceof SqlBaseParser.InsertIntoTableContext) {
                multipartIdentifier = ((SqlBaseParser.InsertIntoTableContext)tableContext).multipartIdentifier();
                // 插入字段???
            } else if (tableContext instanceof SqlBaseParser.InsertOverwriteTableContext) {
                multipartIdentifier = ((SqlBaseParser.InsertOverwriteTableContext)tableContext).multipartIdentifier();
            } else {
                throw SparkSQLTableLineageAstBuilder.parseError("不支持SQL", ctx);
            }

            TableName tableName = this.parseTableName(multipartIdentifier);
            TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());

            this.tableData.getOutpuTables().add(table);
            this.tableData.setPartitions(Optional.of(partitions));

            if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).getText())) {
                this.insertMode = InsertMode.INTO;
            }
            this.tableData.setInsertMode(Optional.of(insertMode));

            if (this.currentOptType == StatementType.INSERT_VALUES) {
                if (this.values.size() != 0) {
                    return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(values));
                } else {
                    return new StatementLineage(StatementType.INSERT_VALUES, Optional.of(tableData), Optional.empty(), Optional.of(singleValues));
                }
            } else {
                return new StatementLineage(StatementType.INSERT_SELECT, Optional.of(tableData), Optional.of(querySql), Optional.empty());
            }
        } else if(ctx.dmlStatementNoWith() instanceof SqlBaseParser.MultiInsertQueryContext) {
            this.currentOptType = StatementType.MULTI_INSERT;
            super.visitDmlStatement(ctx);

            ParseTree fromContext = ctx.dmlStatementNoWith().getChild(0);
            if(fromContext instanceof SqlBaseParser.FromClauseContext) {
                List<SqlBaseParser.RelationContext> relationContexts = ((SqlBaseParser.FromClauseContext)fromContext).relation();
                for(SqlBaseParser.RelationContext relationContext : relationContexts) {
                    SqlBaseParser.RelationPrimaryContext relationPrimaryContext = relationContext.relationPrimary();
                    ParseTree item = relationPrimaryContext.getChild(0);
                    if(item instanceof SqlBaseParser.MultipartIdentifierContext) {
                        SqlBaseParser.MultipartIdentifierContext multipartIdentifier = (SqlBaseParser.MultipartIdentifierContext) item;
                        TableName tableName = this.parseTableName(multipartIdentifier);
                        this.tableData.getInputTables().add(tableName);
                    }
                }
            }

            return new StatementLineage(StatementType.MULTI_INSERT, Optional.of(tableData));
        } else if (ctx.dmlStatementNoWith() instanceof SqlBaseParser.UpdateTableContext ||
                ctx.dmlStatementNoWith() instanceof SqlBaseParser.DeleteFromTableContext ||
                ctx.dmlStatementNoWith() instanceof SqlBaseParser.MergeIntoTableContext) {

            return super.visitDmlStatement(ctx);
        } else {
            return null;
        }
    }

    //--------- update/delete sql-------------------------------------------------

    @Override
    public StatementLineage visitDeleteFromTable(SqlBaseParser.DeleteFromTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());
        String where = ctx.whereClause() != null ? StringUtils.substring(command.get(), ctx.whereClause().start.getStopIndex() + 1) : null;

        DeleteTable update = new DeleteTable(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.of(StringUtils.trim(where)));
        return new StatementLineage(StatementType.DELETE, Optional.of(update));
    }

    @Override
    public StatementLineage visitUpdateTable(SqlBaseParser.UpdateTableContext ctx) {
        TableName tableName = parseTableName(ctx.multipartIdentifier());

        Map<String, String> upset = new HashMap();
        ctx.setClause().assignmentList().assignment().stream()
            .filter(it -> it instanceof SqlBaseParser.AssignmentContext)
            .map(it -> {
                SqlBaseParser.AssignmentContext assign = (SqlBaseParser.AssignmentContext) it;
                Map<String, String> mp = new HashMap();
                upset.put(assign.key.getText(), assign.value.getText());
                return null;
            });
        String where = ctx.whereClause() != null ? StringUtils.substring(command.get(), ctx.whereClause().start.getStopIndex() + 1) : null;

        UpdateTable update = new UpdateTable(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName(), Optional.ofNullable(upset),
                Optional.ofNullable(StringUtils.trim(where)));
        return new StatementLineage(StatementType.UPDATE, Optional.of(update));
    }

    @Override
    public StatementLineage visitMergeIntoTable(SqlBaseParser.MergeIntoTableContext ctx) {
        this.currentOptType = StatementType.MERGE_INTO_TABLE;

        TableName tableName = parseTableName(ctx.target);
        Optional<String> catalogName = tableName.getCatalogName();
        Optional<String> targetDatabase = tableName.getDatabaseName();
        String targetTableName = tableName.getTableName();
        TableSource targetTable = new TableSource(catalogName, targetDatabase, targetTableName);
        CommonToken token = new CommonToken(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        targetTable.getTokens().add(token);

        MergeIntoTable deltaMerge = new MergeIntoTable(targetTable);

        if (ctx.source != null) {
            TableName sourceTableName = parseTableName(ctx.source);
            TableName table = new TableName(sourceTableName.getCatalogName(), sourceTableName.getDatabaseName(), sourceTableName.getTableName());
            deltaMerge.getSourceTables().add(table);
        } else if (ctx.sourceQuery != null && ctx.sourceQuery instanceof SqlBaseParser.QueryContext) {
            SqlBaseParser.QueryContext query = (SqlBaseParser.QueryContext) ctx.sourceQuery;
            super.visitQuery(query);

            deltaMerge.getSourceTables().addAll(this.tableData.getInputTables());
        }
        return new StatementLineage(StatementType.MERGE_INTO_TABLE, Optional.of(deltaMerge));
    }

    // ------------- private method ---------------
    @Override
    public StatementLineage visitFunctionName(SqlBaseParser.FunctionNameContext ctx) {
        if (StatementType.SELECT == this.currentOptType ||
                StatementType.CREATE_VIEW == this.currentOptType ||
                StatementType.INSERT_SELECT == this.currentOptType ||
                StatementType.CREATE_TABLE_AS_SELECT == this.currentOptType ||
                StatementType.REPLACE_TABLE_AS_SELECT == this.currentOptType ||
                StatementType.MULTI_INSERT == this.currentOptType ||
                StatementType.MERGE_INTO_TABLE == this.currentOptType ||
                StatementType.EXPORT_TABLE == this.currentOptType ||
                StatementType.DATATUNNEL == this.currentOptType) {

            this.tableData.getFunctionNames().add(StringUtils.lowerCase(ctx.qualifiedName().getText()));
        }
        return super.visitFunctionName(ctx);
    }

    @Override
    public StatementLineage visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        if (this.querySql == null) {
            this.querySql = StringUtils.substring(this.command.get(), ctx.start.getStartIndex());
        }
        return super.visitQueryTermDefault(ctx);
    }

    @Override
    public StatementLineage visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        if (this.isCTE) {
            this.tableData.getCteTempTables().add(ctx.getChild(0).getText());
        }
        return super.visitNamedQuery(ctx);
    }

    @Override
    public StatementLineage visitMultipartIdentifier(SqlBaseParser.MultipartIdentifierContext ctx) {
        TableName tableNameObj = parseTableName(ctx);
        Optional<String> databaseName = tableNameObj.getDatabaseName();
        String tableName = tableNameObj.getTableName();
        Optional<String> metaAction = tableNameObj.getMetaType();
        if (this.currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                this.currentOptType == StatementType.REPLACE_TABLE_AS_SELECT ||
                this.currentOptType == StatementType.SELECT ||
                this.currentOptType == StatementType.INSERT_SELECT ||
                this.currentOptType == StatementType.MERGE_INTO_TABLE ||
                this.currentOptType == StatementType.EXPORT_TABLE ||
                this.currentOptType == StatementType.DATATUNNEL) {

            TableName table = new TableName(databaseName, tableName, metaAction);

            int index = this.tableData.getInputTables().indexOf(table);
            if (index == -1) {
                this.tableData.getInputTables().add(table);
            }
        } else if (this.currentOptType == StatementType.MULTI_INSERT) {
            if ("from".equals(this.multiInsertToken)) {
                TableName table = new TableName(databaseName, tableName, metaAction);
                this.tableData.getInputTables().add(table);
            }
        }
        return null;
    }

    @Override
    public StatementLineage visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        this.currentOptType = StatementType.INSERT_VALUES;
        return super.visitInlineTableDefault1(ctx);
    }

    @Override
    public StatementLineage visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        List<String> row = ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.NamedExpressionContext)
                .map(it -> {
                    String text = it.getText();
                    text = ModelHelper.cleanQuote(text);
                    return text;
                }).collect(Collectors.toList());
        this.values.add(row);
        return super.visitRowConstructor(ctx);
    }

    @Override
    public StatementLineage visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        if (ctx.getChildCount() == 1) {
            partitions.put(ctx.getChild(0).getText(), "__dynamic__");
        } else {
            String value = ctx.getChild(2).getText();
            value = ModelHelper.cleanQuote(value);
            partitions.put(ctx.getChild(0).getText(), value);
        }
        return super.visitPartitionVal(ctx);
    }

    @Override
    public StatementLineage visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        ctx.children.stream()
                .filter(it -> it instanceof SqlBaseParser.ExpressionContext)
                .map(it -> {
                    String text = it.getText();
                    text = StringUtils.substringBetween(text, "(", ")").trim();
                    text = ModelHelper.cleanQuote(text);
                    List<String> list = new ArrayList();
                    list.add(text);
                    this.singleValues.add(list);
                    return null;
                });

        return super.visitInlineTable(ctx);
    }

    @Override
    public StatementLineage visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        if (this.insertSql) {
            this.currentOptType = StatementType.INSERT_SELECT;
        }
        return super.visitQueryPrimaryDefault(ctx);
    }

    @Override
    public StatementLineage visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        this.multiInsertToken = Optional.of("from");
        return super.visitFromClause(ctx);
    }

    @Override
    public StatementLineage visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        this.multiInsertToken = Optional.of("insert");
        Optional.ofNullable(ctx.insertInto())
                .map(obj -> {
                    if (obj instanceof SqlBaseParser.InsertOverwriteTableContext) {
                        SqlBaseParser.MultipartIdentifierContext multipartIdentifier = ((SqlBaseParser.InsertOverwriteTableContext)obj).multipartIdentifier();
                        TableName tableName = parseTableName(multipartIdentifier);

                        TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
                        this.tableData.getOutpuTables().add(table);
                    } else if (obj instanceof SqlBaseParser.InsertIntoTableContext) {
                        SqlBaseParser.MultipartIdentifierContext multipartIdentifier = ((SqlBaseParser.InsertIntoTableContext)obj).multipartIdentifier();
                        TableName tableName = parseTableName(multipartIdentifier);

                        TableName table = new TableName(tableName.getCatalogName(), tableName.getDatabaseName(), tableName.getTableName());
                        this.tableData.getOutpuTables().add(table);
                    }
                    return null;
                });

        return super.visitMultiInsertQueryBody(ctx);
    }

    @Override
    public StatementLineage visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        this.limit = Optional.ofNullable(ctx.limit).map(text -> Integer.parseInt(text.getText()));
        return super.visitQueryOrganization(ctx);
    }

    @Override
    public StatementLineage visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        String valueType = ctx.identifier().getText().toUpperCase();
        if (!("DATE".equals(valueType) || "TIME".equals(valueType)
                || "TIMESTAMP".equals(valueType) || "INTERVAL".equals(valueType)
                || "X".equals(valueType))) {
            throw SparkSQLTableLineageAstBuilder.parseError("Literals of type " + valueType + " are currently not supported.", ctx);
        }

        return super.visitTypeConstructor(ctx);
    }

    /**
     * 表列支持数据类型
     */
    private Boolean checkColumnDataType(String dataType) {
        if (StringUtils.startsWithIgnoreCase(dataType, "decimal")) {
            return true;
        }

        Boolean ret = false;
        switch (dataType.toLowerCase()) {
            case "string":
            case "int":
            case "bigint":
            case "double":
            case "date":
            case "timestamp":
            case "boolean":
                ret = true;
                break;
            default:
                throw new IllegalStateException("不支持数据类型：" + dataType);
        }

        return ret;
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
