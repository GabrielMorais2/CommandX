package br.edu.unifg.CommandX.AST;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionCall implements ASTNode {
    private String functionName;
    private List<ASTNode> arguments;

    public FunctionCall(String functionName, List<ASTNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        FunctionDeclaration function = (FunctionDeclaration) symbolTable.get(functionName);

        if (function == null) {
            throw new RuntimeException("Função '" + functionName + "' não declarada.");
        }

        List<ASTNode> parameters = function.getBody();
        if (arguments.size() != parameters.size()) {
            throw new RuntimeException("Número incorreto de argumentos para a função '" + functionName + "'.");
        }

        Map<String, Object> localSymbolTable = new HashMap<>(function.getLocalSymbolTable());

        for (int i = 0; i < parameters.size(); i++) {
            ASTNode parameter = parameters.get(i);
            Object argValue = arguments.get(i).execute(symbolTable);
            if (parameter instanceof VarDecl) {
                VarDecl varDecl = (VarDecl) parameter;
                localSymbolTable.put(varDecl.getName(), argValue);
            } else {
                throw new RuntimeException("Parâmetro inválido na declaração da função '" + functionName + "'.");
            }
        }

        for (ASTNode node : function.getBody()) {
            node.execute(localSymbolTable);
        }

        return localSymbolTable.get(FunctionDeclaration.RETURN_VARIABLE_NAME);
    }
}

