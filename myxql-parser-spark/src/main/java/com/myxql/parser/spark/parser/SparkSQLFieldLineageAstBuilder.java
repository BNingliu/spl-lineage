package com.myxql.parser.spark.parser;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.plan.*;
import com.myxql.parser.spark.antlr4.SqlBaseParser;
import com.myxql.parser.spark.antlr4.SqlBaseParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

public class SparkSQLFieldLineageAstBuilder extends SqlBaseParserBaseVisitor<Statement> {
//    private Logger logger = LoggerFactory.getLogger(SparkSQLFieldLineageAstBuilder.class);

    private String command = "";
    private StatementType statementType;

    public void setCommand(String command) {
        this.command = Objects.requireNonNull(command, "command is null");
    }

    protected <T> T typedVisit (ParseTree ctx) {
        return (T) ctx.accept(this);
    }

    @Override
    public StatementLineage visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        // SingleInsertQuery or MultiInsertQuery
        InsertInto plan = (InsertInto) visit(ctx.statement());
//        logger.info("visitSingleStatement, plan=" + JSONObject.toJSONString(plan));
        PlanParser planParser = new PlanParser();
        TableData tableData = planParser.parseTableData(plan);
        StatementLineage statementLineage = new StatementLineage(this.statementType, Optional.ofNullable(tableData), this.command);
        return statementLineage;
    }

    // ------------- dml statement(insert/delete/update)---------------
    @Override
    public LogicalPlan visitDmlStatement(SqlBaseParser.DmlStatementContext ctx) {
        LogicalPlan dmlStmt = this.typedVisit(ctx.dmlStatementNoWith());
        // CTEs
        return Optional.ofNullable(ctx.ctes())
                .map(ctesContext -> withCTE(ctesContext, dmlStmt))
                .orElse(dmlStmt);
    }

    /**
     * Create a logical plan for a regular (single-insert) query.
     */
    @Override
    public LogicalPlan visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        System.out.println();
        LogicalPlan query = visitQuery(ctx.query());
        LogicalPlan logicalPlan = withInsertInto(ctx.insertInto(), query);
        if(logicalPlan instanceof InsertIntoTable) {
            InsertInto insertInto = new InsertInto(getLocation(ctx), InsertInto.TARGET_TYPE_TABLE);
            insertInto.addInsertInto(logicalPlan);
            return insertInto;
        } else if(logicalPlan instanceof InsertIntoDir) {
            InsertInto insertInto = new InsertInto(getLocation(ctx), InsertInto.TARGET_TYPE_DIR);
            insertInto.addInsertInto(logicalPlan);
            return insertInto;
        } else {
//            logger.info("unknow single insert query statement");
            return null;
        }
    }

    /**
     * Add an INSERT INTO TABLE operation to the logical plan.
     */
    @Override
    public InsertTableParams visitInsertIntoTable(SqlBaseParser.InsertIntoTableContext ctx) {
        TableName tableName = this.parseTableName(ctx.multipartIdentifier());
        List<String> cols = Optional.ofNullable(ctx.identifierList())
                .map(this::parseIdendifierList)//this.parseIdendifierList(ctx.identifierList());
                .orElse(new ArrayList<>());
        Map<String, Optional<String>> partitionKeys = Optional.ofNullable(ctx.partitionSpec())
                .map(this::parsePartitionSpec)
                .orElse(new HashMap<>());

        if (ctx.EXISTS() != null) {
            throw SparkSQLFieldLineageAstBuilder.parseError("operationNotAllowed, "+ "INSERT INTO ... IF NOT EXISTS" + ctx, ctx);
        }

        this.statementType = StatementType.INSERT_SELECT;

        InsertTableParams insertTableParams = new InsertTableParams(tableName, cols, partitionKeys, false);
        return insertTableParams;
    }

    /**
     * Add an INSERT OVERWRITE TABLE operation to the logical plan.
     */
    @Override
    public InsertTableParams visitInsertOverwriteTable(SqlBaseParser.InsertOverwriteTableContext ctx) {
        assert(ctx.OVERWRITE() != null);
        TableName tableName = this.parseTableName(ctx.multipartIdentifier());
        List<String> cols = Optional.ofNullable(ctx.identifierList())
                .map(this::parseIdendifierList)
                .orElse(new ArrayList<>());
        Map<String, Optional<String>> partitionKeys = Optional.ofNullable(ctx.partitionSpec())
                .map(this::parsePartitionSpec)
                .orElse(new HashMap<>());

        Map<String, Optional<String>> dynamicPartitionKeys = partitionKeys.entrySet().stream()
                .filter(kv -> kv.getValue().get().isEmpty())
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        if (ctx.EXISTS() != null && !dynamicPartitionKeys.isEmpty()) {
            throw SparkSQLFieldLineageAstBuilder.parseError("operationNotAllowed(IF NOT EXISTS with dynamic partitions: " +
                    Joiner.on(", ").join(dynamicPartitionKeys.keySet()) + ctx, ctx);
        }

        this.statementType = StatementType.INSERT_SELECT;

        return new InsertTableParams(tableName, cols, partitionKeys, ctx.EXISTS() != null);
    }

    /**
     * Create a top-level plan with Common Table Expressions.
     */
    @Override
    public LogicalPlan visitQuery(SqlBaseParser.QueryContext ctx) {
        // 当前查询id
        // ctes? queryTerm queryOrganization
        // queryTerm
        LogicalPlan query = this.typedVisit(ctx.queryTerm());

        Optional.ofNullable(ctx.queryOrganization())
                .map(queryOrganizationContext -> withQueryResultClauses(queryOrganizationContext, query))
                .orElse(query);

        // CTEs
        return Optional.ofNullable(ctx.ctes())
                .map(ctesContext -> withCTE(ctesContext, query))
                .orElse(query);
    }

    @Override
    public QueryData visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        QueryData union = new QueryData(getLocation(ctx));
        union.setIsUnion(true);
        // queryTerm
        LogicalPlan left = this.typedVisit(ctx.left);
        LogicalPlan right = this.typedVisit(ctx.right);
        union.addChild(left);
        union.addChild(right);
        return union;
    }

    @Override
    public LogicalPlan visitTransformQuerySpecification(SqlBaseParser.TransformQuerySpecificationContext ctx) {
        QueryData from = Optional.ofNullable(ctx.fromClause())
                .map(this::visitFromClause)
                .orElse(null);

        return withTransformQuerySpecification(
                ctx,
                ctx.transformClause(),
                ctx.lateralView(),
                ctx.whereClause(),
                ctx.aggregationClause(),
                ctx.havingClause(),
                ctx.windowClause(),
                from
        );
    }

    @Override
    public LogicalPlan visitRegularQuerySpecification(SqlBaseParser.RegularQuerySpecificationContext ctx) {
        QueryData from = Optional.ofNullable(ctx.fromClause())
                .map(this::visitFromClause)
                .orElse(null);

        return withSelectQuerySpecification(
                getLocation(ctx),
                ctx,
                ctx.selectClause(),
                ctx.lateralView(),
                ctx.whereClause(),
                ctx.aggregationClause(),
                ctx.havingClause(),
                ctx.windowClause(),
                from
        );
    }

    private List<SelectItem> parseNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        List<SelectItem> selectItems = visit(ctx.namedExpression(), SelectItem.class);
        return selectItems;
    }

    /**
     * 别名表达式
     */
    @Override
    public SelectItem visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        this.visitExpression(ctx.expression());
        SelectItem selectItem = new SelectItem();
        selectItem.setFieldNames(new HashSet<>());
        String alias = Optional.ofNullable(ctx.name)
                .map(RuleContext::getText)
                .orElse(null);
        selectItem.setAlias(alias);
        // process
        Optional.ofNullable(ctx)
                .map(SqlBaseParser.NamedExpressionContext::expression)
                .map(this::subSourceSql)
                .ifPresent(selectItem::setProcess);
        // 如果没有别名，取表达式
        if(alias == null) {
            selectItem.setAlias(selectItem.getProcess());
        }
        Pair<String, String> pair = SelectItem.parseAlias(selectItem.getAlias());
        if(pair.getRight() != null) {
            selectItem.setAlias(pair.getRight());
            selectItem.setTableName(pair.getLeft());
        }

        // sourceFields
        Optional.ofNullable(ctx)
                .map(SqlBaseParser.NamedExpressionContext::expression)
                .map(SqlBaseParser.ExpressionContext::booleanExpression)
                .ifPresent(booleanExpressionContext -> {
                    if (booleanExpressionContext instanceof SqlBaseParser.PredicatedContext) {
                        SqlBaseParser.PredicatedContext predicatedContext = (SqlBaseParser.PredicatedContext) booleanExpressionContext;
                        this.parseValueExpression(selectItem, predicatedContext.valueExpression());
                    }
                });

        return selectItem;
    }

    private void parseValueExpression(SelectItem selectItem, SqlBaseParser.ValueExpressionContext ctx) {
        if (ctx instanceof SqlBaseParser.ValueExpressionDefaultContext) {
            SqlBaseParser.ValueExpressionDefaultContext valueExpressionDefaultContext = (SqlBaseParser.ValueExpressionDefaultContext) ctx;
            if (valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.DereferenceContext) {
                SqlBaseParser.DereferenceContext dereferenceContext = (SqlBaseParser.DereferenceContext) valueExpressionDefaultContext.primaryExpression();
                String strExpr = dereferenceContext.getText();
                if (!StringUtils.isNumeric(strExpr)) {
                    String strName = ModelHelper.dealNameMark(strExpr);
                    Pair<String, String> pair = SelectItem.parseAlias(strName);
                    if(pair.getRight() != null) {
                        selectItem.getFieldNames().add(pair.getRight());
                    } else {
                        selectItem.getFieldNames().add(pair.getLeft());
                    }
                }
            } else if (valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.ColumnReferenceContext) {
                SqlBaseParser.ColumnReferenceContext columnReferenceContext = (SqlBaseParser.ColumnReferenceContext) valueExpressionDefaultContext.primaryExpression();
                String strExpr = columnReferenceContext.getText();
                if (!StringUtils.isNumeric(strExpr)) {
                    String strName = ModelHelper.dealNameMark(strExpr);
                    Pair<String, String> pair = SelectItem.parseAlias(strName);
                    if (pair.getRight() != null) {
                        selectItem.getFieldNames().add(pair.getRight());
                    } else {
                        selectItem.getFieldNames().add(pair.getLeft());
                    }
                }
            } else if(valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.StarContext) {
                SqlBaseParser.StarContext starContext = (SqlBaseParser.StarContext) valueExpressionDefaultContext.primaryExpression();
                List<String> idents = new ArrayList<>();
                if(starContext.DOT() != null) {
                    idents.addAll(this.parseQualifiedName(starContext.qualifiedName()));
                } else {
                    idents.add(starContext.ASTERISK().getText());
                }

                if(idents.size() > 1) {
                    selectItem.setTableName(idents.get(0));
                    selectItem.setAlias(idents.get(1)); // *

                    Set<String> fieldNames = new HashSet<>();
                    fieldNames.add(idents.get(1));
                    selectItem.setFieldNames(fieldNames);
                } else {
                    selectItem.setAlias(idents.get(0));

                    Set<String> fieldNames = new HashSet<>();
                    fieldNames.add(idents.get(0));
                    selectItem.setFieldNames(fieldNames);
                }
            }
            else if(valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.ConstantDefaultContext) {
                SqlBaseParser.ConstantDefaultContext constantDefaultContext = (SqlBaseParser.ConstantDefaultContext) valueExpressionDefaultContext.primaryExpression();
                selectItem.setFieldType(SelectItem.FIELD_TYPE_CONST);
                String fieldName = constantDefaultContext.getText();
                selectItem.setAlias(fieldName);
                Set<String> fieldNames = new HashSet<>();
                fieldNames.add(fieldName);
                selectItem.setFieldNames(fieldNames);
            } else if(valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.CollectSetContext) {
                SqlBaseParser.CollectSetContext collectSetContext = (SqlBaseParser.CollectSetContext) valueExpressionDefaultContext.primaryExpression();
                String fieldName = collectSetContext.expression().getText();
                selectItem.setAlias(fieldName);
                Set<String> fieldNames = new HashSet<>();
                fieldNames.add(fieldName);
                selectItem.setFieldNames(fieldNames);
            } else {
//                logger.info("other expression 1, ctx="+ctx.getText());
                System.exit(-1);
            }
        } else if (ctx instanceof SqlBaseParser.ArithmeticUnaryContext) {
//            logger.info("unsupport ArithmeticUnary expression");
            System.exit(-1);
        } else if (ctx instanceof SqlBaseParser.ArithmeticBinaryContext) {
            SqlBaseParser.ArithmeticBinaryContext arithmeticBinaryContext = (SqlBaseParser.ArithmeticBinaryContext) ctx;
            for(SqlBaseParser.ValueExpressionContext valueExpressionContext : arithmeticBinaryContext.valueExpression()) {
                parseValueExpression(selectItem, valueExpressionContext);
            }
        } else if (ctx instanceof SqlBaseParser.ComparisonContext) {
//            logger.info("unsupport Comparison expression");
            System.exit(-1);
        } else {
//            logger.info("unsupport valueexpression");
            System.exit(-1);
        }
    }

    private List<String> parseQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        List<String> names = ctx.identifier().stream()
                .map(identifierContext -> identifierContext.getText())
                .collect(Collectors.toList());

        return names;
    }

    /**
     * 带别名的表名，如：from clauses
     */
    @Override
    public TableAlias visitTableName(SqlBaseParser.TableNameContext ctx) {
        TableName tableName = this.parseTableName(ctx.multipartIdentifier());
        Optional<String> alias = Optional.ofNullable(ctx.tableAlias())
                .map(RuleContext::getText);

        TableAlias tableAlias = new TableAlias(tableName, alias);
        return tableAlias;
    }

    /**
     * fromClause, 支持多个关系
     */
    @Override
    public QueryData visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        QueryData from = new QueryData(getLocation(ctx));

        for(SqlBaseParser.RelationContext relationContext : ctx.relation()) {
            SqlBaseParser.RelationPrimaryContext relationPrimaryContext = relationContext.relationPrimary();
            from = this.parseRelationPrimary(relationPrimaryContext, from);

            for(SqlBaseParser.RelationExtensionContext relationExtensionContext : relationContext.relationExtension()) {
                SqlBaseParser.RelationPrimaryContext rpctx = Optional.ofNullable(relationExtensionContext.joinRelation())
                        .map(SqlBaseParser.JoinRelationContext::relationPrimary)
                        .orElse(null);
                if(rpctx != null) {
                    from = this.parseRelationPrimary(rpctx, from);
                }
            }
        }

        return from;
    }

    private QueryData parseRelationPrimary(SqlBaseParser.RelationPrimaryContext ctx, QueryData from) {
        Integer thisId = ctx.getStart().getStartIndex();
        if(ctx instanceof SqlBaseParser.TableNameContext) {
            TableAlias tableAlias = this.visitTableName((SqlBaseParser.TableNameContext) ctx);
            FromTable fromTable = new FromTable(tableAlias.getTabledName(), tableAlias.getAlias().get());
            from.addFromTable(fromTable);
        } else if(ctx instanceof SqlBaseParser.AliasedQueryContext){
            SqlBaseParser.AliasedQueryContext aliasedQueryContext = (SqlBaseParser.AliasedQueryContext) ctx;
            // 子查询
            QueryData query = this.typedVisit(aliasedQueryContext.query());
            query.setId(thisId+"");
            String alias = Optional.ofNullable(aliasedQueryContext.tableAlias())
                    .map(RuleContext::getText)
                    .orElse(null);
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
            from.addSubquery(query);
        } else if(ctx instanceof SqlBaseParser.AliasedRelationContext) {
            SqlBaseParser.AliasedRelationContext aliasedRelationContext = (SqlBaseParser.AliasedRelationContext) ctx;
            QueryData relation = this.typedVisit(aliasedRelationContext);
            relation.setId(thisId+"");
            String alias = Optional.ofNullable(aliasedRelationContext.tableAlias())
                    .map(RuleContext::getText)
                    .orElse(null);
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
            from.addSubquery(relation);
        } else {
//            logger.info("unsupport relation primary");
            System.exit(-1);
        }
        return from;
    }

    @Override
    public LogicalPlan visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        return plan(ctx.relationPrimary());
    }

    @Override
    public TableAlias visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        return (TableAlias) visitTableIdentifier(ctx.tableIdentifier());
    }

    /* ********************************************************************************************
     * Plan parsing
     * ******************************************************************************************** */
    protected LogicalPlan plan(ParserRuleContext tree) {
        return this.typedVisit(tree);
    }

    /**
     * Create a logical query plan for a hive-style FROM statement body.
     */
    private LogicalPlan withFromStatementBody(SqlBaseParser.FromStatementBodyContext ctx, QueryData plan) {
        // two cases for transforms and selects
        if (ctx.transformClause() != null) {
            return withTransformQuerySpecification(
                    ctx,
                    ctx.transformClause(),
                    ctx.lateralView(),
                    ctx.whereClause(),
                    ctx.aggregationClause(),
                    ctx.havingClause(),
                    ctx.windowClause(),
                    plan
            );
        } else {
            return withSelectQuerySpecification(
                    getLocation(ctx),
                    ctx,
                    ctx.selectClause(),
                    ctx.lateralView(),
                    ctx.whereClause(),
                    ctx.aggregationClause(),
                    ctx.havingClause(),
                    ctx.windowClause(),
                    plan
            );
        }
    }

    @Override
    public LogicalPlan visitFromStatement(SqlBaseParser.FromStatementContext ctx) {
        QueryData from = visitFromClause(ctx.fromClause());
        List<LogicalPlan> selects = ctx.fromStatementBody().stream().map(body -> {
            LogicalPlan plan = withFromStatementBody(body, from);
            return Optional.ofNullable(body.queryOrganization())
                    .map(queryOrganizationContext -> withQueryResultClauses(queryOrganizationContext, plan))
                    .orElse(null);
        }).collect(toList());

        // If there are multiple SELECT just UNION them together into one query.
        if (selects.size() == 1) {
            return selects.get(0);
        } else {
            for(LogicalPlan plan : selects) {
                from.addChild(plan);
            }
            return from;
        }
    }

    /**
     * Create a logical plan which allows for multiple inserts using one 'from' statement. These
     * queries have the following SQL form:
     * {{{
     *   [WITH cte...]?
     *   FROM src
     *   [INSERT INTO tbl1 SELECT *]+
     * }}}
     * For example:
     * {{{
     *   FROM db.tbl1 A
     *   INSERT INTO dbo.tbl1 SELECT * WHERE A.value = 10 LIMIT 5
     *   INSERT INTO dbo.tbl2 SELECT * WHERE A.value = 12
     * }}}
     * This (Hive) feature cannot be combined with set-operators.
     */
    @Override
    public LogicalPlan visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        // fromClause
        QueryData from = this.visitFromClause(ctx.fromClause());

        // Build the insert clauses.
        InsertInto insertInto = new InsertInto(getLocation(ctx), InsertInto.TARGET_TYPE_TABLE);
        // If there are multiple INSERTS just UNION them together into one query.
        for(SqlBaseParser.MultiInsertQueryBodyContext bodyContext : ctx.multiInsertQueryBody()) {
            LogicalPlan plan = withInsertInto(bodyContext.insertInto(),
                    Optional.ofNullable(withFromStatementBody(bodyContext.fromStatementBody(), from)).
                            map(item -> withQueryResultClauses(bodyContext.fromStatementBody().queryOrganization(), item))
                            .orElse(null));

            InsertIntoTable oldInsertTable = (InsertIntoTable) plan;
            QueryData query = (QueryData)oldInsertTable.getQuery();
            QueryData queryData = new QueryData(getLocation(bodyContext));
            queryData.setSelectItems(query.getSelectItems());
            queryData.setFromTables(query.getFromTables());

            InsertIntoTable newTable = new InsertIntoTable(getLocation(bodyContext), oldInsertTable.getTableName(), oldInsertTable.getUserSpecifiedCols(),
                    oldInsertTable.getPartitionSpec(), queryData,
                    oldInsertTable.getOverwrite(), oldInsertTable.getIfPartitionNotExists());
            insertInto.addInsertInto(newTable);
        }

        this.statementType = StatementType.MULTI_INSERT;
        return insertInto;
    }

    /**
     * 插入输出到表语句参数，如：
     *   (tableColumnList, partitionKeys, ifPartitionNotExists).
     */
    private class InsertTableParams extends Statement {
        private TableName tableName;
        private List<String> cols;
        private Map<String, Optional<String>> partition;
        private Boolean ifPartitionNotExists;
        public InsertTableParams(TableName tableName, List<String> cols,
                                 Map<String, Optional<String>> partition, Boolean ifPartitionNotExists) {
            this.tableName = tableName;
            this.cols = cols;
            this.partition = partition;
            this.ifPartitionNotExists = ifPartitionNotExists;
        }

        public TableName getTableName() {
            return tableName;
        }

        public void setTableName(TableName tableName) {
            this.tableName = tableName;
        }

        public List<String> getCols() {
            return cols;
        }

        public void setCols(List<String> cols) {
            this.cols = cols;
        }

        public Map<String, Optional<String>> getPartition() {
            return partition;
        }

        public void setPartition(Map<String, Optional<String>> partition) {
            this.partition = partition;
        }

        public Boolean getIfPartitionNotExists() {
            return ifPartitionNotExists;
        }

        public void setIfPartitionNotExists(Boolean ifPartitionNotExists) {
            this.ifPartitionNotExists = ifPartitionNotExists;
        }
    }

    /**
     * 插入输出到目录语句参数，如: (isLocal, CatalogStorageFormat, provider).
     *
     */
    private class InsertDirParams extends Statement {
        private Boolean isLocal;
        private String storageFormat;
        private Optional<String> provider;

        public InsertDirParams(Boolean isLocal, String storageFormat, Optional<String> provider) {
            this.isLocal = isLocal;
            this.storageFormat = storageFormat;
            this.provider = provider;
        }
    }

    private Map<String, Optional<String>> parsePartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        Map<String, Optional<String>> parts = ctx.partitionVal().stream().map(pVal -> {
            String name = pVal.identifier().getText();
            String value = Optional.ofNullable(pVal.constant())
                    .map(RuleContext::getText)
                    .orElse(null);
            return Pair.of(name, value);
        }).collect(Collectors.toMap(p -> p.getKey(), p-> Optional.of(p.getValue())));

        return parts;
    }

    /**
     * Write to a directory, returning a [[InsertIntoDir]] logical plan.
     */
    @Override
    public InsertDirParams visitInsertOverwriteDir(SqlBaseParser.InsertOverwriteDirContext ctx) {
        throw SparkSQLFieldLineageAstBuilder.parseError("insertOverwriteDirectoryUnsupportedError " + ctx, ctx);
    }

    /**
     * Write to a directory, returning a [[InsertIntoDir]] logical plan.
     */
    @Override
    public InsertDirParams visitInsertOverwriteHiveDir(SqlBaseParser.InsertOverwriteHiveDirContext ctx) {
        throw SparkSQLFieldLineageAstBuilder.parseError("insertOverwriteDirectoryUnsupportedError " + ctx, ctx);
    }

    /**
     * Add ORDER BY/SORT BY/CLUSTER BY/DISTRIBUTE BY/LIMIT/WINDOWS clauses to the logical plan. These
     * clauses determine the shape (ordering/partitioning/rows) of the query result.
     */
    private LogicalPlan withQueryResultClauses(SqlBaseParser.QueryOrganizationContext ctx, LogicalPlan query) {
        return query;
    }

    private List<String> parseIdendifierList(SqlBaseParser.IdentifierListContext ctx) {
        return this.parseIndetifierSeq(ctx.identifierSeq());
    }

    private List<String> parseIndetifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        return ctx.capturingIdent().stream().map(ident -> ident.getText()).collect(toList());
    }

    private LogicalPlan withCTE(SqlBaseParser.CtesContext ctx, LogicalPlan plan) {
        for(SqlBaseParser.NamedQueryContext nCtx : ctx.namedQuery()) {
            QueryData query = this.typedVisit(nCtx.query());
            String strName = nCtx.name.getText();
            // Check for duplicate names.
            if(plan.containsCte(strName)) {
                throw SparkSQLFieldLineageAstBuilder.parseError("duplicateCteDefinitionNamesError." + strName, ctx);
            }
            plan.addCte(strName, query);
        }
        return plan;
    }


    /**
     * Add an
     * {{{
     *   INSERT OVERWRITE TABLE tableIdentifier [partitionSpec [IF NOT EXISTS]]? [identifierList]
     *   INSERT INTO [TABLE] tableIdentifier [partitionSpec]  [identifierList]
     *   INSERT OVERWRITE [LOCAL] DIRECTORY STRING [rowFormat] [createFileFormat]
     *   INSERT OVERWRITE [LOCAL] DIRECTORY [STRING] tableProvider [OPTIONS tablePropertyList]
     * }}}
     * operation to logical plan
     */
    private LogicalPlan withInsertInto(SqlBaseParser.InsertIntoContext ctx, LogicalPlan query) {
        if(ctx instanceof SqlBaseParser.InsertIntoTableContext) {
            SqlBaseParser.InsertIntoTableContext tableContext = (SqlBaseParser.InsertIntoTableContext) ctx;
            InsertTableParams insertTableParams = visitInsertIntoTable(tableContext);

            return new InsertIntoTable(
                    getLocation(ctx),
                    insertTableParams.tableName,
                    insertTableParams.cols,
                    insertTableParams.partition,
                    query,
                    false,
                    insertTableParams.ifPartitionNotExists);
        } else if(ctx instanceof SqlBaseParser.InsertOverwriteTableContext) {
            SqlBaseParser.InsertOverwriteTableContext tableContext = (SqlBaseParser.InsertOverwriteTableContext) ctx;
            SparkSQLFieldLineageAstBuilder.InsertTableParams insertTableParams = visitInsertOverwriteTable(tableContext);
            return new InsertIntoTable(
                    getLocation(ctx),
                    insertTableParams.tableName,
                    insertTableParams.cols,
                    insertTableParams.partition,
                    query,
                    true,
                    insertTableParams.ifPartitionNotExists);
        } else if(ctx instanceof SqlBaseParser.InsertOverwriteDirContext) {
            SqlBaseParser.InsertOverwriteDirContext dirContext = (SqlBaseParser.InsertOverwriteDirContext) ctx;
            InsertDirParams insertDirParams = visitInsertOverwriteDir(dirContext);
            return new InsertIntoDir(getLocation(ctx), insertDirParams.isLocal, insertDirParams.storageFormat, insertDirParams.provider, query, true);
        } else if(ctx instanceof SqlBaseParser.InsertOverwriteHiveDirContext) {
            SqlBaseParser.InsertOverwriteHiveDirContext hiveDirContext = (SqlBaseParser.InsertOverwriteHiveDirContext) ctx;
            InsertDirParams insertDirParams = visitInsertOverwriteHiveDir(hiveDirContext);
            return new InsertIntoDir(getLocation(ctx), insertDirParams.isLocal, insertDirParams.storageFormat, insertDirParams.provider, query, true);
        } else {
            throw SparkSQLFieldLineageAstBuilder.parseError("invalidInsertIntoError " + ctx, ctx);
        }
    }

    /**
     * Add a hive-style transform (SELECT TRANSFORM/MAP/REDUCE) query specification to a logical plan.
     */
    private LogicalPlan withTransformQuerySpecification(
            ParserRuleContext ctx,
            SqlBaseParser.TransformClauseContext transformClause,
            List<SqlBaseParser.LateralViewContext> lateralView,
            SqlBaseParser.WhereClauseContext whereClause,
            SqlBaseParser.AggregationClauseContext aggregationClause,
            SqlBaseParser.HavingClauseContext havingClause,
            SqlBaseParser.WindowClauseContext windowClause,
            QueryData relation) {
        if (transformClause.setQuantifier() != null) {
            throw SparkSQLFieldLineageAstBuilder.parseError("transformNotSupportQuantifierError " + transformClause.setQuantifier(), ctx);
        }
        // Create the attributes.
        // ???

        LogicalPlan plan = visitCommonSelectQueryClausePlan(
                getLocation(ctx),
                relation,
                (List<SelectItem>) visitExpressionSeq(transformClause.expressionSeq()),
                lateralView,
                whereClause,
                aggregationClause,
                havingClause,
                windowClause,
                false);

        return plan;
    }

    /**
     * Add a regular (SELECT) query specification to a logical plan. The query specification
     * is the core of the logical plan, this is where sourcing (FROM clause), projection (SELECT),
     * aggregation (GROUP BY ... HAVING ...) and filtering (WHERE) takes place.
     *
     * Note that query hints are ignored (both by the parser and the builder).
     */
    private LogicalPlan withSelectQuerySpecification(
            Origin location,
            ParserRuleContext ctx,
            SqlBaseParser.SelectClauseContext selectClause,
            List<SqlBaseParser.LateralViewContext> lateralView,
            SqlBaseParser.WhereClauseContext whereClause,
            SqlBaseParser.AggregationClauseContext aggregationClause,
            SqlBaseParser.HavingClauseContext havingClause,
            SqlBaseParser.WindowClauseContext windowClause,
            QueryData fromRelation) {
        Boolean isDistinct = selectClause.setQuantifier() != null &&
                selectClause.setQuantifier().DISTINCT() != null;

        LogicalPlan plan = visitCommonSelectQueryClausePlan(
                location,
                fromRelation,
                parseNamedExpressionSeq(selectClause.namedExpressionSeq()),
                lateralView,
                whereClause,
                aggregationClause,
                havingClause,
                windowClause,
                isDistinct);
        // Hint
        // hints ???

        return plan;
    }
    private LogicalPlan visitCommonSelectQueryClausePlan(
            Origin location,
            QueryData fromRelation,
            List<SelectItem> namedExpressions, // selectClause
            List<SqlBaseParser.LateralViewContext> lateralView,
            SqlBaseParser.WhereClauseContext whereClause,
            SqlBaseParser.AggregationClauseContext aggregationClause,
            SqlBaseParser.HavingClauseContext havingClause,
            SqlBaseParser.WindowClauseContext windowClause,
            Boolean isDistinct) {
        // Add lateral views.
        // ???

        // Add where.
        // ???

        // Add aggregation or a project.
        fromRelation.setSelectItems(namedExpressions);

        return fromRelation;
    }

    private TableName parseTableName(SqlBaseParser.MultipartIdentifierContext ctx) {
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
            throw SparkSQLFieldLineageAstBuilder.parseError("parse TableName multipart error: " + ctx.parts.size(), ctx);
        }
    }

    private <T> Optional<T> visitIfPresent(ParserRuleContext context, Class<T> clazz) {
        return Optional.ofNullable(context)
                .map(this::visit)
                .map(clazz::cast);
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
