// Generated from CommandX.g4 by ANTLR 4.4
package br.edu.unifg.CommandX;
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import br.edu.unifg.CommandX.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandXParser}.
 */
public interface CommandXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotExpression(@NotNull CommandXParser.LogicalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotExpression(@NotNull CommandXParser.LogicalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull CommandXParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull CommandXParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull CommandXParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull CommandXParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull CommandXParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull CommandXParser.Function_callContext ctx);
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
	 * Enter a parse tree produced by {@link CommandXParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull CommandXParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull CommandXParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration(@NotNull CommandXParser.Procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration(@NotNull CommandXParser.Procedure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(@NotNull CommandXParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(@NotNull CommandXParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull CommandXParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull CommandXParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull CommandXParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull CommandXParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(@NotNull CommandXParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(@NotNull CommandXParser.Read_statementContext ctx);
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
	 * Enter a parse tree produced by {@link CommandXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull CommandXParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull CommandXParser.LogicalAndExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CommandXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull CommandXParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull CommandXParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull CommandXParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull CommandXParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull CommandXParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull CommandXParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull CommandXParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull CommandXParser.PrimaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CommandXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull CommandXParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull CommandXParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull CommandXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull CommandXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull CommandXParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull CommandXParser.LogicalExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CommandXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull CommandXParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull CommandXParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull CommandXParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull CommandXParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull CommandXParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull CommandXParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandXParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull CommandXParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandXParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull CommandXParser.Var_declContext ctx);
}