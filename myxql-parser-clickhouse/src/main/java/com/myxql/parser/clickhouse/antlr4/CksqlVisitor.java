// Generated from /Users/liuningbo/workspace/spl-lineage/myxql-parser-clickhouse/src/main/antlr4/com/myxql/parser/clickhouse/antlr4/Cksql.g4 by ANTLR 4.9.2
package com.myxql.parser.clickhouse.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CksqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CksqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CksqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CksqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CksqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(CksqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(CksqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(CksqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(CksqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CksqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(CksqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(CksqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(CksqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(CksqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(CksqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(CksqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(CksqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(CksqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(CksqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(CksqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(CksqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(CksqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(CksqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(CksqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(CksqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(CksqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(CksqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(CksqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(CksqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(CksqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(CksqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(CksqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(CksqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(CksqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(CksqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(CksqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(CksqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(CksqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(CksqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(CksqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(CksqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#column_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_comment(CksqlParser.Column_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(CksqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(CksqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(CksqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(CksqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(CksqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(CksqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(CksqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(CksqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(CksqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(CksqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(CksqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(CksqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(CksqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#partitionFieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFieldList(CksqlParser.PartitionFieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#partitionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionField(CksqlParser.PartitionFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(CksqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(CksqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(CksqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(CksqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(CksqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(CksqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(CksqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(CksqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(CksqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(CksqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(CksqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(CksqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(CksqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(CksqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(CksqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(CksqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(CksqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(CksqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(CksqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(CksqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(CksqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(CksqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(CksqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(CksqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(CksqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(CksqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(CksqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_table}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(CksqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_package}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(CksqlParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_function}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(CksqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_database}
	 * labeled alternative in {@link CksqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(CksqlParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(CksqlParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(CksqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CksqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(CksqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(CksqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(CksqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(CksqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(CksqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(CksqlParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(CksqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(CksqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_clause(CksqlParser.Partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(CksqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(CksqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(CksqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(CksqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(CksqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(CksqlParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(CksqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(CksqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(CksqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(CksqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(CksqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(CksqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(CksqlParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(CksqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(CksqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(CksqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(CksqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(CksqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(CksqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(CksqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(CksqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(CksqlParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(CksqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(CksqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(CksqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(CksqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(CksqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(CksqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(CksqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(CksqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(CksqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(CksqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(CksqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(CksqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(CksqlParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(CksqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(CksqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(CksqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(CksqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(CksqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(CksqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(CksqlParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(CksqlParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(CksqlParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(CksqlParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(CksqlParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CksqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(CksqlParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(CksqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(CksqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(CksqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(CksqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(CksqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(CksqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(CksqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(CksqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(CksqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(CksqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(CksqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(CksqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(CksqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(CksqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(CksqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(CksqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(CksqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(CksqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(CksqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(CksqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(CksqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(CksqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(CksqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(CksqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(CksqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(CksqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(CksqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(CksqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(CksqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(CksqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(CksqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(CksqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(CksqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(CksqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(CksqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(CksqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(CksqlParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(CksqlParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(CksqlParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(CksqlParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(CksqlParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(CksqlParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(CksqlParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(CksqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(CksqlParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(CksqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(CksqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(CksqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(CksqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(CksqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(CksqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(CksqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(CksqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(CksqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CksqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(CksqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(CksqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(CksqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(CksqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(CksqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(CksqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(CksqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(CksqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(CksqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(CksqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(CksqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(CksqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(CksqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(CksqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(CksqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(CksqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(CksqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(CksqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(CksqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(CksqlParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(CksqlParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(CksqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(CksqlParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(CksqlParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(CksqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(CksqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(CksqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(CksqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(CksqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link CksqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(CksqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(CksqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(CksqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(CksqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(CksqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link CksqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(CksqlParser.Non_reserved_wordsContext ctx);
}