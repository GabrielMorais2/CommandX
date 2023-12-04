package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class IncrementExpression implements ASTNode {

    private final String variable;
    private final String incrementOperator;

    public IncrementExpression(String variable, String incrementOperator) {
        super();
        this.variable = variable;
        this.incrementOperator = incrementOperator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (variable != null) {
            Object value = symbolTable.get(variable);

            if (value instanceof Integer) {
                int intValue = (int) value;
                int result;

                switch (incrementOperator) {
                    case "++":
                        result = intValue + 1;
                        break;
                    case "--":
                        result = intValue - 1;
                        break;
                    default:
                        throw new RuntimeException("Operador inválido para incremento/decremento: " + incrementOperator);
                }

                symbolTable.put(variable, result);
                return result;
            } else {
                throw new RuntimeException("A variável '" + variable + "' não é do tipo inteiro.");
            }
        } else {
            throw new RuntimeException("A variável 'variable' é nula.");
        }
    }
}
