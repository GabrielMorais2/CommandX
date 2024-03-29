package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class EqualityExpression implements ASTNode {

    private final ASTNode leftOperand;
    private final ASTNode rightOperand;
    private final String operator;

    public EqualityExpression(ASTNode leftOperand, ASTNode rightOperand, String operator) {
        super();
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Executa os operandos
        Object leftResult = leftOperand.execute(symbolTable);
        Object rightResult = rightOperand.execute(symbolTable);

        // Realiza a operação de igualdade ou desigualdade
        switch (operator) {
            case "==":
                return isEqual(leftResult, rightResult);
            case "!=":
                return !isEqual(leftResult, rightResult);
            default:
                throw new RuntimeException("Invalid equality operator: " + operator);
        }
    }

    // Método auxiliar para verificar a igualdade entre dois objetos
    private boolean isEqual(Object left, Object right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return left.equals(right);
        }
    }

}
