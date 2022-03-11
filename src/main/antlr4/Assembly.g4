grammar Assembly;

program
    : (dataseg)? (codeseg)? EOF;

dataseg
    : '$DATA' datablock;

datablock
    : (dataline)*;

codeseg
    : '$CODE' codeblock;

codeblock
    : (codeline)*;

dataline
    : datadef? comment? EOL;

datadef
    : name DW value;

codeline
    : label? asmdirective? comment? EOL;

label
    : name ':';

asmdirective
    : arithmetic
    | stack
    | directive
    | control
    | interrupt;

comment
    : COMMENT;

arithmetic
    : add
    | sub
    | mul
    | div
    | mod;

stack
    : push
    | pop;

directive
    : cmp
    | mov;

control
    : jmp
    | je
    | jne
    | jb
    | ja;

interrupt
    : supervisor;

add
    : ADD;

sub
    : SUB;

mul
    : MUL;

div
    : DIV;

mod
    : MOD;

push
    : PUSH (value | name);

pop
    : POP (name)?;

cmp
    : CMP;

jmp
    : JMP name;

je
    : JE name;

jne
    : JNE name;

jb
    : JB name;

ja
    : JA name;

mov
    : MOV name ',' (name | value);

supervisor
    : halt;

halt
    : HALT;

name
    : NAME;

value
    : INT;

ADD: 'ADD' | 'add';
SUB: 'SUB' | 'sub';
MUL: 'MUL' | 'mul';
DIV: 'DIV' | 'div';
MOD: 'MOD' | 'mod';

PUSH: 'PUSH' | 'push';
POP: 'POP' | 'pop';

CMP: 'CMP' | 'cmp';
MOV: 'MOV' | 'mov';

JMP: 'JMP' | 'jmp';
JE: 'JE' | 'je';
JNE: 'JNE' | 'jne';
JB: 'JB' | 'jb';
JA: 'JA' | 'ja';

HALT: 'HALT' | 'halt';

DW: 'DW' | 'dw';

INT: ('-')?[1-9][0-9]*;
NAME: [a-zA-Z0-9_.]+;
SPACE: [ \t\r\n] -> skip;
COMMENT: ';' ~ [\r\n]* -> skip;
EOL: [\r\n]+;