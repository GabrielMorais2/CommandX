// Generated from br\edu\u005Cunifg\CommandX\CommandX.g4 by ANTLR 4.5.1
package br.edu.unifg.CommandX;
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import br.edu.unifg.CommandX.ast.*;

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
	 * Visit a parse tree produced by {@link CommandXParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(CommandXParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CommandXParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CommandXParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(CommandXParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(CommandXParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(CommandXParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(CommandXParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(CommandXParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CommandXParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CommandXParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CommandXParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CommandXParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CommandXParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CommandXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CommandXParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CommandXParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNotExpression(CommandXParser.LogicalNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CommandXParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(CommandXParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(CommandXParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#procedure_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_declaration(CommandXParser.Procedure_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CommandXParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(CommandXParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CommandXParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CommandXParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CommandXParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(CommandXParser.TypeDeclarationContext ctx);
}