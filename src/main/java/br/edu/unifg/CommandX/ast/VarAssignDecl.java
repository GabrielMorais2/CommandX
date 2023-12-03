package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class VarAssignDecl extends VarDecl{
	private ASTNode logicalExpression;

    public VarAssignDecl(String name, String type, ASTNode logicalExpression) {
        super(name, type);
        this.logicalExpression = logicalExpression;
    }
    
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(getName())) {
            throw new RuntimeException("Variable '" + getName() + "' already declared.");
        }
        
        Object result = logicalExpression.execute(symbolTable);
        symbolTable.put(getName(), result);

        return result;
    }

    
    public ASTNode getValue() {
        return logicalExpression;
    }
}
