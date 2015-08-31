grammar EclRecord;

options
{
    language = Java;
}

program: record_defs (record_defs)*;

value : UTOKEN | TOKEN | INT | STRING;

value_list: value ( COMMA value )*;

token_list: TOKEN ( COMMA TOKEN )*;

assign: value EQ value_list;

assign_list: assign ( COMMA assign)*;

eclfield_decl:
     (eclfield_type eclfield_name (OCURLY opts CCURLY)?
     | nested_dataset_decl
     | nested_inline_dataset_decl
     | eclfield_recref)
;

eclfield_type:
    ('SET OF'|'set of')? TOKEN
;

eclfield_name:
    UTOKEN | TOKEN
;
eclfield_recref:
    OPAREN TOKEN CPAREN
;

record_def_inline:
    OCURLY eclfield_decl ((COMMA)* eclfield_decl)* CCURLY SEMI
;

record_def:
    REC_SYM (COMMA maxlength)? eclfield_decl SEMI (eclfield_decl SEMI)* END_SYM SEMI
;
defined_record_def :
    TOKEN ASSING_SYM (record_def|record_def_inline)
;

exploded_dataset_record_def:
    REC_SYM (COMMA maxlength)? eclfield_decl SEMI (eclfield_decl SEMI)* END_SYM
;

inline_dataset_record_def:
    OCURLY eclfield_decl (COMMA eclfield_decl)* CCURLY
;
record_defs:
//record_def_atom:
    record_def_inline
    | record_def
    | defined_record_def
;

nested_dataset_decl: 'DATASET' '(' TOKEN ')' (TOKEN|UTOKEN) ('{' opts '}')?; 

nested_inline_dataset_decl:
     DATASET_SYM OPAREN (exploded_dataset_record_def|inline_dataset_record_def) CPAREN (TOKEN|UTOKEN) (OCURLY opts CCURLY)?
;

opts:
    opt (COMMA opt)*
;

opt:
    maxlength
    | maxcount
    | defaultval
    | xpath
    | xmldefaultval
;
maxlength:
    'MAXLENGTH' OPAREN INT CPAREN
;
maxcount:
    'MAXCOUNT' OPAREN INT CPAREN
;

defaultval:
    'DEFAULT' OPAREN STRING CPAREN
;

xpath:
    'XPATH' OPAREN STRING CPAREN
;

xmldefaultval:
    'XMLDEFAULT' OPAREN STRING CPAREN
;

OPAREN             : '(';
CPAREN             : ')';
OCURLY             : '{';
CCURLY             : '}';
COMMA              : ',';
SEMI               : ';';
EQ                 : '=';

ASSING_SYM             : ':=';
REC_SYM                : 'RECORD';
END_SYM                : 'END';
DATASET_SYM            : 'DATASET';

WS : [ \t\r\n]+ -> skip ;
INT     : [0-9]+ ;
fragment ESCAPED_QUOTE : '\\\'';
STRING :   '\'' ( ESCAPED_QUOTE | ~('\'') )* '\'';
TOKEN :  ~[_\r\n\t; (),:={}-]~[\r\n \t;(),:={}-]* ;
UTOKEN: [_][a-zA-Z0-9_-]+[a-zA-Z0-9_];
COMMENT : '//' ~('\r'|'\n')* -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip ;
ECL_NUMBERED_TYPE: TOKEN INT?;