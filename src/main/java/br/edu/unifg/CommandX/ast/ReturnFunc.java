package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class ReturnFunc implements ASTNode {

    private final ASTNode expression;

    public ReturnFunc(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return expression.execute(symbolTable);
    }
}
