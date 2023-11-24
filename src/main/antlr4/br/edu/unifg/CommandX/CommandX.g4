grammar CommandX;

start : PROGRAM ID BRACES_OPEN sentenca* BRACES_CLOSE func* ;

sentenca: declaration | assign_op | print | for_loop | while_loop | decision | read | func_i | array | increment;

primary_variable : INT | DOUBLE | FLOAT |CHAR | BOOLEAN | VAR | STRING;

relationalExpression: EQUALITY_OPERATOR | RELATIONAL_OPERATOR;

arithmeticExpression: ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | MOD;

booleanExpression: AND | OR | NOT;

increment : ID PLUS_PLUS SEMICOL | ID MINUS_MINUS SEMICOL
           | ID PLUS_PLUS | ID MINUS_MINUS;

string: STRING_LITERAL;

assign_arithmetic : ID ASSIGN ID  arithmeticExpression ID
                    | ID ASSIGN ID  arithmeticExpression INTEGER_LITERAL
                    | ID ASSIGN ID  arithmeticExpression READ;

compare:  ID relationalExpression ID (booleanExpression compare)*
          | ID relationalExpression INTEGER_LITERAL (booleanExpression compare)*
          | INTEGER_LITERAL relationalExpression INTEGER_LITERAL (booleanExpression compare)*
          | INTEGER_LITERAL relationalExpression ID (booleanExpression compare)*;

pointer: POINTER_INT | POINTER_DOUBLE | POINTER_FLOAT | POINTER_CHAR
        | POINTER_BOOLEAN | POINTER_STRING | POINTER_VAR;

declaration: primary_variable ID SEMICOL | pointer ID SEMICOL
           | primary_variable assign_op;

assign_op: ID ASSIGN INTEGER_LITERAL SEMICOL
           | ID ASSIGN ID SEMICOL
           | ID ASSIGN read SEMICOL
           | ID ASSIGN STRING_LITERAL SEMICOL;

for_loop: FOR PAR_OPEN primary_variable assign_op compare SEMICOL
            increment PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE
          | FOR PAR_OPEN primary_variable assign_op compare SEMICOL assign_arithmetic
            PAR_CLOSE BRACES_OPEN sentenca BRACES_CLOSE
          | FOR PAR_OPEN assign_op compare SEMICOL assign_arithmetic
            PAR_CLOSE BRACES_OPEN sentenca BRACES_CLOSE
          | FOR PAR_OPEN primary_variable assign_op compare SEMICOL
             increment PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE;

while_loop: WHILE PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE;

simple_decision: IF PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE;

else_if: ELSE IF PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE;

composite_decision: IF PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE
                    ELSE BRACES_OPEN sentenca* BRACES_CLOSE
                    | IF PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE
                      else_if* ELSE BRACES_OPEN sentenca* BRACES_CLOSE
                    | IF PAR_OPEN compare PAR_CLOSE BRACES_OPEN sentenca* BRACES_CLOSE
                        else_if* ;

decision: simple_decision | composite_decision;

number_or_id: INTEGER_LITERAL | ID;

print: PRINT PAR_OPEN number_or_id PAR_CLOSE SEMICOL
       | PRINT PAR_OPEN string PAR_CLOSE SEMICOL;

read: READ PAR_OPEN PAR_CLOSE SEMICOL;

type_return: primary_variable | VOID;
parameter: type_return ID;

func: type_return ID PAR_OPEN parameter* PAR_CLOSE BRACES_OPEN sentenca* PAR_CLOSE;
func_i: ID PAR_OPEN STRING_LITERAL PAR_CLOSE SEMICOL;

array: primary_variable ID BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE SEMICOL
       | primary_variable ID BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE SEMICOL;

INT : 'int';
DOUBLE : 'double';
FLOAT : 'float';
CHAR : 'char';
BOOLEAN : 'boolean';
STRING : 'string';
POINTER_INT : 'int*';
POINTER_DOUBLE : 'double*';
POINTER_FLOAT : 'float*';
POINTER_CHAR : 'char*';
POINTER_BOOLEAN : 'boolean*';
POINTER_STRING : 'string*';
POINTER_VAR : 'var*';

PROGRAM: 'program';
VAR: 'var';
PRINT: 'print';
READ: 'read';
FUNC: 'func';
PROC: 'proc';
VOID: 'void';

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';

ADDITIVE_OPERATOR: '+' | '-';
MULTIPLICATIVE_OPERATOR: '*' | '/';
MOD: '%';

AND: '&&';
OR: '||';
NOT: '!';

PLUS_PLUS: '++';
MINUS_MINUS: '--';

RELATIONAL_OPERATOR: '>' | '<' | '>=' | '<=';
EQUALITY_OPERATOR: '==' | '!=';

ASSIGN: '=';

PAR_OPEN: '(';
PAR_CLOSE: ')';

BRACES_OPEN: '{';
BRACES_CLOSE: '}';

BRACKET_OPEN: '[';
BRACKET_CLOSE: ']';

SEMICOL: ';';
COMMA: ',';

INTEGER_LITERAL: [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
CHAR_LITERAL: '\'' ~["'\r\n] '\'';
STRING_LITERAL: '"' ~["\r\n]* '"';
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* '\r'? '\n' -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
