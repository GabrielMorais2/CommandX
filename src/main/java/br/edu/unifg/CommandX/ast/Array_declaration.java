package br.edu.unifg.CommandX.ast;

import java.util.Map;
import java.util.List;

public class Array_declaration implements ASTNode {
    private String type;
    private String ID;
    private int Dimentions;

    public Array_declaration(String type, String ID, int Dimentions) {
        this.type = type;
        this.ID = ID;
        this.Dimentions = Dimentions;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        int total = Dimentions;

        Object[] array = new Object[total];

        symbolTable.put(ID,array);

        return null;
    }
}
