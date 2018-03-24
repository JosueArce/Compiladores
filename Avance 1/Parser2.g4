parser grammar Parser2;

options {
    tokenVocab = Scanner;
}

program : statement*;
statement : LET letStatement | RETURN returnStatement | expressionStatement;
letStatement : ID ASIGNACION expression ( PyCOMA | ) ;
returnStatement : expression ( PyCOMA | );
expressionStatement : expression ( PyCOMA | );
expression : additionExpression comparison;
comparison : ((MENOR|MAYOR|MENIGUAL|MAYIGUAL|IGUAL) additionExpression)*;
additionExpression : multiplicationExpression additionFactor;
additionFactor : ((SUM|RES) multiplicationExpression)*;
multiplicationExpression : elementExpression multiplicationFactor;
multiplicationFactor : ((MUL|DIV) elementExpression)*;
elementExpression :  primitiveExpression (elementAccess | callExpression | );
elementAccess : PARCUADIZQ expression PARCUADDER;
callExpression	: PARIZQ expressionList PARDER;
primitiveExpression	: INT | STRING | ID | TRUE | FALSE | PARIZQ expression PARDER | arrayLiteral | arrayFunctions PARIZQ expressionList PARDER | functionLiteral | hashLiteral | printExpression | ifExpression;
arrayFunctions	: LEN | FIRST | LAST | REST | PUSH;
arrayLiteral : PARCUADIZQ expressionList PARCUADDER;
functionLiteral	: FN PARIZQ functionParameters PARDER blockStatement;
functionParameters	: ID moreIdentifiers;
moreIdentifiers	: (COMA ID)*;
hashLiteral		: CORCHETEIZQ hashContent moreHashContent CORCHETEDER;
hashContent	: expression DOSPTOS expression;
moreHashContent	: (COMA hashContent)*;
expressionList : expression moreExpressions |;
moreExpressions : (COMA expression)*;
printExpression : PUTS PARIZQ expression PARDER;
ifExpression : IF expression blockStatement (ELSE blockStatement | );
blockStatement : CORCHETEIZQ statement* CORCHETEDER;
