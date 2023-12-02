package AST;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcedureCall implements ASTNode {
    private String procedureName;
    private List<ASTNode> argumentList;

    public ProcedureCall(String procedureName, List<ASTNode> argumentList) {
        this.procedureName = procedureName;
        this.argumentList = argumentList;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        ProcedureDeclaration procedureDeclaration = (ProcedureDeclaration) symbolTable.get(procedureName);

        if (procedureDeclaration == null) {
            throw new RuntimeException("Procedimento '" + procedureName + "' não declarado.");
        }

        List<ASTNode> parameters = procedureDeclaration.getBody();
        if (argumentList.size() != parameters.size()) {
            throw new RuntimeException("Número incorreto de argumentos para o procedimento '" + procedureName + "'.");
        }

        if (procedureDeclaration != null) {
            Map<String, Object> localSymbolTable = new HashMap<>(procedureDeclaration.getLocalSymbolTable());

            for (int i = 0; i < parameters.size(); i++) {
                ASTNode parameter = parameters.get(i);
                Object argValue = argumentList.get(i).execute(symbolTable);
                if (parameter instanceof VarDecl) {
                    VarDecl varDecl = (VarDecl) parameter;
                    localSymbolTable.put(varDecl.getName(), argValue);
                } else {
                    throw new RuntimeException("Parâmetro inválido na declaração do procedimento '" + procedureName + "'.");
                }
            }

            for (ASTNode node : procedureDeclaration.getBody()) {
                node.execute(localSymbolTable);
            }

            return null;
        } else {
            throw new RuntimeException("Procedimento não encontrado: " + procedureName);
        }
    }
}

