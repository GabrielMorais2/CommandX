package br.edu.unifg.CommandX.ast;

import java.util.List;
import java.util.Map;

public class ArrayLiteral implements ASTNode {
    private List<ASTNode> elements;

    public ArrayLiteral(List<ASTNode> elements) {
        this.elements = elements;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Criar um array e inicializá-lo com os valores fornecidos
        Object[] array = new Object[elements.size()];

        for (int i = 0; i < elements.size(); i++) {
            array[i] = elements.get(i).execute(symbolTable);
        }

        // Retornar o array criado
        return array;
    }
}
