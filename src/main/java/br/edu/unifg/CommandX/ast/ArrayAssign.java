package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class ArrayAssign implements ASTNode {
	private String arrayName;
    private ASTNode index;
    private ASTNode value;

    public ArrayAssign(String arrayName, ASTNode index, ASTNode value) {
        this.arrayName = arrayName;
        this.index = index;
        this.value = value;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Recuperar o valor do índice
        Object indexValue = index.execute(symbolTable);

        // Ajustar para o método apropriado dependendo da estrutura da sua classe Constant
        int arrayIndex = Integer.parseInt(indexValue.toString());

        // Recuperar a referência para o array da tabela de símbolos
        Object arrayObject = symbolTable.get(arrayName);

        if (arrayObject instanceof Object[]) {
            Object[] array = (Object[]) arrayObject;

            // Verificar se o índice está dentro dos limites do array
            if (arrayIndex >= 0 && arrayIndex < array.length) {
                // Verificar se o tipo do valor é o mesmo que o tipo do array
                String arrayType = array.getClass().getComponentType().getName();
                
                String valueType = value.execute(symbolTable).getClass().getName();

                if (isCompatibleType(arrayType, valueType)) {
                    // Atribuir o valor ao índice especificado
                    array[arrayIndex] = value.execute(symbolTable);
                } else {
                    throw new RuntimeException("Tipos incompatíveis para atribuição ao array.");
                }
            } else {
                throw new RuntimeException("Índice fora dos limites do array.");
            }
        } else {
            throw new RuntimeException("A variável não é um array.");
        }

        return null;
    }

    private boolean isCompatibleType(String arrayType, String valueType) {

        return arrayType.equals(valueType);
    }
}
