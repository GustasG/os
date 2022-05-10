package com.gusged.os.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.ui.Window;
import com.gusged.os.resource.*;
import com.gusged.os.compiler.Program;
import com.gusged.os.machine.cpu.ProgramInterrupt;
import com.gusged.os.machine.cpu.SupervisorInterrupt;

public class JobGovernor extends Process {
    private static final Logger logger = LoggerFactory.getLogger(JobGovernor.class);

    private VirtualMachineProcess virtualMachineProcess;
    private final Program program;
    private int ptr;
    private int step;

    public JobGovernor(Process parent, Program program) {
        super(parent, 30);
        this.program = program;
        step = 0;
    }

    @Override
    public void execute() {
        logger.trace("Step {}", step);

        switch (step) {
            case 0 -> {
                requestResource(MemoryAllocatorResource.class);
                step += 1;
            }
            case 1 -> {
                var mr = findAcquiredResource(MemoryAllocatorResource.class);
                ptr = mr.allocateMemory();
                step += 1;
            }
            case 2 -> {
                freeResource(MemoryAllocatorResource.class);
                acquiredResources.clear();
                step += 1;
            }
            case 3 -> {
                virtualMachineProcess = new VirtualMachineProcess(this, program, ptr);
                kernel.createProcess(virtualMachineProcess);
                step += 1;
            }
            case 4 -> {
                kernel.activateProcess(virtualMachineProcess);
                step += 1;
            }
            case 5 -> {
                requestResource(FromInterrupt.class);
                step += 1;
            }
            case 6 -> {
                kernel.stopProcess(virtualMachineProcess);
                acquiredResources.clear();
                handleInterrupt();
            }
            case 7 -> {
                requestResource(MemoryAllocatorResource.class);
                step += 1;
            }
            case 8 -> {
                var mr = findAcquiredResource(MemoryAllocatorResource.class);
                mr.freeMemory(ptr);
                freeResource(MemoryAllocatorResource.class);
                step += 1;
            }
            case 9 -> {
                virtualMachineProcess.destroy();
                children.remove(virtualMachineProcess);

                kernel.createResource(new TaskProgram(this));
                requestResource(EmptyResource.class);
            }
            default -> logger.error("Invalid step {}", step);
        }
    }

    private void handleInterrupt() {
        var realMachine = kernel.getRealMachine();
        var processor = realMachine.getProcessor();

        if (processor.getSi() != SupervisorInterrupt.NONE) {
            switch (processor.getSi()) {
                case PRINTN -> {
                    var window = Window.instance();
                    window.print(Integer.toString(realMachine.peekFromStack()));
                    step = 4;
                }
                case HALT -> step = 7;
            }

            processor.setSi(SupervisorInterrupt.NONE);
        } else if (processor.getPi() != ProgramInterrupt.NONE) {
            step = 7;
            processor.setPi(ProgramInterrupt.NONE);
        }

        if (processor.getTi() == 0) {
            processor.setTi(100);
            virtualMachineProcess.setPriority(calcualtePriority(virtualMachineProcess.getPriority(), 15, 5));
            step = 4;
        }
    }

    private static int calcualtePriority(int priority, int max, int min) {
        priority -= 1;

        if (priority < min) {
            return max;
        }

        return priority;
    }
}