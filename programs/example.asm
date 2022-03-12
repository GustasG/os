$DATA
value DW 60

$CODE
PUSH value
MOV value, 0x100
JMP end

end:
HALT
