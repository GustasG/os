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
    : datadefname DW number;

datadefname
    : name;

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
    : PUSH (number | datasegname);

pop
    : POP (datasegname)?;

cmp
    : CMP;

jmp
    : JMP jumpdest;

je
    : JE jumpdest;

jne
    : JNE jumpdest;

jb
    : JB jumpdest;

ja
    : JA jumpdest;

jumpdest
    : NAME;

mov
    : MOV datasegname ',' (datasegname | number);

supervisor
    : halt;

halt
    : HALT;

datasegname
    : name;

name
    : NAME;

literal
    : number;

number
    : decimal
    | hexadecimal;

decimal
    : INT;

hexadecimal
    : HEX;

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

INT: ('-')? [1-9][0-9]*;
HEX: '0x' ([0-9a-fA-F])+;
NAME: [a-zA-Z0-9_.]+;
SPACE: [ \t\r\n] -> skip;
COMMENT: ';' ~ [\r\n]* -> skip;
EOL: [\r\n]+;