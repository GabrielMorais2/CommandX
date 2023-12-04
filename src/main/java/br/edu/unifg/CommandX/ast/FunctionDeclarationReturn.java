package br.edu.unifg.CommandX.ast;

import java.util.List;
import java.util.Map;

public class FunctionDeclarationReturn implements ASTNode {

    private final String functionName;
    private final List<ASTNode> body;
    private final Map<String, Object> localSymbolTable;
    private final List<Parameter> parameterList;
    private final String returnType;
    private final ASTNode returnFunction;

    public FunctionDeclarationReturn(String functionName, List<ASTNode> body, Map<String, Object> localSymbolTable,
                                     List<Parameter> parameterList, String returnType, ASTNode returnFunction) {
        this.functionName = functionName;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.returnFunction = returnFunction;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(functionName)) {
            throw new RuntimeException("Function " + functionName + " already cleared!");
        }

        if (parameterList != null) {
            for (Parameter parameter : parameterList) {
                localSymbolTable.put(parameter.getName(), parameter.getType());
            }
        }

        symbolTable.put(functionName, this);

        return null;

    }

    public String getReturnType() {
        return returnType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public Map<String, Object> getLocalSymbolTable() {
        return localSymbolTable;
    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public ASTNode getreturnFunction() {
        return returnFunction;
    }

}
