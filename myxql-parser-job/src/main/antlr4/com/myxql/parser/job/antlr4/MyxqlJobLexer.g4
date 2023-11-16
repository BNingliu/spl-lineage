lexer grammar MyxqlJobLexer;

channels { DCSTREAMCOMMENT, ERRORCHANNEL }

// SKIP

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);
SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(DCSTREAMCOMMENT);
COMMENT_INPUT:                       '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:                        (
                                       ('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | '--' ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

SET:                                 'SET';
UNSET:                               'UNSET';
USE:                                 'USE';

STAR:                                '*';
DIVIDE:                              '/';
MODULE:                              '%';
PLUS:                                '+';
MINUS:                               '-';

// Operators. Comparation
EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL:                  '!';


// Operators. Bit
BIT_NOT_OP:                          '~';
BIT_OR_OP:                           '|';
BIT_AND_OP:                          '&';
BIT_XOR_OP:                          '^';

// Constructors symbols
DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
COMMA:                               ',';
SEMI:                                ';';
OPEN_BRACKET:                        '[';
CLOSE_BRACKET:                       ']';
UNDERLINE:                           '_';
QUESTION_MARK:                       '?';

// SQL keywords
SELECT:     'SELECT';
CREATE:     'CREATE';
INSERT:     'INSERT';
ALTER:      'ALTER';
DROP:       'DROP';
SHOW:       'SHOW';
ANALYZE:    'ANALYZE';
EXPLAIN:    'EXPLAIN';
DESC:       'DESC';
REFRESH:    'REFRESH';
COMMENT:    'COMMENT';
CACHE:      'CACHE';
UNCACHE:    'UNCACHE';
LOAD:       'LOAD';
CLEAR:      'CLEAR';
TRUNCATE:   'TRUNCATE';
RESET:      'RESET';


DOT_ID:                              '.' ID_LITERAL;

ID:                                  ID_LITERAL;
REVERSE_QUOTE_ID:                    '`' ~'`'+ '`';
STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING;

fragment ID_LITERAL:                 [A-Z_$0-9,:-]+;
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';

ERROR_RECONGNIGION:                  .    -> channel(ERRORCHANNEL);