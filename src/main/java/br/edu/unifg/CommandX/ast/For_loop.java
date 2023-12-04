package br.edu.unifg.CommandX.ast;

import java.util.List;
import java.util.Map;

public class For_loop implements ASTNode {

    private final List<ASTNode> forBody;
    private final ASTNode initialization;
    private final ASTNode logicalExpression;
    private final ASTNode update;

    public For_loop(ASTNode initialization, ASTNode logicalExpression, ASTNode update, List<ASTNode> forBody) {
        super();
        this.initialization = initialization;
        this.logicalExpression = logicalExpression;
        this.update = update;
        this.forBody = forBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        for (initialization.execute(symbolTable); (boolean) logicalExpression.execute(symbolTable); update.execute(symbolTable)) {
            for (ASTNode node : forBody) {
                node.execute(symbolTable);
            }
        }
        return null;
    }


}
