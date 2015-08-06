grammar Ecl;		

options {
  language = Java;
}

program: record_defs (record_defs)*;
value : UTOKEN | TOKEN | INT | STRING;

value_list: value ( ',' value )*;

token_list: TOKEN ( ',' TOKEN )*;

assign: value '=' value_list;

assign_list: assign ( ',' assign)*;

eclfield_decl: (eclfield_type eclfield_name ('{' opts '}')? | nested_dataset_decl | nested_inline_dataset_decl | eclfield_recref);
eclfield_type: ('SET OF'|'set of')? TOKEN;
				
eclfield_name:(UTOKEN|TOKEN);
eclfield_recref:'(' TOKEN ')';

record_def_inline: '{' eclfield_decl ((',')* eclfield_decl)* '}' ';';
record_def: 'RECORD' (',' maxlength)? eclfield_decl  ';' (eclfield_decl ';')* 'END;';
defined_record_def : TOKEN ':=' record_def;
inline_dataset_record_def: '{' eclfield_decl (','eclfield_decl)* '}';
record_defs: (record_def_inline|record_def|defined_record_def) ;

nested_dataset_decl: 'DATASET' '(' TOKEN ')' (TOKEN|UTOKEN) ('{' opts '}')?; 
nested_inline_dataset_decl: 'DATASET' '(' inline_dataset_record_def ')' (TOKEN|UTOKEN) ('{' opts '}')?;

opts: opt (',' opt)*;
opt: (maxlength|maxcount|defaultval|xpath|xmldefaultval);

maxlength: ('maxlength'|'MAXLENGTH') '('  INT  ')';
maxcount:('maxcount'|'MAXCOUNT') '(' INT ')' ;
defaultval: ('default'|'DEFAULT') '('  STRING  ')';
xpath: ('xpath'|'XPATH') '('  STRING  ')';
xmldefaultval: ('xmldefault'|'XMLDEFAULT') '('  STRING  ')';


WS : [ \t\r\n]+ -> skip ;
INT     : [0-9]+ ;
fragment ESCAPED_QUOTE : '\\\'';
STRING :   '\'' ( ESCAPED_QUOTE | ~('\'') )* '\'';
TOKEN :  ~[_\r\n\t; (),:={}-]~[\r\n \t;(),:={}-]* ;
UTOKEN: [_][a-zA-Z0-9_-]+[a-zA-Z0-9_];
COMMENT : '//' ~('\r'|'\n')* -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip ;
ECL_NUMBERED_TYPE: TOKEN INT?;

