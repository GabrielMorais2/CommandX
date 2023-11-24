// Generated from br\edu\u005Cunifg\CommandX\CommandX.g4 by ANTLR 4.5.1
package br.edu.unifg.CommandX;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandXParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CommandXParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CommandXParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(CommandXParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(CommandXParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#integer_literal_or_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal_or_id(CommandXParser.Integer_literal_or_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CommandXParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(CommandXParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#type_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_return(CommandXParser.Type_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CommandXParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(CommandXParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CommandXParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#func_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_i(CommandXParser.Func_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(CommandXParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#assign_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_arithmetic(CommandXParser.Assign_arithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(CommandXParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(CommandXParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CommandXParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CommandXParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(CommandXParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(CommandXParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CommandXParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#else_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement(CommandXParser.Else_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#if_else_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_structure(CommandXParser.If_else_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#decision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecision(CommandXParser.DecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CommandXParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(CommandXParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#primary_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_variable(CommandXParser.Primary_variableContext ctx);
}