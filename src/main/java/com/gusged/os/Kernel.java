package com.gusged.os;

import java.util.Set;
import java.util.Queue;
import java.util.HashSet;
import java.util.PriorityQueue;

import com.gusged.os.machine.RealMachine;

public class Kernel {
    private final RealMachine realMachine;

    private final Set<Process> processes;
    private final Queue<Process> readyProcesses;
    private final Queue<Process> blockedProcesses;

    public Kernel(RealMachine realMachine) {
        this.realMachine = realMachine;
        this.processes = new HashSet<>();
        this.readyProcesses = new PriorityQueue<>();
        this.blockedProcesses = new PriorityQueue<>();
    }
}