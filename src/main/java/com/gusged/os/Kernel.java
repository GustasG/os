package com.gusged.os;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
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
import com.gusged.os.resource.FromInterrupt;

@Getter
@Setter
@Singleton
public class Kernel {
    private static final Logger logger = LoggerFactory.getLogger(Kernel.class);
    private static Kernel instance;

    private final RealMachine realMachine;
    private Process currentProcess;
    private final Map<Class<? extends Resource>, Resource> resources;
    private final Set<Process> processes;
    private final Set<Process> blockedProcesses;
    private final Queue<Process> readyProcesses;
    private final Queue<Class<? extends Resource>> waitingResources;
    private boolean running;

    @Inject
    public Kernel(RealMachine realMachine) {
        this.realMachine = realMachine;
        this.resources = new ConcurrentHashMap<>();
        this.processes = new HashSet<>();
        this.blockedProcesses = new HashSet<>();
        this.readyProcesses = new PriorityQueue<>(Collections.reverseOrder());
        this.waitingResources = new ConcurrentLinkedQueue<>();
        instance = this;
    }

    public static Kernel instance() {
        return instance;
    }

    public void run() {
        logger.info("Starting OS");

        running = true;
        var init = new StartStop();
        createProcess(init);
        resourceDistributor();

        while (running) {
            handleWaitingResources();

            if (currentProcess != null) {
                // TODO: delete if necessary
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                currentProcess.execute();
            } else {
                resourceDistributor();
            }
        }

        init.destroy();
    }

    private void handleWaitingResources() {
        for (var message : waitingResources) {
            freeResource(message);
        }

        waitingResources.clear();
    }

    public <T extends Resource> void addWaitingResource(Class<T> clazz) {
        waitingResources.add(clazz);
    }

    public void createResource(Resource resource) {
        var existingResource = resources.getOrDefault(resource.getClass(), null);
        if (existingResource != null) {
            resource.setId(existingResource.getId());
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

    public void stopProcess(Process process) {
        if (process.getState() == ProcessState.RUNNING) {
            process.setState(ProcessState.READY_SUSPENDED);
        } else if (process.getState() == ProcessState.READY) {
            process.setState(ProcessState.READY_SUSPENDED);
            readyProcesses.remove(process);
        } else if (process.getState() == ProcessState.BLOCKED) {
            process.setState(ProcessState.BLOCKED_SUSPENDED);
            blockedProcesses.remove(process);
        }
    }

    public void activateProcess(Process process) {
        if (process.getState() == ProcessState.READY_SUSPENDED) {
            process.setState(ProcessState.READY);
            readyProcesses.add(process);
        } else if (process.getState() == ProcessState.BLOCKED_SUSPENDED) {
            process.setState(ProcessState.BLOCKED);
            blockedProcesses.add(process);
        }
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

    @SuppressWarnings("unchecked")
    public <T extends Resource> T findResource(Class<T> clazz) {
        return (T) resources.get(clazz);
    }

    public void freeResource(Resource resource) {
        resource.free();
        resourceDistributor();
    }

    public <T extends Resource> void freeResource(Class<T> clazz) {
        freeResource(resources.get(clazz));
    }

    public void resourceDistributor() {
        for (var resource : resources.values()) {
            var waitingProcesses = resource.getWaitingProcesses();
            var processesToDelete = new ArrayList<Process>();

            for (var process : waitingProcesses) {
                if (resource.getAvailableCount() <= 0) {
                    break;
                }
                if (resource instanceof FromInterrupt fromInterrupt) {
                    if (!fromInterrupt.getTarget().equals(process)) {
                        continue;
                    }
                }

                if (currentProcess == process) {
                    currentProcess = null;
                }

                process.getAcquiredResources()
                        .add(resource);

                process.setState(ProcessState.READY);
                resource.acquire();

                processesToDelete.add(process);
                blockedProcesses.remove(process);
                readyProcesses.add(process);
            }

            processesToDelete.forEach(waitingProcesses::remove);
        }

        planner();
    }

    public void planner() {
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