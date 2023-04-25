
grammar test_ruby;
prog : expression_list EOF;

expression_list : expression terminator
                | expression_list expression terminator
                | terminator
                ;
expression  : 
            | rvalue
            | array_expression
            | hash_expression
            | function_inline_call
            | assignment
            | control_structure
            | class_definition
            | module_definition
            | function_definition
            ;

control_structure   : if_statement           
                    | unless_statement          
                    | range_expression
                    | while_statement
                    | until_statement
                    | iterators
                    | for_statment
                    | raise_statement
                    | begin_rescue_statement
                    | return_statement
                    | begin_statement
                    | end_statment;


array_expression : LEFT_SBRACKET  rvalue (COMMA rvalue)* RIGHT_SBRACKET;

hash_expression :  LEFT_BBRACKET expression op=HASH_OP expression REFT_BBRACKET;


class_definition : 'class' id_  ( '<'superclass_id = id_ )? CRLF statement_body? CRLF END;

module_definition: 'module' id_ CRLF statement_body? CRLF END;

function_definition : DEF name=function_name  function_call_param_list? CRLF statement_body   END;


statement_body : statement_expression_list;

statement_expression_list : expression terminator
                          | RETRY terminator
                          | break_expression terminator
                          | statement_expression_list expression terminator
                          | statement_expression_list RETRY terminator
                          | statement_expression_list break_expression terminator
                          ;

range_expression : expression ELLIPSIS expression;

function_inline_call: function_call;

// [expr `.'] identifier [`(' expr...[`*' [expr]],[`&' ] expr`)']
// [expr `::'] identifier [`(' expr...[`*' [expr]],[`&' expr] `)']
function_call : (expression DOT)? name=function_name (LEFT_RBRACKET params=function_call_param_list RIGHT_RBRACKET)?
            //   | name=function_name params=function_call_param_list
            //   | name=function_name LEFT_RBRACKET RIGHT_RBRACKET
            //   | id_ '.' name=function_name LEFT_RBRACKET (params=function_call_param_list) ? RIGHT_RBRACKET
            //   | id_ '.' name=function_name (params=function_call_param_list)?
              ;

function_name : id_function
              | id_
              ;
function_call_param_list : function_call_params;

function_call_params : function_param
                     | function_call_params COMMA function_param
                     ;
function_param : ( function_unnamed_param | function_named_param );

function_unnamed_param : ( int_result | float_result | string_result | dynamic_result );

function_named_param : id_ op=ASSIGN ( int_result | float_result | string_result | dynamic_result );

string_literal: STRING_LITERAL_START string_literal_middle* STRING_LITERAL_END # StringLiteral;

string_literal_middle: STRING_LITERAL_CONTENT # StringLiteralContent
                    | string_escape_sequence # StringEscapeSequence
                    | string_expression_substitution # StringExpressionSubstitution
                    ;

string_escape_sequence: ESCAPE_SEQUENCE;

string_expression_substitution: EXPRESSION_SUBSTITUTION_START expression EXPRESSION_SUBSTITUTION_END;

// expression: rvalue # Rval
//          | lvalue # Lval
//          ;

assignment  :   dynamic_assignment
            |   int_assignment
            |   float_assignment
            |   string_assignment
            |   initial_array_assignment
;
dynamic_assignment : var_id=lvalue op=ASSIGN dynamic_result
                   | var_id=lvalue op=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN ) dynamic_result
                   ;

int_assignment : var_id=lvalue op=ASSIGN int_result
               | var_id=lvalue op=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN ) int_result
               ;

float_assignment : var_id=lvalue op=ASSIGN float_result
                 | var_id=lvalue op=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN ) float_result
                 ;

string_assignment : var_id=lvalue op=ASSIGN string_result
                  | var_id=lvalue op=PLUS_ASSIGN string_result;

dynamic_ : id_
        | function_call_assignment
        | array_selector
        | id_global
        | id_constence
        | id_instance
        ;
array_assignment : arr_def=array_selector op=ASSIGN arr_val=all_result;

array_definition : LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET;

array_definition_elements : ( int_result | dynamic_result )
                          | array_definition_elements COMMA ( int_result | dynamic_result )
                          | array_definition_elements ELLIPSIS (int_result | dynamic_result)
                          ;

array_selector : id_ LEFT_SBRACKET ( int_result | dynamic_result ) RIGHT_SBRACKET
               | id_global LEFT_SBRACKET ( int_result | dynamic_result ) RIGHT_SBRACKET
               ;

function_call_assignment:  function_call;
all_result  : int_result | float_result | string_result | dynamic_result;
int_result : int_result op=( MUL | DIV | MOD ) int_result
           | int_result op=( PLUS | MINUS ) int_result
           | LEFT_RBRACKET int_result RIGHT_RBRACKET
           | int_t
           ;

float_result : float_result op=( MUL | DIV | MOD ) float_result
             | int_result op=( MUL | DIV | MOD ) float_result
             | float_result op=( MUL | DIV | MOD ) int_result
             | float_result op=( PLUS | MINUS ) float_result
             | int_result op=( PLUS | MINUS )  float_result
             | float_result op=( PLUS | MINUS )  int_result
             | LEFT_RBRACKET float_result RIGHT_RBRACKET
             | float_t
             ;

string_result : string_result op=MUL int_result
              | int_result op=MUL string_result
              | string_result op=PLUS string_result
              | string_literal

              ;

dynamic_result : dynamic_result op=( MUL | DIV | MOD ) int_result
               | int_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=( MUL | DIV | MOD ) float_result
               | float_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=MUL string_result
               | string_result op=MUL dynamic_result
               | dynamic_result op=( PLUS | MINUS ) int_result
               | int_result op=( PLUS | MINUS ) dynamic_result
               | dynamic_result op=( PLUS | MINUS )  float_result
               | float_result op=( PLUS | MINUS )  dynamic_result
               | dynamic_result op=( PLUS | MINUS ) dynamic_result
               | LEFT_RBRACKET dynamic_result RIGHT_RBRACKET
               | dynamic_
               ;


rvalue: lvalue 
      | string_literal
      | assignment  
      |
      |
      |
      | rvalue op=EXP rvalue                                
      | op=( NOT | BIT_NOT )rvalue                          
      | rvalue op=( MUL | DIV | MOD ) rvalue                
      | rvalue op=( PLUS | MINUS ) rvalue                   
      | rvalue op=( BIT_SHL | BIT_SHR ) rvalue              
      | rvalue op=BIT_AND rvalue                            
      | rvalue op=( BIT_OR | BIT_XOR )rvalue                
      | rvalue op=( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) rvalue    
      | rvalue op=( EQUAL | NOT_EQUAL ) rvalue              
      | rvalue op=( OR | AND ) rvalue                       
      | LEFT_RBRACKET rvalue RIGHT_RBRACKET                 

      ;

lvalue  : id_
        | id_global
        | id_instance
      ;

cond_expression : comparison_list;
comparison_list : left=comparison op=BIT_AND right=comparison_list
                | left=comparison op=AND right=comparison_list
                | left=comparison op=BIT_OR right=comparison_list
                | left=comparison op=OR right=comparison_list
                | LEFT_RBRACKET comparison_list RIGHT_RBRACKET
                | comparison
                ;

comparison : left=comp_var op=( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) right=comp_var
           | left=comp_var op=( EQUAL | NOT_EQUAL ) right=comp_var
           ;

comp_var : all_result
         | array_selector
         | id_
         | id_constence
         ;
if_statement: IF cond_expression (THEN)? CRLF statement_body  END
            | IF cond_expression (THEN)? crlf statement_body else_token crlf statement_body END
            | IF cond_expression (THEN)? crlf statement_body elsif_statement END
            ;
elsif_statement : if_elsif_statement;

if_elsif_statement : ELSIF cond_expression (THEN)? crlf statement_body
                   | ELSIF cond_expression (THEN)? crlf statement_body else_token crlf statement_body
                   | ELSIF cond_expression (THEN)? crlf statement_body if_elsif_statement
                   ;

unless_statement    : UNLESS cond_expression (THEN)? CRLF statement_body END
                    | UNLESS cond_expression (THEN)? CRLF statement_body else_token crlf statement_body END 
                    ;

while_statement :  WHILE cond_expression CRLF statement_body CRLF END;

until_statement : UNTIL cond_expression DO? CRLF statement_body CRLF END;

for_statment : FOR lvalue (COMMA lvalue)* IN (range_expression  | array_definition | lvalue) THEN? CRLF statement_body CRLF END;

raise_statement : RAISE expression ;

begin_rescue_statement: BEGIN CRLF expression  (RESCUE expression crlf)* (ENSURE expression )? crlf END;


retry_statment: RETRY;

return_statement : RETURN all_result ;

begin_statement: BEGIN LEFT_BBRACKET crlf statement_body crlf REFT_BBRACKET;

end_statment:END LEFT_BBRACKET crlf statement_body crlf REFT_BBRACKET;

iterators : function_call ;

initial_array_assignment : var_id=lvalue op=ASSIGN LEFT_SBRACKET RIGHT_SBRACKET;

literal :   literal_t;


break_expression : BREAK;

literal_t : LITERAL;

float_t : FLOAT;

int_t : INT;

bool_t : TRUE
       | FALSE
       ;

nil_t : NIL;

id_ : ID;

id_global : ID_GLOBAL;

id_instance : ID_INSTANCE;

id_constence : CONST_ID;

id_function : ID_FUNCTION;

terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;

else_token : ELSE;

crlf : CRLF;


fragment ESCAPED_QUOTE : '\\"';
STRING_LITERAL_START : '"' | '\'' ;
STRING_LITERAL_END : '"' |'\'';
STRING_LITERAL_CONTENT: ~["\\\r\n]+;
ESCAPE_SEQUENCE: '\\' .;
LITERAL : '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"'
        | '\'' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '\'';
EXPRESSION_SUBSTITUTION_START: '#'LEFT_BBRACKET ;
EXPRESSION_SUBSTITUTION_END: REFT_BBRACKET;


COMMA : ',';
ELLIPSIS: '..';
SEMICOLON : ';';
CRLF : '\r'? '\n';

REQUIRE : 'require';
BEGIN: 'begin';
END : 'end';
DEF : 'def';
RETURN : 'return';
PIR : 'pir';

IF: 'if';
ELSE : 'else';
ELSIF : 'elsif';
UNLESS : 'unless';
WHILE : 'while';
RETRY : 'retry';
BREAK : 'break';
FOR : 'for';
THEN : 'then';
IN : 'in';
UNTIL : 'until';
DO : 'do';
RAISE:'raise';
TRUE : 'true';
FALSE : 'false';
RESCUE :'rescue';
ENSURE: 'ensure';

PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
EXP : '**';

EQUAL : '==';
NOT_EQUAL : '!=';
GREATER : '>';
LESS : '<';
LESS_EQUAL : '<=';
GREATER_EQUAL : '>=';

ASSIGN : '=';
PLUS_ASSIGN : '+=';
MINUS_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
EXP_ASSIGN : '**=';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
BIT_NOT : '~';
BIT_SHL : '<<';
BIT_SHR : '>>';

AND : 'and' | '&&';
OR : 'or' | '||';
NOT : 'not' | '!';

HASH_OP : '=>';

LEFT_RBRACKET : '(';
RIGHT_RBRACKET : ')';
LEFT_SBRACKET : '[';
RIGHT_SBRACKET : ']';
LEFT_BBRACKET : '{';
REFT_BBRACKET : '}';
NIL : 'nil';

SL_COMMENT : ('#' ~('\r' | '\n')* '\r'? '\n') -> skip;
ML_COMMENT : ('=begin' .*? '=end' '\r'? '\n') -> skip;
WS : (' '|'\t')+ -> skip;

INT : [0-9]+;
FLOAT : [0-9]*'.'[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
CONST_ID : [A-Z]*ID;
ID_GLOBAL : '$'ID;
ID_INSTANCE : '@'ID;
ID_FUNCTION : ID[?];



DOT : '.';