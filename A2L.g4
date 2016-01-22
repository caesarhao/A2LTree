/**
 * Define a grammar called A2L
 */
grammar A2L;

@members {
    public static void main(String[] args) throws Exception {
        A2LLexer lex = new A2LLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        A2LParser parser = new A2LParser(tokens);
 
        try {
            parser.a2l();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
a2l
:
	version // version part
	project // project part

;

version
:
	'ASAP2_VERSION' INT INT
;

project // one project presents one or more modules, one module is one ECU.

:
	'/begin PROJECT' ID STRING 
		header 
		module+ 
	'/end PROJECT'
;

header
:
	'/begin HEADER' ID? STRING 
		'VERSION' STRING 
		'PROJECT_NO' ID 
	'/end HEADER'
;

module // one module is one ECU

:
	'/begin MODULE' ID? STRING
		(a2ml)? // a2ml part describes the communication protocols, it could be included by command include.
		mod_par 
	'/end MODULE'
;

a2ml
:
	'/begin A2ML' 
		CHAR* 
	'/end A2ML'
;

mod_par // ECU parameter

:
	'/begin MOD_PAR' STRING 
		'VERSION' STRING 
		'ADDR_EPK' HEX 
		'EPK' STRING
		'CUSTOMER_NO' STRING 
		'USER' STRING 
		'PHONE_NO' STRING 
		'ECU' STRING 
		'CPU_TYPE' STRING
		(memory_segment)*
		(calibration_method)* 
	'/end MOD_PAR'
;

memory_segment
:
	'/begin MEMORY_SEGMENT' ID ID STRING ID ID ID HEX HEX INT INT INT INT INT
		(if_data)* 
	'/end MEMORY_SEGMENT'
;

if_data
:
	'/begin IF_DATA' ID HEX? 
		CHAR* 
	'/end IF_DATA'
;

calibration_method
:
	'/begin CALIBRATION_METHOD'
		STRING //name
		INT // version
		CHAR* 
	'/end CALIBRATION_METHOD'
;

axis_pts
:
	'/begin AXIS_PTS' ID // name
		STRING // description
		HEX // address
	'/end AXIS_PTS'
;

include
:
	'/include' STRING // include an external file, normally an aml file.

;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
ID
:
	(
		'a' .. 'z'
		| 'A' .. 'Z'
		| '_'
	)
	(
		'a' .. 'z'
		| 'A' .. 'Z'
		| '0' .. '9'
		| '_'
	)*
;

INT
:
	'0' .. '9'+
;

HEX
:
	'0'
	(
		'x'
		| 'X'
	) HEX_DIGIT+
;

FLOAT
:
	(
		'0' .. '9'
	)+ '.'
	(
		'0' .. '9'
	)* EXPONENT?
	| '.'
	(
		'0' .. '9'
	)+ EXPONENT?
	|
	(
		'0' .. '9'
	)+ EXPONENT
;

COMMENT
:
	(
		'//' ~( '\n' | '\r' )* '\r'? '\n'
		| '/*'
		(
			.
		)*? '*/'
	) -> skip
;

WS
:
	(
		' '
		| '\t'
		| '\r'
		| '\n'
	) -> skip
;

STRING
:
	'"'
	(
		ESC_SEQ
		| ~( '\\' | '"' )
	)* '"'
;

CHAR
:
	'\''
	(
		ESC_SEQ
		| ~( '\'' | '\\' )
	) '\''
;

fragment
EXPONENT
:
	(
		'e'
		| 'E'
	)
	(
		'+'
		| '-'
	)?
	(
		'0' .. '9'
	)+
;

fragment
HEX_DIGIT
:
	(
		'0' .. '9'
		| 'a' .. 'f'
		| 'A' .. 'F'
	)
;

fragment
ESC_SEQ
:
	'\\'
	(
		'b'
		| 't'
		| 'n'
		| 'f'
		| 'r'
		| '\"'
		| '\''
		| '\\'
	)
	| UNICODE_ESC
	| OCTAL_ESC
;

fragment
OCTAL_ESC
:
	'\\'
	(
		'0' .. '3'
	)
	(
		'0' .. '7'
	)
	(
		'0' .. '7'
	)
	| '\\'
	(
		'0' .. '7'
	)
	(
		'0' .. '7'
	)
	| '\\'
	(
		'0' .. '7'
	)
;

fragment
UNICODE_ESC
:
	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
;

