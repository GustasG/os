package com.gusged.os;

import java.util.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.process.Process;
import com.gusged.os.machine.RealMachine;
import com.gusged.os.process.ProcessState;
import com.gusged.os.process.StartStop;
import com.gusged.os.resource.Resource;

@Singleton
public class Kernel {
    private static final Logger logger = LoggerFactory.getLogger(Kernel.class);

    private final RealMachine realMachine;
    private Process currentProcess;
    private final Map<Class<? extends Resource>, Resource> resources;
    private final Set<Process> processes;
    private final Queue<Process> readyProcesses;
    private final Queue<Process> blockedProcesses;
    private boolean running;

    @Inject
    public Kernel(RealMachine realMachine) {
        this.realMachine = realMachine;
        this.resources = new HashMap<>();
        this.processes = new HashSet<>();
        this.readyProcesses = new PriorityQueue<>();
        this.blockedProcesses = new PriorityQueue<>();
    }

    public void run() {
        logger.info("Starting OS");
        running = true;
        var init = new StartStop(this);
        createProcess(init);
        resourceDistributor();

        while (running) {
            if (currentProcess != null) {
                currentProcess.execute();
            }
        }

        destroyProcess(init);
    }

    public void shutdown() {
        logger.info("Shutting down os");
        running = false;
    }

    public void createResource(Resource resource) {
        resources.put(resource.getClass(), resource);
    }

    public void createProcess(Process process) {
        processes.add(process);
        readyProcesses.add(process);
        process.setState(ProcessState.READY);
    }

    public void destroyProcess(Process process) {
        processes.remove(process);
        blockedProcesses.remove(process);
        readyProcesses.remove(process);
    }

    public void requestResource(Class<? extends Resource> clazz, Process process) {
        var resource = resources.getOrDefault(clazz, null);

        if (resource != null) {
            resource.requestResource(process);
            process.setState(ProcessState.BLOCKED);
            readyProcesses.remove(process);
            blockedProcesses.add(process);
        } else {
            logger.warn("{} tried to acquire no existant resource - {}", process, clazz.toString());
        }

        resourceDistributor();
    }

    public void freeResource(Class<? extends Resource> clazz) {
        var resource = resources.get(clazz);
        resource.free();
        resourceDistributor();
    }

    private void resourceDistributor() {
        for (var resource : resources.values()) {
            var waitingProcesses = resource.getWaitingProcesses();

            for (var process : waitingProcesses) {
                if (resource.getAvailableCount() <= 0) {
                    break;
                }

                if (currentProcess == process) {
                    currentProcess = null;
                }

                process.getAcquiredResources()
                        .add(resource);

                process.setState(ProcessState.READY);
                resource.acquire();

                waitingProcesses.remove(process);
                blockedProcesses.remove(process);
                readyProcesses.add(process);
            }
        }

        planner();
    }

    private void planner() {
        if (currentProcess != null && currentProcess.getState() == ProcessState.BLOCKED) {
            blockedProcesses.add(currentProcess);
            currentProcess = null;
        }

        if (currentProcess != null) {
            currentProcess.setState(ProcessState.READY);
            readyProcesses.add(currentProcess);
            currentProcess = null;
        }

        currentProcess = readyProcesses.poll();

        if (currentProcess != null) {
            currentProcess.setState(ProcessState.RUNNING);
        }
    }
}