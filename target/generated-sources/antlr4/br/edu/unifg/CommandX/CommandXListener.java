// Generated from CommandX.g4 by ANTLR 4.4
package br.edu.unifg.CommandX;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandXParser}.
 */
public interface CommandXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandXParser#assign_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAssign_arithmetic(@NotNull CommandXParser.Assign_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#assign_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAssign_arithmetic(@NotNull CommandXParser.Assign_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull CommandXParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull CommandXParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull CommandXParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull CommandXParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#type_return}.
	 * @param ctx the parse tree
	 */
	void enterType_return(@NotNull CommandXParser.Type_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#type_return}.
	 * @param ctx the parse tree
	 */
	void exitType_return(@NotNull CommandXParser.Type_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull CommandXParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull CommandXParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(@NotNull CommandXParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(@NotNull CommandXParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull CommandXParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull CommandXParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull CommandXParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull CommandXParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#primary_variable}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_variable(@NotNull CommandXParser.Primary_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#primary_variable}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_variable(@NotNull CommandXParser.Primary_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull CommandXParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull CommandXParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CommandXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CommandXParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull CommandXParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull CommandXParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#func_i}.
	 * @param ctx the parse tree
	 */
	void enterFunc_i(@NotNull CommandXParser.Func_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#func_i}.
	 * @param ctx the parse tree
	 */
	void exitFunc_i(@NotNull CommandXParser.Func_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(@NotNull CommandXParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(@NotNull CommandXParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull CommandXParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull CommandXParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull CommandXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull CommandXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(@NotNull CommandXParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(@NotNull CommandXParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CommandXParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CommandXParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#if_else_structure}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_structure(@NotNull CommandXParser.If_else_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#if_else_structure}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_structure(@NotNull CommandXParser.If_else_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull CommandXParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull CommandXParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CommandXParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CommandXParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#integer_literal_or_id}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal_or_id(@NotNull CommandXParser.Integer_literal_or_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#integer_literal_or_id}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal_or_id(@NotNull CommandXParser.Integer_literal_or_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull CommandXParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull CommandXParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CommandXParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CommandXParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull CommandXParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull CommandXParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(@NotNull CommandXParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(@NotNull CommandXParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull CommandXParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull CommandXParser.Parameter_listContext ctx);
}