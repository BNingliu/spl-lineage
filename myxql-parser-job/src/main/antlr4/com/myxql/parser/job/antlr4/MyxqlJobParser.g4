parser grammar MyxqlJobParser;

options { tokenVocab=MyxqlJobLexer; }

root
    : jobCommonds? EOF
    ;

jobCommonds
    : (jobCommond SEMI | emptyCommond)*
    (jobCommond (SEMI)? | emptyCommond)
    ;

jobCommond
    :  setCommond | unsetCommond | useCommond | sqlCommond | execCommond
    ;

execCommond
    : resourceNameExpr classNameExpr paramsExpr?
    ;

resourceNameExpr
    : ID (DOT_ID)*
    | filePath
    ;

classNameExpr
    : ID (DOT_ID)*
    ;

paramsExpr
    : paramExpr (paramExpr)*
    ;

paramExpr
    : ID (DOT_ID)*
    | filePath
    | ID DOT_ID* ('/' '/'? ID DOT_ID*)*
    | STRING_LITERAL
    ;

filePath
    : '/' ID DOT_ID* ('/' (ID DOT_ID* | '*'))* '/'?
    ;

setCommond
    : SET keyExpr EQUAL_SYMBOL value=valueExpr
    ;

unsetCommond
    : UNSET keyExpr
    ;

useCommond
    : USE ID
    ;

sqlCommond
    : CREATE (word)+
    | INSERT (word)+
    | SELECT (word)+
    | ALTER (word)+
    | DROP (word)+
    | SHOW (word)+
    | ANALYZE (word)+
    | EXPLAIN (word)+
    | DESC (word)+
    | REFRESH (word)+
    | COMMENT (word)+
    | CACHE (word)+
    | UNCACHE (word)+
    | LOAD (word)+
    | CLEAR (word)+
    | TRUNCATE (word)+
    | RESET (word)+
    ;

keyExpr
    : ID (DOT_ID)*
    ;

valueExpr
    : word (word)*
    ;

word
    : ID
    | DOT_ID | SET | UNSET
    | STAR | DIVIDE | MODULE | PLUS | MINUS
    | EQUAL_SYMBOL | GREATER_SYMBOL | LESS_SYMBOL | EXCLAMATION_SYMBOL
    | BIT_NOT_OP | BIT_OR_OP | BIT_AND_OP | BIT_XOR_OP
    | LR_BRACKET | RR_BRACKET | COMMA
    | STRING_LITERAL
    ;

emptyCommond
    : SEMI
    ;
