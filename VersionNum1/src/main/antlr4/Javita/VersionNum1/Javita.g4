grammar Javita;

programa
    : declaraciones_de_librerias programa_principal
    ;

declaraciones_de_librerias
    : ( 'lib' tipo IDENT '(' parametros ')' ';' )*
    ;

parametros
    : parametro (',' parametro)*
    ;

parametro
    : tipo IDENT
    ;

programa_principal
    : 'programa' tipo IDENT '{' codigo_programa '}'
    ;

codigo_programa
    : (declaracion_variable | instruccion_asignacion | instruccion_if | instruccion_while | instruccion_return | llamada_funcion | comentario)*
    ;

declaracion_variable
    : tipo IDENT ';'
    ;

instruccion_asignacion
    : IDENT '=' expresion ';'
    ;

instruccion_if
    : 'if' '(' expresion_logica ')' '{' codigo_programa '}' ('else' '{' codigo_programa '}')?
    ;

instruccion_while
    : 'while' '(' expresion_logica ')' '{' codigo_programa '}'
    ;

instruccion_return
    : 'return' expresion ';'
    ;

llamada_funcion
    : IDENT '(' lista_expr? ')'
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
    : COMENTARIO
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
    ;

fragment DIGITO
    : [0-9]
    ;

COMENTARIO
    : '//' ~('\n' | '\r')* '\r'? '\n'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;
