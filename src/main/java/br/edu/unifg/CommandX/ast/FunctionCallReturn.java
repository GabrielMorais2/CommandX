package br.edu.unifg.CommandX.ast;

import java.util.List;
import java.util.Map;

public class FunctionCallReturn implements ASTNode {

    private final String functionName;
    private final List<ASTNode> argumentList;

    public FunctionCallReturn(String functionName, List<ASTNode> argumentList) {
        this.functionName = functionName;
        this.argumentList = argumentList;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        FunctionDeclarationReturn functionDeclaration = (FunctionDeclarationReturn) symbolTable.get(functionName);

        if (functionDeclaration == null) {
            throw new RuntimeException("Função '" + functionName + "' não declarada.");
        }

        Map<String, Object> localSymbolTable = functionDeclaration.getLocalSymbolTable();

        if (argumentList != null && functionDeclaration.getParameterList().size() != argumentList.size()) {
            throw new RuntimeException(
                    "Número inválido de argumentos na chamada da função '" + functionName + "'.");
        }

        // Atribui os argumentos aos parâmetros
        for (int i = 0; i < functionDeclaration.getParameterList().size(); i++) {
            Parameter parameter = functionDeclaration.getParameterList().get(i);
            ASTNode argument = argumentList.get(i);

            if (!isTypeCompatible(parameter.getType(), argument.execute(symbolTable))) {
                throw new RuntimeException("Tipos de dados incompatíveis passados como argumentos para a função '"
                        + functionName + "'.");
            }

            localSymbolTable.put(parameter.getName(), argument.execute(symbolTable));
        }

        // Executa o corpo da função
        for (ASTNode node : functionDeclaration.getBody()) {
            node.execute(localSymbolTable);
        }

        // Retorna o valor de retorno da função
        return functionDeclaration.getreturnFunction().execute(localSymbolTable);
    }

    private boolean isTypeCompatible(String declaredType, Object assignedValue) {
        if (assignedValue instanceof Integer || assignedValue instanceof Float) {
            return true;
        } else if (assignedValue instanceof Boolean) {
            return true;
        } else if (assignedValue instanceof String) {
            return true;
        }
        return false;
    }
}
