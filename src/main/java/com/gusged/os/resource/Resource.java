package com.gusged.os.resource;

import java.util.Set;
import java.util.HashSet;

import lombok.Getter;
import lombok.Setter;

import com.gusged.os.process.Process;

@Getter
@Setter
public abstract class Resource {
    private static long lastId;

    private long id;
    private String name;
    private int availableCount;
    private final Process creator;
    private Set<Process> waitingProcesses;

    public Resource(Process creator, int availableCount) {
        this.id = lastId++;
        this.name = getClass().getSimpleName();
        this.availableCount = availableCount;
        this.creator = creator;
        this.waitingProcesses = new HashSet<>();
    }

    public void requestResource(Process process) {
        waitingProcesses.add(process);
    }

    public void acquire() {
        availableCount -= 1;
    }

    public void free() {
        availableCount += 1;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Resource other) {
            return id == other.id;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d)", name, id);
    }
}