
package br.edu.unifg.CommandX;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

	private static final String EXTENSION = "x";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		CommandXLexer lexer = new CommandXLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CommandXParser parser = new CommandXParser(tokens);

		CommandXParser.StartContext tree = parser.start();

		CommandXCustomVisitor visitor = new CommandXCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
