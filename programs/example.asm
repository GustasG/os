$DATA
value DW 60

$CODE
PUSH value
MOV value, 0xFF
JMP end

end:
HALT
