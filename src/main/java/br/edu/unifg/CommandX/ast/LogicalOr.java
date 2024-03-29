package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class LogicalOr implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public LogicalOr(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (boolean) leftValue || (boolean) rightValue;
        } else {
            throw new RuntimeException("Operação lógica OR aplicada a tipos não booleanos");
        }
    }
}
