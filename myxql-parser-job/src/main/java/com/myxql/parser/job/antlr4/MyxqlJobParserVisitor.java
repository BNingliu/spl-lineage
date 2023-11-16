// Generated from com\myxql\parser\job\antlr4\MyxqlJobParser.g4 by ANTLR 4.10.1
package com.myxql.parser.job.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyxqlJobParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyxqlJobParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MyxqlJobParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#jobCommonds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobCommonds(MyxqlJobParser.JobCommondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#jobCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobCommond(MyxqlJobParser.JobCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#execCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecCommond(MyxqlJobParser.ExecCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceNameExpr(MyxqlJobParser.ResourceNameExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#classNameExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameExpr(MyxqlJobParser.ClassNameExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#paramsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsExpr(MyxqlJobParser.ParamsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#paramExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamExpr(MyxqlJobParser.ParamExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#filePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePath(MyxqlJobParser.FilePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#setCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCommond(MyxqlJobParser.SetCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#unsetCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetCommond(MyxqlJobParser.UnsetCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#useCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseCommond(MyxqlJobParser.UseCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#sqlCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlCommond(MyxqlJobParser.SqlCommondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#keyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyExpr(MyxqlJobParser.KeyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(MyxqlJobParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(MyxqlJobParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyxqlJobParser#emptyCommond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCommond(MyxqlJobParser.EmptyCommondContext ctx);
}