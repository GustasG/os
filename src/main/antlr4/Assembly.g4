grammar Assembly;

program:
    block;

block
    : (line)*;

line
    : label? stat? comment? EOL;

label
    : NAME ':';

stat
    : arithmetic
    | stack
    | logic
    | control;

comment:
    COMMENT;

arithmetic
    : add
    | sub
    | mul
    | div;

stack
    : push
    | pop;

logic
    : cmp;

control
    : jmp
    | je
    | jb
    | ja;

add
    : ADD;

sub
    : SUB;

mul
    : MUL;

div
    : DIV;

push
    : PUSH INT;

pop
    : POP;

cmp
    : CMP;

jmp
    : JMP NAME;

je
    : JE NAME;

jb
    : JB NAME;

ja
    : JA NAME;

ADD: 'ADD' | 'add';
SUB: 'SUB' | 'sub';
MUL: 'MUL' | 'mul';
DIV: 'DIV' | 'div';

PUSH: 'PUSH' | 'push';
POP: 'POP' | 'pop';

CMP: 'CMP' | 'cmp';

JMP: 'JMP' | 'jmp';
JE: 'JE' | 'je';
JB: 'JB' | 'jb';
JA: 'JA' | 'ja';


INT: [1-9][0-9]*;
NAME: [a-zA-Z0-9_.]+;
SPACE: [ \t\r\n] -> skip;
COMMENT: ';' ~ [\r\n]* -> skip;
EOL: [\r\n]+;