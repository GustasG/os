package com.gusged.os;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Getter;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gusged.os.process.Process;
import com.gusged.os.machine.RealMachine;
import com.gusged.os.process.ProcessState;
import com.gusged.os.process.StartStop;
import com.gusged.os.resource.Resource;

@Getter
@Setter
@Singleton
public class Kernel {
    private static final Logger logger = LoggerFactory.getLogger(Kernel.class);

    private final RealMachine realMachine;
    private Process currentProcess;
    private final Map<Class<? extends Resource>, Resource> resources;
    private final Set<Process> processes;
    private final Set<Process> blockedProcesses;
    private final Queue<Process> readyProcesses;
    private final Queue<Class<? extends Resource>> messages;
    private boolean running;

    @Inject
    public Kernel(RealMachine realMachine) {
        this.realMachine = realMachine;
        this.resources = new HashMap<>();
        this.processes = new HashSet<>();
        this.blockedProcesses = new HashSet<>();
        this.readyProcesses = new PriorityQueue<>(Collections.reverseOrder());
        this.messages = new ConcurrentLinkedQueue<>();
    }

    public void run() {
        logger.info("Starting OS");

        running = true;
        var init = new StartStop(this);
        createProcess(init);
        resourceDistributor();

        while (running) {
            for (var message : messages) {
                freeResource(message);
            }
            messages.clear();

            if (currentProcess != null) {
                currentProcess.execute();
            }
        }

        init.destroy();
    }

    public <T extends Resource> void postMessage(Class<T> clazz) {
        messages.add(clazz);
    }

    public void createResource(Resource resource) {
        var existingResource = resources.getOrDefault(resource.getClass(), null);
        if (existingResource != null) {
            resource.setWaitingProcesses(existingResource.getWaitingProcesses());
        }

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

    public <T extends Resource> void requestResource(Class<T> clazz, Process process) {
        var resource = resources.getOrDefault(clazz, null);

        if (resource == null) {
            logger.warn("{} tried to acquire non existant resource - {}", process, clazz);
            return;
        }

        resource.requestResource(process);
        process.setState(ProcessState.BLOCKED);
        readyProcesses.remove(process);
        blockedProcesses.add(process);

        resourceDistributor();
    }

    public <T extends Resource> T findResource(Class<T> clazz) {
        return (T) resources.get(clazz);
    }

    public <T extends Resource> void freeResource(Class<T> clazz) {
        var resource = resources.get(clazz);
        resource.free();
        resourceDistributor();
    }

    public void freeResource(Resource resource) {
        freeResource(resource.getClass());
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