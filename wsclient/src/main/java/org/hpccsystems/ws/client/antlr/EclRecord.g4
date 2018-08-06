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
     | (inline_dataset_record_def eclfield_name)
     | eclfield_recref)
;

eclfield_type:
    ('SET OF'|'set of')? (UTOKEN|TOKEN)
;

eclfield_name:
    UTOKEN | TOKEN | 'MAXLENGTH' | 'maxlength'
;
eclfield_recref:
    OPAREN TOKEN CPAREN
;

record_def_inline:
    OCURLY (COMMA maxlength)? eclfield_decl ((COMMA)* eclfield_decl)* CCURLY SEMI
;

record_def:
    REC_SYM (COMMA maxlength)? comment? eclfield_decl SEMI comment? (eclfield_decl SEMI comment?)* END_SYM SEMI
;
defined_record_def :
    (UTOKEN|TOKEN) ASSING_SYM (record_def|record_def_inline)
;

exploded_dataset_record_def:
    REC_SYM (COMMA maxlength)? comment? eclfield_decl SEMI comment? (eclfield_decl SEMI comment?)* END_SYM
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


nested_dataset_decl: 'DATASET' '(' (UTOKEN|TOKEN) ')' (TOKEN|UTOKEN) ('{' opts '}')?; 

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
    | blob
;
maxlength:
    ('MAXLENGTH' OPAREN INT CPAREN | 'maxlength' OPAREN INT CPAREN | 'maxLength' OPAREN INT CPAREN)
;

blob: ('BLOB' | 'blob');

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

annotation_name : ATOKEN;
annotation_param : (TOKEN|UTOKEN);
annotation_arguments : annotation_param (COMMA annotation_param)*;
annotation : annotation_name ( OPAREN annotation_arguments CPAREN )?;

comment:
	( '//' annotation?  (COMMA annotation)* .*? ) |
	( '/*' annotation?  (COMMA annotation)* .*? (.*?'*/' | '*/'))
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

WS : [ \t\r\n] -> skip;
INT     : [0-9]+ ;
fragment ESCAPED_QUOTE : '\\\'';
STRING :   '\'' ( ESCAPED_QUOTE | ~('\'') )* '\'';
ATOKEN: [@][a-zA-Z0-9_-]+[a-zA-Z0-9_];
TOKEN :  ~[_\r\n\t; (),:={}-]~[\r\n \t;(),:={}-]* ;
UTOKEN: [_]+[a-zA-Z0-9_-]+[a-zA-Z0-9_];
ECL_NUMBERED_TYPE: TOKEN INT?;

