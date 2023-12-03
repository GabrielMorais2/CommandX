package br.edu.unifg.CommandX.AST;

import java.util.Map;

public interface ASTNode {
    public Object execute(Map<String, Object> symbolTable);
}
