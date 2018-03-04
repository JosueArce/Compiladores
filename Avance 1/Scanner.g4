lexer grammar Scanner; //Gramatica para lexer


//simbolos
PyCOMA : ';';//expresion regular para reconocer un';'
COMA : ',';
ASIGNACION : '=';
MAYIGUAL : '>=';
MENIGUAL : '<=';
IGUAL : '==';
MAYOR : '>';
MENOR : '<';
DOSPTOS : ':';//dos puntoa
SUM : '+';//suma
RES : '*';//resta
MUL : '*';//multiplicacion
DIV : '/';//division
PARIZQ : '(';//parentesis izquierdo
PARDER : ')';//parentesis derecho
PARCUADIZQ : '[';//parentesis izquierdo
PARCUADDER : ']';//parentesis derecho
CORCHETEIZQ : '{';
CORCHETEDER : '}';
VACIO : 'ε';


//Palabras reservadas
IF : 'if';//expresion para reconocer un if
WHILE : 'while';
LET : 'let';
ELSE : 'else';
RETURN : 'return';
INT : 'Integer';
STRING : 'String';
TRUE : 'true';
FALSE : 'false';
FN : 'fn';
PUTS : 'puts';
LEN : 'len';
FIRST : 'first';
LAST : 'last';
REST : 'rest';
PUSH : 'push';



ID : LETTER (LETTER|DIGIT)*;//expresion regular para reconocer identificadores

fragment LETTER : 'a'..'z'| 'A'..'Z';//macro para reconocer letras
fragment DIGIT : '0'..'9';//macro para reconocer letras

WS : [ \t\n\r]+ -> skip; //expresion regular para el espacio en blanco. El skip significa que ignora lo que reconoció. El + significa
                        //una o más veces