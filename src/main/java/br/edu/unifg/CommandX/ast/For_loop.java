package br.edu.unifg.CommandX.ast;

import java.util.List;
import java.util.Map;

public class For_loop implements ASTNode{
	
	 private List<ASTNode> forBody;
	    private ASTNode initialization;
	    private ASTNode logicalExpression;
	    private ASTNode update;

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
