package com.myxql.parser.presto.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.antlr4.ParseException;
import com.myxql.parser.model.*;
import com.myxql.parser.plan.*;
import com.myxql.parser.presto.antlr4.SqlBaseBaseVisitor;
import com.myxql.parser.presto.antlr4.SqlBaseParser;
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

public class PrestoFieldLineageAstBuilder extends SqlBaseBaseVisitor<Statement> {
//    private Logger logger = LoggerFactory.getLogger(PrestoFieldLineageAstBuilder.class);
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
    public StatementLineage visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        // SingleInsertQuery or MultiInsertQuery
        InsertInto plan = (InsertInto) visit(ctx.statement());
//        logger.info("visitSingleStatement, plan=" + JSONObject.toJSONString(plan));
        PlanParser planParser = new PlanParser();
        TableData tableData = planParser.parseTableData(plan);
        StatementLineage statementLineage = new StatementLineage(this.statementType, Optional.ofNullable(tableData), this.command);
        return statementLineage;
    }

    @Override
    public LogicalPlan visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        TableName tableName = this.parseTableName(ctx.qualifiedName());
        List<String> cols = this.parseColumnAliases(ctx.columnAliases());

        this.statementType = StatementType.INSERT_SELECT;
        LogicalPlan query = visitQuery(ctx.query());

        InsertIntoTable insertIntoTable = new InsertIntoTable(
                getLocation(ctx),
                tableName,
                cols,
                new HashMap<>(),
                query,
                false,
                false);
        InsertInto insertInto = new InsertInto(getLocation(ctx), InsertInto.TARGET_TYPE_TABLE);
        insertInto.addInsertInto(insertIntoTable);
        return insertInto;
    }

    @Override
    public LogicalPlan visitQuery(SqlBaseParser.QueryContext ctx) {
        // with? queryNoWith
        // queryNoWith
        LogicalPlan query = this.typedVisit(ctx.queryNoWith());

        // CTEs
        return Optional.ofNullable(ctx.with())
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
    public LogicalPlan visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        QueryData from = Optional.ofNullable(ctx.fromClause())
                .map(this::visitFromClause)
                .orElse(null);
        List<SelectItem> selectItems = parseSelectItem(ctx.selectClause());

        // Add aggregation or a project.
        from.setSelectItems(selectItems);

        return from;
    }

    /**
     * fromClause, 支持多个关系
     */
    @Override
    public QueryData visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        QueryData from = new QueryData(getLocation(ctx));

        for(SqlBaseParser.RelationContext relationContext : ctx.relation()) {
            from = this.parseRelation(relationContext, from);
        }

        return from;
    }

    private QueryData parseRelation(SqlBaseParser.RelationContext ctx, QueryData from) {
        if(ctx.left != null) {
            QueryData left = this.parseRelation(ctx.left, from);
            if(ctx.right != null) {
                if(ctx.right instanceof SqlBaseParser.SampledRelationContext) {
                    this.parseAliasedRelation(ctx.right.aliasedRelation(), from);
                } else {
                    PrestoFieldLineageAstBuilder.parseError("不支持的from语法", ctx);
                }
            } else if(ctx.rightRelation != null) {
                this.parseRelation(ctx.rightRelation, from);
            } else {
                PrestoFieldLineageAstBuilder.parseError("不支持的from语法", ctx);
            }
        } else if(ctx.sampledRelation() != null) {
            this.parseAliasedRelation(ctx.sampledRelation().aliasedRelation(), from);
        } else {
            PrestoFieldLineageAstBuilder.parseError("不支持的from语法", ctx);
        }

        return from;
    }

    /**
     * 带别名的表名，如：from clauses
     */
    private QueryData parseAliasedRelation(SqlBaseParser.AliasedRelationContext ctx, QueryData from) {
        Integer thisId = ctx.getStart().getStartIndex();
        String alias = Optional.ofNullable(ctx.identifier())
                .map(RuleContext::getText)
                .orElse(null);
        if(ctx.relationPrimary() instanceof SqlBaseParser.TableNameContext) {
            TableName tableName = this.parseTableName(((SqlBaseParser.TableNameContext) ctx.relationPrimary()).qualifiedName());
            FromTable fromTable = new FromTable(tableName, alias);
            from.addFromTable(fromTable);
        } else if(ctx.relationPrimary() instanceof SqlBaseParser.SubqueryRelationContext ||
                ctx.relationPrimary() instanceof SqlBaseParser.LateralContext) {
            SqlBaseParser.SubqueryRelationContext subqueryRelationContext = (SqlBaseParser.SubqueryRelationContext) ctx.relationPrimary();
            // 子查询
            QueryData query = this.typedVisit(subqueryRelationContext.query());
            query.setId(thisId+"");
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
            from.addSubquery(query);
        } else if(ctx.relationPrimary() instanceof SqlBaseParser.ParenthesizedRelationContext) {
            SqlBaseParser.ParenthesizedRelationContext aliasedRelationContext = (SqlBaseParser.ParenthesizedRelationContext) ctx.relationPrimary();
            QueryData relation = this.typedVisit(aliasedRelationContext);
            relation.setId(thisId+"");
            FromTable fromTable = new FromTable(alias);
            from.addFromTable(fromTable);
            from.addSubquery(relation);
        } else {
            PrestoFieldLineageAstBuilder.parseError("不支持的from关系表达式", ctx.relationPrimary());
        }

        return from;
    }


    private List<SelectItem> parseSelectItem(SqlBaseParser.SelectClauseContext ctx) {
        List<SelectItem> selectItems = visit(ctx.selectItem(), SelectItem.class);
        return selectItems;
    }

    /**
     * 别名表达式
     */
    @Override
    public SelectItem visitSelectItem(SqlBaseParser.SelectItemContext ctx) {
        this.visitExpression(ctx.expression());
        SelectItem selectItem = new SelectItem();
        selectItem.setFieldNames(new HashSet<>());
        String alias = Optional.ofNullable(ctx.identifier())
                .map(RuleContext::getText)
                .orElse(null);
        selectItem.setAlias(alias);
        // process
        Optional.ofNullable(ctx)
                .map(SqlBaseParser.SelectItemContext::expression)
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
                .map(SqlBaseParser.SelectItemContext::expression)
                .map(SqlBaseParser.ExpressionContext::booleanExpression)
                .ifPresent(booleanExpressionContext -> {
                    if (booleanExpressionContext instanceof SqlBaseParser.PredicatedContext) {
                        SqlBaseParser.PredicatedContext predicatedContext = (SqlBaseParser.PredicatedContext) booleanExpressionContext;
                        this.parseValueExpression(selectItem, predicatedContext.valueExpression());
                    }
                });

        return selectItem;
    }






    private LogicalPlan withCTE(SqlBaseParser.WithContext ctx, LogicalPlan plan) {
        for(SqlBaseParser.NamedQueryContext nCtx : ctx.namedQuery()) {
            QueryData query = this.typedVisit(nCtx.query());
            String strName = nCtx.name.getText();
            // Check for duplicate names.
            if(plan.containsCte(strName)) {
                throw PrestoFieldLineageAstBuilder.parseError("duplicateCteDefinitionNamesError." + strName, ctx);
            }
            plan.addCte(strName, query);
        }
        return plan;
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
/*
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
 */
            }
            else if(valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.NullLiteralContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.IntervalLiteralContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.TypeConstructorContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.NumericLiteralContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.BooleanLiteralContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.StringLiteralContext ||
                    valueExpressionDefaultContext.primaryExpression() instanceof SqlBaseParser.BinaryLiteralContext) {
                selectItem.setFieldType(SelectItem.FIELD_TYPE_CONST);
                String fieldName = valueExpressionDefaultContext.primaryExpression().getText();
                selectItem.setAlias(fieldName);
                Set<String> fieldNames = new HashSet<>();
                fieldNames.add(fieldName);
                selectItem.setFieldNames(fieldNames);
            } else {
//                logger.info("Unknow expression 1, ctx="+ctx.getText());
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
        } else if (ctx instanceof SqlBaseParser.AtTimeZoneContext) {
//            logger.info("unsupport atTimeZone expression");
            System.exit(-1);
        } else if (ctx instanceof SqlBaseParser.ConcatenationContext) {
//            logger.info("unsupport atTimeZone expression");
            System.exit(-1);
        } else {
//            logger.info("unsupport valueexpression");
            System.exit(-1);
        }
    }

    private List<String> parseColumnAliases(SqlBaseParser.ColumnAliasesContext ctx) {
        List<SqlBaseParser.IdentifierContext> identifierContexts = Optional.ofNullable(ctx)
                .map(SqlBaseParser.ColumnAliasesContext::identifier)
                .orElse(new ArrayList<>());
        List<String> cols = identifierContexts
                .stream()
                .map(RuleContext::getText)
                .collect(toList());
        return cols;
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
            throw PrestoFieldLineageAstBuilder.parseError("parse TableName multipart error: " + ctx.identifier().size(), ctx);
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
