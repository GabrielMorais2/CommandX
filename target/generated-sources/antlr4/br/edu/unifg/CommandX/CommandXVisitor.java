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
}