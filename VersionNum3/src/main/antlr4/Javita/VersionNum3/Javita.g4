grammar Javita;

programa
    : declaraciones_de_librerias programa_principal
    ;

declaraciones_de_librerias
    : comentario* ( 'lib' tipo IDENT '(' parametros ')' ';' comentario* )*
    ;

parametros
    : parametro (',' parametro)*
    ;

parametro
    : tipo IDENT
    ;

programa_principal
    : 'programa' tipo IDENT '{' codigo_programa '}' comentario*
    ;

codigo_programa
    : (declaracion_variable | instruccion_asignacion | instruccion_if | instruccion_while | instruccion_return | llamada_funcion | comentario)*
    ;

declaracion_variable
    : tipo IDENT ';' comentario*
    ;

instruccion_asignacion
    : IDENT '=' expresion ';' comentario*
    ;

instruccion_if
    : 'if' '(' expresion_logica ')' comentario* '{' codigo_programa '}' ('else' '{' codigo_programa '}' comentario*)? comentario*
    ;

instruccion_while
    : 'while' '(' expresion_logica ')' comentario* '{' codigo_programa '}' comentario*
    ;

instruccion_return
    : 'return' expresion ';' comentario*
    ;

llamada_funcion
    : IDENT '(' lista_expr? ')' comentario*
    ;

expresion
    : literal
    | IDENT
    | llamada_funcion
    | expresion operador_aritmetico expresion
    | '(' expresion ')'
    ;

expresion_logica
    : expresion operador_logico expresion
    | '!' expresion_logica
    ;

lista_expr
    : expresion (',' expresion)*
    ;

literal
    : NUMERO
    | FLOAT
    | BOOL
    | CADENA
    ;

tipo
    : 'int'
    | 'float'
    | 'bool'
    | 'string'
    ;

operador_aritmetico
    : '+'
    | '-'
    | '*'
    | '/'
    ;

operador_logico
    : '=='
    | '!='
    | '>'
    | '>='
    | '<'
    | '<='
    ;

comentario
    : COMENTARIO_LINEA
    | COMENTARIO_BLOQUE
    ;

// Tokens

NUMERO
    : [0-9]+
    ;

FLOAT
    : [0-9]+ '.' [0-9]+
    ;

BOOL
    : 'true'
    | 'false'
    ;

CADENA
    : '"' .*? '"'
    ;

IDENT
    : (LETRA | '_') (LETRA | DIGITO | '_')*
    ;

fragment LETRA
    : [a-zA-Z]
    | [áéíóúÁÉÍÓÚñÑ]
    ;

fragment DIGITO
    : [0-9]
    ;

COMENTARIO_LINEA
    : '//' ~('\n' | '\r')* '\r'? '\n'
    ;

COMENTARIO_BLOQUE
    : '/*' .*? '*/'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;
