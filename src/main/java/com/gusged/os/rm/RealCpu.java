package com.gusged.os.rm;

import lombok.Data;

import com.gusged.os.rm.cpu.CpuMode;
import static com.gusged.os.Constants.*;

@Data
public class RealCpu {
    private CpuMode mode;
    private int pc;
    private int ptr;
    private int sp;
    private int ds, cs, ss;

    public RealCpu() {
        mode = CpuMode.SUPERVISOR;
        ds = DATA_SEGMENT_START;
        cs = CODE_SEGMENT_START;
        ss = STACK_SEGMENT_START;
    }
}