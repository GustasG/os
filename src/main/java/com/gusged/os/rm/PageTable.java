package com.gusged.os.rm;

import javax.inject.Inject;

import com.gusged.os.rm.memory.UserMemory;
import com.gusged.os.rm.memory.SupervisorMemory;

public class PageTable {
    private final SupervisorMemory supervisorMemory;
    private final UserMemory userMemory;

    @Inject
    public PageTable(SupervisorMemory supervisorMemory, UserMemory userMemory) {
        this.supervisorMemory = supervisorMemory;
        this.userMemory = userMemory;
    }
}