grammar CommandX;

@parser::header{ 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import br.edu.unifg.CommandX.ast.*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
	Map<String, Object> functionSymbolTable = new HashMap<String, Object>();
}

start: PROGRAM ID BRACES_OPEN
		{
			List<ASTNode> body = new ArrayList<ASTNode>();
			Map<String, Object> symbolTable = new HashMap<String, Object>();
		}
		(sentence {body.add($sentence.node);})*
		BRACES_CLOSE
		{
			for(ASTNode n : body) {
				n.execute(symbolTable);
			}
		};

sentence returns [ASTNode node]: 
	  print {$node = $print.node;} 
	| conditional {$node = $conditional.node;}
	| incrementExpression {$node = $incrementExpression.node;}
	| while_loop {$node = $while_loop.node;}
	| var_decl {$node = $var_decl.node;}
	| var_assign {$node = $var_assign.node;}
	| read_statement {$node = $read_statement.node;}
	| for_loop {$node = $for_loop.node;}
	| for_loop_increment {$node = $for_loop_increment.node;}
	| function_declaration {$node = $function_declaration.node;}
	| function_declaration_with_return {$node = $function_declaration_with_return.node;}
	| procedure_declaration {$node = $procedure_declaration.node;}
	| function_call {$node = $function_call.node;}
	| procedure_call {$node = $procedure_call.node;}
	| pointer_decl {$node = $pointer_decl.node;}
	| pointer_manipulation {$node = $pointer_manipulation.node;}
	| comment
	;

comment: LINE_COMMENT | BLOCK_COMMENT;

print returns [ASTNode node]: PRINT PAR_OPEN logicalExpression PAR_CLOSE SEMICOL
	{$node = new Print($logicalExpression.node);}
	| PRINT PAR_OPEN { System.out.println(); } PAR_CLOSE SEMICOL;

read_statement returns [ASTNode node]: READ ID SEMICOL
	{$node = new Read($ID.text);};
	
conditional returns [ASTNode node]:
    IF PAR_OPEN ifLogicalExpression=logicalExpression PAR_CLOSE
    {
        List<ASTNode> ifBody = new ArrayList<ASTNode>();
        List<ASTNode> elseBody = new ArrayList<ASTNode>();
        List<ElifNode> elifNodes = new ArrayList<ElifNode>();
    }
    BRACES_OPEN
        (s1 = sentence {ifBody.add($s1.node);})*
    BRACES_CLOSE
(
        (ELIF PAR_OPEN elifLogicalExpression=logicalExpression PAR_CLOSE
            { List<ASTNode> elifBody = new ArrayList<ASTNode>(); }
            BRACES_OPEN
                (s2 = sentence {elifBody.add($s2.node);})*
            BRACES_CLOSE
            { ElifNode elifNode = new ElifNode($elifLogicalExpression.node, elifBody); elifNodes.add(elifNode); }
        )+
    )?
    (
        ELSE BRACES_OPEN
            (s3 = sentence {elseBody.add($s3.node);})* 
        BRACES_CLOSE
    )?
    {
        $node = new If($ifLogicalExpression.node, ifBody, elifNodes, elseBody);
    };
while_loop returns [ASTNode node]: WHILE PAR_OPEN logicalExpression PAR_CLOSE
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	BRACES_OPEN (s1 = sentence {body.add($s1.node);})* BRACES_CLOSE
	{
		$node = new While_loop($logicalExpression.node, body);
	};

for_loop returns [ASTNode node]:
    FOR PAR_OPEN initialization=var_assign
    logicalExpression SEMICOL
    update=var_assign PAR_CLOSE
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
    }
    BRACES_OPEN (s = sentence {body.add($s.node);})* BRACES_CLOSE
    {
        $node = new For_loop($initialization.node, $logicalExpression.node, $update.node, body);
    };
    
for_loop_increment returns [ASTNode node]:
    FOR PAR_OPEN initialization=var_assign
    logicalExpression SEMICOL
    update=incrementExpression PAR_CLOSE
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
    }
    BRACES_OPEN (s = sentence {body.add($s.node);})* BRACES_CLOSE
    {
        $node = new For_loop($initialization.node, $logicalExpression.node, $update.node, body);
    };

    
logicalExpression returns [ASTNode node]:
	  logicalOrExpression {$node = $logicalOrExpression.node;}
	| logicalAndExpression {$node = $logicalAndExpression.node;}
	| NOT logicalExpression {$node = new LogicalNot($logicalExpression.node);}
	| function_call {$node = $function_call.node;}
	;

logicalOrExpression returns [ASTNode node]: 
    logicalAndExpression {$node = $logicalAndExpression.node;}
    (OR right=logicalAndExpression {$node = new LogicalOr($node, $right.node);})*
    ;

logicalAndExpression returns [ASTNode node]: 
    equalityExpression {$node = $equalityExpression.node;}
    (AND right=equalityExpression {$node = new LogicalAnd($node, $right.node);})*
    ;

equalityExpression returns [ASTNode node]: 
    relationalExpression {$node = $relationalExpression.node;}
    (EQUALITY_OPERATOR right=relationalExpression {$node = new EqualityExpression($node, $right.node, $EQUALITY_OPERATOR.text);})*
    ;

relationalExpression returns [ASTNode node]: 
    additiveExpression {$node = $additiveExpression.node;}
    (RELATIONAL_OPERATOR right=additiveExpression {$node = new RelationalExpression($node, $right.node, $RELATIONAL_OPERATOR.text);})*
    ;

additiveExpression returns [ASTNode node]: 
    multiplicativeExpression {$node = $multiplicativeExpression.node;}
    (ADDITIVE_OPERATOR right=multiplicativeExpression {$node = new AdditiveExpression($node, $right.node, $ADDITIVE_OPERATOR.text);})*
    ;

multiplicativeExpression returns [ASTNode node]: 
    unaryExpression {$node = $unaryExpression.node;}
    (MULTIPLICATIVE_OPERATOR right=unaryExpression {$node = new MultiplicativeExpression($node, $right.node, $MULTIPLICATIVE_OPERATOR.text);})*
    ;
    
incrementExpression returns [ASTNode node]: 
    ID op=INCREMENT_OPERATOR (SEMICOL)?  
    {$node = new IncrementExpression($ID.text, $op.text);}
    ;
  
unaryExpression returns [ASTNode node]: 
    ADDITIVE_OPERATOR operand=unaryExpression {$node = new UnaryExpression($ADDITIVE_OPERATOR.text, $operand.node);}
    | primaryExpression {$node = $primaryExpression.node;}
    ;

primaryExpression returns [ASTNode node]: 
    logicalNotExpression {$node = $logicalNotExpression.node;}
    | INTEGER_LITERAL {$node = new Constant(Integer.parseInt($INTEGER_LITERAL.text));}
    | BOOLEAN_LITERAL {$node = new Constant(Boolean.parseBoolean($BOOLEAN_LITERAL.text));}
    | CHAR_LITERAL {$node = new Constant($CHAR_LITERAL.text.charAt(1));}
    | STRING_LITERAL {$node = new Constant($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | FLOAT_LITERAL {$node = new Constant(Float.parseFloat($FLOAT_LITERAL.text));}
    | ID {$node = new VarRef($ID.text);}
    | PAR_OPEN expr=logicalExpression PAR_CLOSE {$node = $expr.node;}
    ;

logicalNotExpression returns [ASTNode node]: 
    NOT operand=primaryExpression {$node = new LogicalNot($operand.node);}
    ;
pointer_var: 'int*' |'double*' | 'char*'| 'bool*' | 'string*';
pointer_decl returns [ASTNode node]: POINTER pointer_var ID SEMICOL {
	symbolTable.put($ID.text, $pointer_var.text);
	$node = new VarDecl($ID.text, $pointer_var.text);
};

var_assign returns [ASTNode node]: ID ASSING logicalExpression SEMICOL {
	String declaredType = (String) symbolTable.get($ID.text);
	$node = new VarAssign($ID.text, $logicalExpression.node,declaredType);
};

pointer_assign returns [ASTNode node]: POINTER pointer=ID ASSING variable=ID SEMICOL {
	String declaredTypePointer = (String) symbolTable.get($pointer.text);
	String declaredTypeVar = (String) symbolTable.get($variable.text);
	symbolTable.put($pointer.text, $variable.text);
	$node = new PointerAssign($pointer.text, $variable.text,declaredTypePointer,declaredTypeVar);
};


value_pointer returns [ASTNode node]: INTEGER_LITERAL {$node = new Constant(Integer.parseInt($INTEGER_LITERAL.text));}
    | BOOLEAN_LITERAL {$node = new Constant(Boolean.parseBoolean($BOOLEAN_LITERAL.text));}
    | CHAR_LITERAL {$node = new Constant($CHAR_LITERAL.text.charAt(1));}
    | STRING_LITERAL {$node = new Constant($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | DOUBLE_LITERAL {$node = new Constant(Float.parseFloat($DOUBLE_LITERAL.text));};

pointer_manipulation returns [ASTNode node]: POINTER ID ASSING value_pointer SEMICOL {
	String pointerValue = (String) symbolTable.get($ID.text);
	$node = new PointerManipulation($ID.text, $value_pointer.node,pointerValue);
};

var_decl returns [ASTNode node]: typeDeclaration ID SEMICOL {$node = new VarDecl($ID.text, $typeDeclaration.text);}
							   | typeDeclaration ID  ASSIGN logicalExpression SEMICOL {$node = new VarAssignDecl($ID.text, $typeDeclaration.text, $logicalExpression.node);}
							   | typeDeclaration ID  ASSIGN function_call (SEMICOL)? {$node = new VarAssignDecl($ID.text, $typeDeclaration.text, $function_call.node);} ;

function_declaration returns [ASTNode node]:
    FUNC ID PAR_OPEN parameterList PAR_CLOSE
    BRACES_OPEN 
    {
        List<ASTNode> body = new ArrayList<>();
        Map<String, Object> localSymbolTable = new HashMap<>();
        List<Parameter> parameterList = $parameterList.list;
    }
    (s = sentence { body.add($s.node); })*
    {$node = new FunctionDeclaration($ID.text, body, localSymbolTable, parameterList);}
    BRACES_CLOSE
    {
        functionSymbolTable.put($ID.text, new FunctionDeclaration($ID.text, body, localSymbolTable, null));
    }
    |
    FUNC ID PAR_OPEN PAR_CLOSE
    BRACES_OPEN 
    {
        List<ASTNode> body = new ArrayList<>();
        Map<String, Object> localSymbolTable = new HashMap<>();
    }
    (s = sentence { body.add($s.node); })*
    {$node = new FunctionDeclaration($ID.text, body, localSymbolTable, null);}
    BRACES_CLOSE
    {
        functionSymbolTable.put($ID.text, new FunctionDeclaration($ID.text, body, localSymbolTable, null));
    }
;

function_declaration_with_return returns [ASTNode node]:
    FUNC typeDeclaration ID PAR_OPEN parameterList PAR_CLOSE 
     BRACES_OPEN
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
        List<Parameter> parameterList = $parameterList.list;
        ASTNode returnFunc = null;
    }
    (s = sentence {body.add($s.node);})*
    (r = returnFunc {returnFunc = $r.node;} )
    {$node = new FunctionDeclarationReturn($ID.text, body, localSymbolTable, parameterList, $typeDeclaration.text, returnFunc);}
    BRACES_CLOSE
    {
        functionSymbolTable.put($ID.text, new FunctionDeclarationReturn($ID.text, body, localSymbolTable, parameterList, $typeDeclaration.text, returnFunc));
    }
    |
    FUNC typeDeclaration ID PAR_OPEN PAR_CLOSE
    BRACES_OPEN
    {
        List<ASTNode> body = new ArrayList<>();
        Map<String, Object> localSymbolTable = new HashMap<>();
        ASTNode returnFunc = null;
    }
    (s = sentence { body.add($s.node); })*
    (r = returnFunc { returnFunc = $r.node; } )?
    {$node = new FunctionDeclarationReturn($ID.text, body, localSymbolTable, null, $typeDeclaration.text, returnFunc);}
    BRACES_CLOSE
    {
        functionSymbolTable.put($ID.text, new FunctionDeclarationReturn($ID.text, body, localSymbolTable, null, $typeDeclaration.text, returnFunc));
    }
    ;

returnFunc returns [ASTNode node]:
    RETURN expr=logicalExpression SEMICOL
    {
        $node = new ReturnFunc($expr.node);
    }
    ;

function_call returns [ASTNode node]:
    ID PAR_OPEN PAR_CLOSE SEMICOL
    {
        Object declaration = functionSymbolTable.get($ID.text);

        if (declaration instanceof FunctionDeclarationReturn) {
            $node = new FunctionCall($ID.text, null, true);
        } else if (declaration instanceof FunctionDeclaration) {
            $node = new FunctionCall($ID.text, null, false);
        }
    }
    |
    ID PAR_OPEN argumentList PAR_CLOSE SEMICOL
    {
        Object declaration = functionSymbolTable.get($ID.text);

        if (declaration instanceof FunctionDeclarationReturn) {
            $node = new FunctionCall($ID.text, $argumentList.list, true);
        } else if (declaration instanceof FunctionDeclaration) {
            $node = new FunctionCall($ID.text, $argumentList.list, false);
        }
    }
    ;

procedure_declaration returns [ASTNode node]: PROC ID PAR_OPEN parameterList PAR_CLOSE BRACES_OPEN
		{
			List<ASTNode> body = new ArrayList<ASTNode>();
			Map<String, Object> localSymbolTable = new HashMap<String, Object>();
		}
		(s = sentence {body.add($s.node);})* BRACES_CLOSE
		{$node = new ProcedureDeclaration($ID.text, body, localSymbolTable);};

procedure_call returns [ASTNode node]: ID PAR_OPEN argumentList PAR_CLOSE SEMICOL
		{$node = new ProcedureCall($ID.text, $argumentList.list);};

argumentList returns [List<ASTNode> list]: 
		{List<ASTNode> args = new ArrayList<ASTNode>();}
		(e = logicalExpression {args.add($e.node);} (COMMA e = logicalExpression {args.add($e.node);})*)
		{$list = args;};

parameterList returns [List<Parameter> list]: 
		{List<Parameter> params = new ArrayList<Parameter>();}
		(p = parameter {params.add($p.param);} (COMMA p = parameter {params.add($p.param);})*)
		{$list = params;};

parameter returns [Parameter param]: 
		typeDeclaration ID {$param = new Parameter($typeDeclaration.text, $ID.text);};
		
typeDeclaration : INT | FLOAT |CHAR | BOOLEAN | VAR | STRING;

INT : 'int';
FLOAT : 'float';
CHAR : 'char';
BOOLEAN : 'boolean';
STRING : 'string';
POINTER: 'pointer';

PROGRAM: 'program';
VAR: 'var';
READ: 'read';
PRINT: 'print';
FUNC: 'func';
PROC: 'proc';
VOID: 'void';
RETURN: 'return';

IF: 'if';
ELSE: 'else';
ELIF: 'elif';
FOR: 'for';
WHILE: 'while';

ADDITIVE_OPERATOR: '+' | '-';
MULTIPLICATIVE_OPERATOR: '*' | '/';
MOD: '%';

INCREMENT_OPERATOR: '++' | '--';

AND: '&&';
OR: '||';
NOT: '!';

RELATIONAL_OPERATOR: '>' | '<' | '>=' | '<=';
EQUALITY_OPERATOR: '==' | '!=';

ASSING: '=';

PAR_OPEN: '(';
PAR_CLOSE: ')';

BRACES_OPEN: '{';
BRACES_CLOSE: '}';

BRACKET_OPEN: '[';
BRACKET_CLOSE: ']';

SEMICOL: ';';
COMMA: ',';

INTEGER_LITERAL: '-'? [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
CHAR_LITERAL: '\'' ~["'\r\n] '\'';
STRING_LITERAL: '"' ~["\r\n]* '"';
FLOAT_LITERAL: '-'? [0-9]+ '.' [0-9]+;
DOUBLE_LITERAL: [0-9]+ '.' [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* '\r'? '\n' -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
