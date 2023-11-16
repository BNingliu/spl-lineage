// Generated from com\myxql\parser\job\antlr4\MyxqlJobParser.g4 by ANTLR 4.10.1
package com.myxql.parser.job.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyxqlJobParser}.
 */
public interface MyxqlJobParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MyxqlJobParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MyxqlJobParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#jobCommonds}.
	 * @param ctx the parse tree
	 */
	void enterJobCommonds(MyxqlJobParser.JobCommondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#jobCommonds}.
	 * @param ctx the parse tree
	 */
	void exitJobCommonds(MyxqlJobParser.JobCommondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#jobCommond}.
	 * @param ctx the parse tree
	 */
	void enterJobCommond(MyxqlJobParser.JobCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#jobCommond}.
	 * @param ctx the parse tree
	 */
	void exitJobCommond(MyxqlJobParser.JobCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#execCommond}.
	 * @param ctx the parse tree
	 */
	void enterExecCommond(MyxqlJobParser.ExecCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#execCommond}.
	 * @param ctx the parse tree
	 */
	void exitExecCommond(MyxqlJobParser.ExecCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterResourceNameExpr(MyxqlJobParser.ResourceNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitResourceNameExpr(MyxqlJobParser.ResourceNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#classNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterClassNameExpr(MyxqlJobParser.ClassNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#classNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitClassNameExpr(MyxqlJobParser.ClassNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamsExpr(MyxqlJobParser.ParamsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamsExpr(MyxqlJobParser.ParamsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamExpr(MyxqlJobParser.ParamExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamExpr(MyxqlJobParser.ParamExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#filePath}.
	 * @param ctx the parse tree
	 */
	void enterFilePath(MyxqlJobParser.FilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#filePath}.
	 * @param ctx the parse tree
	 */
	void exitFilePath(MyxqlJobParser.FilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#setCommond}.
	 * @param ctx the parse tree
	 */
	void enterSetCommond(MyxqlJobParser.SetCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#setCommond}.
	 * @param ctx the parse tree
	 */
	void exitSetCommond(MyxqlJobParser.SetCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#unsetCommond}.
	 * @param ctx the parse tree
	 */
	void enterUnsetCommond(MyxqlJobParser.UnsetCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#unsetCommond}.
	 * @param ctx the parse tree
	 */
	void exitUnsetCommond(MyxqlJobParser.UnsetCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#useCommond}.
	 * @param ctx the parse tree
	 */
	void enterUseCommond(MyxqlJobParser.UseCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#useCommond}.
	 * @param ctx the parse tree
	 */
	void exitUseCommond(MyxqlJobParser.UseCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#sqlCommond}.
	 * @param ctx the parse tree
	 */
	void enterSqlCommond(MyxqlJobParser.SqlCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#sqlCommond}.
	 * @param ctx the parse tree
	 */
	void exitSqlCommond(MyxqlJobParser.SqlCommondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#keyExpr}.
	 * @param ctx the parse tree
	 */
	void enterKeyExpr(MyxqlJobParser.KeyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#keyExpr}.
	 * @param ctx the parse tree
	 */
	void exitKeyExpr(MyxqlJobParser.KeyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(MyxqlJobParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(MyxqlJobParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(MyxqlJobParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(MyxqlJobParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyxqlJobParser#emptyCommond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCommond(MyxqlJobParser.EmptyCommondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyxqlJobParser#emptyCommond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCommond(MyxqlJobParser.EmptyCommondContext ctx);
}