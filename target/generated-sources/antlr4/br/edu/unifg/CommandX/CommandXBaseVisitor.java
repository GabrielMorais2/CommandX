// Generated from br\edu\u005Cunifg\CommandX\CommandX.g4 by ANTLR 4.5.1
package br.edu.unifg.CommandX;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CommandXVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CommandXBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CommandXVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(CommandXParser.StartContext ctx) { return visitChildren(ctx); }
}