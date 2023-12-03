package br.edu.unifg.CommandX.AST;

import java.util.List;
import java.util.Map;

public class ProcedureDeclaration implements ASTNode {

    private String procedureName;
    private List<ASTNode> body;
    private Map<String, Object> localSymbolTable;

    public ProcedureDeclaration(String procedureName, List<ASTNode> body, Map<String, Object> localSymbolTable) {
        this.procedureName = procedureName;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(procedureName, this);

        for (ASTNode node : body) {
            node.execute(localSymbolTable);
        }

        return null;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public Map<String, Object> getLocalSymbolTable() {
        return localSymbolTable;
    }
}
