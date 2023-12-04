package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class Print implements ASTNode {
	private ASTNode logicalExpression;

    public Print(ASTNode logicalExpression) {
        super();
    	this.logicalExpression = logicalExpression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
    	System.out.println(logicalExpression.execute(symbolTable));
    	return null;
    }
}


