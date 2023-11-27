grammar CommandX;

start : PROGRAM ID BRACES_OPEN statement* BRACES_CLOSE function* ;

statement: declaration | assign_operator | print | for_loop | while_loop | decision | function | array | increment;

relationalExpression: EQUALITY_OPERATOR | RELATIONAL_OPERATOR;

arithmeticExpression: ADDITIVE_OPERATOR | MULTIPLICATIVE_OPERATOR | MOD;

booleanExpression: AND | OR | NOT;

integer_literal_or_id: INTEGER_LITERAL | ID;

string: STRING_LITERAL;

type_return: primary_variable;
parameter: type_return ID;
parameter_list: parameter (COMMA parameter)*;

function: type_return ID PAR_OPEN parameter_list* PAR_CLOSE BRACES_OPEN statement* RETURN (ID | literal_values) SEMICOL BRACES_CLOSE
          | VOID ID PAR_OPEN parameter_list? PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE;

increment : ID PLUS_PLUS SEMICOL | ID MINUS_MINUS SEMICOL
           | ID PLUS_PLUS | ID MINUS_MINUS;

assign_arithmetic : ID ASSIGN ID  arithmeticExpression ID
                    | ID ASSIGN ID  arithmeticExpression INTEGER_LITERAL;

assign_operator: ID ASSIGN INTEGER_LITERAL SEMICOL
           | ID ASSIGN ID SEMICOL
           | ID ASSIGN STRING_LITERAL SEMICOL;

conditional_expression:  ID relationalExpression ID (booleanExpression conditional_expression)*
          | ID relationalExpression INTEGER_LITERAL (booleanExpression conditional_expression)*
          | INTEGER_LITERAL relationalExpression INTEGER_LITERAL (booleanExpression conditional_expression)*
          | INTEGER_LITERAL relationalExpression ID (booleanExpression conditional_expression)*;

pointer: POINTER_INT | POINTER_DOUBLE | POINTER_FLOAT | POINTER_CHAR
        | POINTER_BOOLEAN | POINTER_STRING | POINTER_VAR;

declaration: primary_variable ID SEMICOL | pointer ID SEMICOL
           | primary_variable assign_operator
           | primary_variable assign_arithmetic SEMICOL;


for_loop: FOR PAR_OPEN primary_variable assign_operator conditional_expression SEMICOL
            increment PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE
          | FOR PAR_OPEN primary_variable assign_operator conditional_expression SEMICOL assign_arithmetic
            PAR_CLOSE BRACES_OPEN statement BRACES_CLOSE
          | FOR PAR_OPEN assign_operator conditional_expression SEMICOL assign_arithmetic
            PAR_CLOSE BRACES_OPEN statement BRACES_CLOSE
          | FOR PAR_OPEN primary_variable assign_operator conditional_expression SEMICOL
             increment PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE;

while_loop: WHILE PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE;

if_statement: IF PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE;

else_if_statement: ELSE IF PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE;

if_else_structure: IF PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE
                    ELSE BRACES_OPEN statement* BRACES_CLOSE
                    | IF PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE
                      else_if_statement* ELSE BRACES_OPEN statement* BRACES_CLOSE
                    | IF PAR_OPEN conditional_expression PAR_CLOSE BRACES_OPEN statement* BRACES_CLOSE
                        else_if_statement* ;

decision: if_statement | if_else_structure;

print: PRINT PAR_OPEN integer_literal_or_id PAR_CLOSE SEMICOL
       | PRINT PAR_OPEN string PAR_CLOSE SEMICOL;

array: primary_variable ID BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE SEMICOL
       | primary_variable ID BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE BRACKET_OPEN INTEGER_LITERAL BRACKET_CLOSE SEMICOL;

primary_variable : INT | DOUBLE | FLOAT |CHAR | BOOLEAN | VAR | STRING;

literal_values: STRING_LITERAL | INTEGER_LITERAL | BOOLEAN_LITERAL | CHAR_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL;

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
FUNC: 'func';
PROC: 'proc';
VOID: 'void';
RETURN: 'return';

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
FLOAT_LITERAL: [0-9]+ '.' [0-9]+ 'f';
DOUBLE_LITERAL: [0-9]+ '.' [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* '\r'? '\n' -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
