package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class ArrayAccess implements ASTNode{
	private String arrayName;
    private ASTNode index;

    public ArrayAccess(String arrayName, ASTNode index) {
        this.arrayName = arrayName;
        this.index = index;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Recuperar o valor do índice
    	 Object indexValue = index.execute(symbolTable);
    	 int arrayIndex = Integer.parseInt(indexValue.toString());

        // Recuperar a referência para o array da tabela de símbolos
        Object arrayObject = symbolTable.get(arrayName);

        if (arrayObject instanceof Object[]) {
            Object[] array = (Object[]) arrayObject;

            // Verificar se o índice está dentro dos limites do array
            if (arrayIndex >= 0 && arrayIndex < array.length) {
                // Retornar o valor no índice especificado
                return array[arrayIndex];
            } else {
                throw new RuntimeException("Índice fora dos limites do array.");
            }
        } else {
            throw new RuntimeException("A variável não é um array.");
        }
    }
}
