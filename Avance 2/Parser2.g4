parser grammar Parser2;

options {
    tokenVocab = Scanner;
}

program : statement*                                                                #progAST
;
statement : LET letStatement                                                        #stLETAST
    | RETURN returnStatement                                                        #stRETURNAST
    | expressionStatement                                                           #stExprAST

;

letStatement : ID ASIGNACION expression ( PyCOMA | )                                #lsAsignAST
;
returnStatement : expression ( PyCOMA | )                                           #rsExprAST
;
expressionStatement : expression ( PyCOMA | )                                       #esExprAST
;
expression : additionExpression comparison                                          #exprAddAST
;
comparison : ((MENOR|MAYOR|MENIGUAL|MAYIGUAL|IGUAL) additionExpression)*            #compAST
;
additionExpression : multiplicationExpression additionFactor                        #addExprAST
;
additionFactor : ((SUM|RES) multiplicationExpression)*                              #addFactorAST
;
multiplicationExpression : elementExpression multiplicationFactor                   #multExprAST
;
multiplicationFactor : ((MUL|DIV) elementExpression)*                               #multFactorAST
;
elementExpression :  primitiveExpression (elementAccess | callExpression | )        #elemExprAST
;
elementAccess : PARCUADIZQ expression PARCUADDER                                    #elemAccessAST
;
callExpression	: PARIZQ expressionList PARDER                                      #callExprAST
;
primitiveExpression	:
      INT                                                                           #pExprINTAST
    | STRING                                                                        #pExprSTRINGAST
    | ID                                                                            #pExprIDAST
    | TRUE                                                                          #pExprTRUEAST
    | FALSE                                                                         #pExprFALSEAST
    | PARIZQ expression PARDER                                                      #pExprGroupAST
    | arrayLiteral                                                                  #pExprArrayLitAST
    | arrayFunctions PARIZQ expressionList PARDER                                   #pExprArrayFuncAST
    | functionLiteral                                                               #pExprFuncLitAST
    | hashLiteral                                                                   #pExprHashLitAST
    | printExpression                                                               #pExprPrintExprAST
    | ifExpression                                                                  #pExprIfExprAST
;
arrayFunctions	:
    LEN                                                                             #afLENAST
    | FIRST                                                                         #afFIRSTAST
    | LAST                                                                          #afLASTAST
    | REST                                                                          #afRESTAST
    | PUSH                                                                          #afPUSHAST
;
arrayLiteral : PARCUADIZQ expressionList PARCUADDER                                 #arrayLitAST
;
functionLiteral	: FN PARIZQ functionParameters PARDER blockStatement                #funcLitAST
;
functionParameters	: ID moreIdentifiers                                            #funcParamAST
;
moreIdentifiers	: (COMA ID)*                                                        #moreIdentsAST
;
hashLiteral		: CORCHETEIZQ hashContent moreHashContent CORCHETEDER               #hashLitAST
;
hashContent	: expression DOSPTOS expression                                         #hashContentAST
;
moreHashContent	: (COMA hashContent)*                                               #moreHashContentAST
;
expressionList :
    expression moreExpressions                                                      #exprListMoreExprAST
    |                                                                               #exprListEmptyAST
;
moreExpressions : (COMA expression)*                                                #moreExprAST
;
printExpression : PUTS PARIZQ expression PARDER                                     #printExprAST
;
ifExpression : IF expression blockStatement (ELSE blockStatement | )                #ifExprAST
;
blockStatement : CORCHETEIZQ statement* CORCHETEDER                                 #blockStatementAST
;
