$DATA
target DW 7
current DW 1
result DW 1

$CODE
factorial:
    PUSH target
    PUSH current
    CMP
    je end

    PUSH current
    INC
    POP current

    PUSH result
    PUSH current
    MUL
    POP result

    JMP factorial

end:
    HALT
