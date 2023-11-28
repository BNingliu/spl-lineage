// Generated from /Users/liuningbo/workspace/spl-lineage/myxql-parser-clickhouse/src/main/antlr4/com/myxql/parser/clickhouse/antlr4/Cksql.g4 by ANTLR 4.9.2
package com.myxql.parser.clickhouse.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CksqlParser}.
 */
public interface CksqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CksqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CksqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CksqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CksqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CksqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(CksqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(CksqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(CksqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(CksqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(CksqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(CksqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(CksqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(CksqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CksqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CksqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(CksqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(CksqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(CksqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(CksqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(CksqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(CksqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(CksqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(CksqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(CksqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(CksqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(CksqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(CksqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(CksqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(CksqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(CksqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(CksqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(CksqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(CksqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(CksqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(CksqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(CksqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(CksqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(CksqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(CksqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(CksqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(CksqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(CksqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(CksqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(CksqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(CksqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(CksqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(CksqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(CksqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(CksqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(CksqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(CksqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(CksqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(CksqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(CksqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(CksqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(CksqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(CksqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(CksqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(CksqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(CksqlParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(CksqlParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(CksqlParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(CksqlParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(CksqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(CksqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(CksqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(CksqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(CksqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(CksqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(CksqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(CksqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(CksqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(CksqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(CksqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(CksqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(CksqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(CksqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void enterColumn_comment(CksqlParser.Column_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void exitColumn_comment(CksqlParser.Column_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(CksqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(CksqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(CksqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(CksqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(CksqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(CksqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(CksqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(CksqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(CksqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(CksqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(CksqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(CksqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(CksqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(CksqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(CksqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(CksqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(CksqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(CksqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(CksqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(CksqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(CksqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(CksqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(CksqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(CksqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(CksqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(CksqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFieldList(CksqlParser.PartitionFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFieldList(CksqlParser.PartitionFieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionField(CksqlParser.PartitionFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionField(CksqlParser.PartitionFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(CksqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(CksqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(CksqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(CksqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(CksqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(CksqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(CksqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(CksqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(CksqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(CksqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(CksqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(CksqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(CksqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(CksqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint_item(CksqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint_item(CksqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(CksqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(CksqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(CksqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(CksqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(CksqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(CksqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(CksqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(CksqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(CksqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(CksqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(CksqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(CksqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(CksqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(CksqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(CksqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(CksqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(CksqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(CksqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(CksqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(CksqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(CksqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(CksqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(CksqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(CksqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(CksqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(CksqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(CksqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(CksqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(CksqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(CksqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(CksqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(CksqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(CksqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(CksqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(CksqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(CksqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(CksqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(CksqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code drop_table}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(CksqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code drop_table}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(CksqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code drop_package}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(CksqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code drop_package}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(CksqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code drop_function}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(CksqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code drop_function}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(CksqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code drop_database}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(CksqlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code drop_database}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(CksqlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_stmt(CksqlParser.End_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_stmt(CksqlParser.End_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(CksqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(CksqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CksqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CksqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(CksqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(CksqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(CksqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(CksqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(CksqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(CksqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(CksqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(CksqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(CksqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(CksqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(CksqlParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(CksqlParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(CksqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(CksqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(CksqlParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(CksqlParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause(CksqlParser.Partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause(CksqlParser.Partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_cols(CksqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_cols(CksqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_rows(CksqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_rows(CksqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_row(CksqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_row(CksqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_directory_stmt(CksqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_directory_stmt(CksqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(CksqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(CksqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(CksqlParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(CksqlParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(CksqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(CksqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(CksqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(CksqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(CksqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(CksqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(CksqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(CksqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_item(CksqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_item(CksqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(CksqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(CksqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(CksqlParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(CksqlParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(CksqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(CksqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(CksqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(CksqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_stmt(CksqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_stmt(CksqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_clause(CksqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_clause(CksqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(CksqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(CksqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(CksqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(CksqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(CksqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(CksqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_local_stmt(CksqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_local_stmt(CksqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(CksqlParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(CksqlParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void enterCopy_source(CksqlParser.Copy_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void exitCopy_source(CksqlParser.Copy_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void enterCopy_target(CksqlParser.Copy_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void exitCopy_target(CksqlParser.Copy_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(CksqlParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(CksqlParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_option(CksqlParser.Copy_file_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_option(CksqlParser.Copy_file_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(CksqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(CksqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(CksqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(CksqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(CksqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(CksqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(CksqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(CksqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(CksqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(CksqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(CksqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(CksqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(CksqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(CksqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(CksqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(CksqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(CksqlParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(CksqlParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CksqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CksqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(CksqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(CksqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(CksqlParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(CksqlParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(CksqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(CksqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(CksqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(CksqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(CksqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(CksqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(CksqlParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(CksqlParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSummary_stmt(CksqlParser.Summary_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSummary_stmt(CksqlParser.Summary_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(CksqlParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(CksqlParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(CksqlParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(CksqlParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(CksqlParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(CksqlParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CksqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CksqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(CksqlParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(CksqlParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(CksqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(CksqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(CksqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(CksqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(CksqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(CksqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(CksqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(CksqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(CksqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(CksqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(CksqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(CksqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(CksqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(CksqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(CksqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(CksqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(CksqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(CksqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(CksqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(CksqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(CksqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(CksqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(CksqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(CksqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(CksqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(CksqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(CksqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(CksqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(CksqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(CksqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(CksqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(CksqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(CksqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(CksqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(CksqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(CksqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(CksqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(CksqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(CksqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(CksqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(CksqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(CksqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(CksqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(CksqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(CksqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(CksqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(CksqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(CksqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(CksqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(CksqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(CksqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(CksqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(CksqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(CksqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(CksqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(CksqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(CksqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(CksqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(CksqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(CksqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(CksqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(CksqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(CksqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(CksqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(CksqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(CksqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(CksqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(CksqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(CksqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(CksqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(CksqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(CksqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_assignment(CksqlParser.Update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_assignment(CksqlParser.Update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_table(CksqlParser.Update_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_table(CksqlParser.Update_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_upsert(CksqlParser.Update_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_upsert(CksqlParser.Update_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_stmt(CksqlParser.Merge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_stmt(CksqlParser.Merge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table(CksqlParser.Merge_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table(CksqlParser.Merge_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_condition(CksqlParser.Merge_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_condition(CksqlParser.Merge_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void enterMerge_action(CksqlParser.Merge_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void exitMerge_action(CksqlParser.Merge_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(CksqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(CksqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void enterDelete_alias(CksqlParser.Delete_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void exitDelete_alias(CksqlParser.Delete_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(CksqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(CksqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(CksqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(CksqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(CksqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(CksqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(CksqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(CksqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(CksqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(CksqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(CksqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(CksqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(CksqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(CksqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(CksqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(CksqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(CksqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(CksqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CksqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CksqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(CksqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(CksqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(CksqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(CksqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(CksqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(CksqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(CksqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(CksqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(CksqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(CksqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(CksqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(CksqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(CksqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(CksqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(CksqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(CksqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(CksqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(CksqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(CksqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(CksqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(CksqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(CksqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(CksqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(CksqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(CksqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(CksqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(CksqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(CksqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(CksqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(CksqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(CksqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(CksqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(CksqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(CksqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void enterExpr_select(CksqlParser.Expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void exitExpr_select(CksqlParser.Expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void enterExpr_file(CksqlParser.Expr_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void exitExpr_file(CksqlParser.Expr_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void enterHive(CksqlParser.HiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void exitHive(CksqlParser.HiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void enterHive_item(CksqlParser.Hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void exitHive_item(CksqlParser.Hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(CksqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(CksqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(CksqlParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(CksqlParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(CksqlParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(CksqlParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(CksqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(CksqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(CksqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(CksqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(CksqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(CksqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(CksqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(CksqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(CksqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(CksqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(CksqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(CksqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(CksqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(CksqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(CksqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(CksqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(CksqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(CksqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(CksqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(CksqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link CksqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(CksqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CksqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(CksqlParser.Non_reserved_wordsContext ctx);
}