parser grammar Parser2;

options {
    tokenVocab = Scanner;
}

program : statement*;
statement : LET letStatement | RETURN returnStatement | expressionStatement;
letStatement : ID ASIGNACION expression ( PyCOMA | VACIO) ;
returnStatement : expression ( PyCOMA | VACIO);
expressionStatement : expression ( PyCOMA | VACIO);
expression : additionExpression comparison;
comparison : ((MENOR|MAYOR|MENIGUAL|MAYIGUAL|IGUAL) additionExpression)*;
additionExpression : multiplicationExpression additionFactor;
additionFactor : ((SUM|RES) multiplicationExpression)*;
multiplicationExpression : elementExpression multiplicationFactor;
multiplicationFactor : ((MUL|DIV) elementExpression)*;
elementExpression :  elementAccess; //primitiveExpression
elementAccess : (PARCUADIZQ expression PARCUADDER);
//primitiveExpression	: INT | STRING | ID | TRUE | FALSE | PARIZQ expression PARDER | arrayLiteral | arrayFunctions PARIZQ expressionList PARDER | functionLiteral | hashLiteral | functionCallExpression | printExpression | ifExpression;
arrayFunctions	: LEN | FIRST | LAST | REST | PUSH;
arrayLiteral        	: PARCUADIZQ expressionList PARCUADDER;
functionLiteral	: FN PARIZQ functionParameters PARDER blockStatement;
functionParameters	: ID moreIdentifiers;
moreIdentifiers	: (COMA ID)*;
hashLiteral		: CORCHETEIZQ hashContent moreHashContent CORCHETEDER;
hashContent	: expression DOSPTOS expression;
moreHashContent	: (COMA hashContent)*;
functionCallExpression   : expression PARIZQ expressionList PARDER;
expressionList       	: expression moreExpressions | VACIO;
moreExpressions    	: (COMA expression)*;
printExpression      	: PUTS ( expression );
ifExpression	: IF expression blockStatement (ELSE blockStatement | VACIO);
blockStatement	: CORCHETEIZQ statement* CORCHETEDER;
