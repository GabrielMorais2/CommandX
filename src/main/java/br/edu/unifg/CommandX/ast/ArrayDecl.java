package br.edu.unifg.CommandX.ast;

import java.util.Map;

public class ArrayDecl implements ASTNode {
    private String arrayName;
    private String elementType;
    private int size;

    public ArrayDecl(String arrayName, String elementType, int size) {
        this.arrayName = arrayName;
        this.elementType = elementType;
        this.size = size;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verificar o tipo do elemento
        Class<?> arrayType;
        switch (elementType) {
            case "int":
                arrayType = Integer[].class;
                break;
            case "float":
                arrayType = Float[].class;
                break;
            case "boolean":
                arrayType = Boolean[].class;
                break;
            case "string":
                arrayType = String[].class;
                break;
            default:
                throw new RuntimeException("Tipo de elemento inválido: " + elementType);
        }

        // Criar um array vazio com o tamanho especificado
        Object array;
        try {
            array = arrayType.cast(java.lang.reflect.Array.newInstance(arrayType.getComponentType(), size));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar array: " + e.getMessage());
        }

        // Inicializar a tabela de símbolos com o array criado
        symbolTable.put(arrayName, array);

        return null;
    }
}
