package com.gusged.os.process;

import java.util.Set;
import java.util.HashSet;

import lombok.Data;

import com.gusged.os.Kernel;
import com.gusged.os.resource.Resource;

@Data
public abstract class Process implements Comparable<Process> {
    private static long lastId = 0;

    private final long id;
    protected final Kernel kernel;
    private String name;
    private Process parent;
    private final Set<Process> children;
    private final Set<Resource> acquiredResources;
    private ProcessState state;
    private int priority;

    public Process(Kernel kernel, Process parent, int priority) {
        this.id = lastId++;
        this.kernel = kernel;
        this.name = getClass().getSimpleName();
        this.parent = parent;
        this.acquiredResources = new HashSet<>();
        this.children = new HashSet<>();
        this.state = ProcessState.READY;
        this.priority = priority;

        if (parent != null) {
            parent.children.add(this);
        }
    }

    public abstract void execute();

    public void destroy() {
        if (parent != null) {
            parent.children.remove(this);
        }

        for (var child : children) {
            child.destroy();
        }

        for (var resource : acquiredResources) {
            kernel.freeResource(resource.getClass());
        }

        children.clear();
        acquiredResources.clear();
        kernel.destroyProcess(this);
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Process other) {
            return id == other.id;
        }

        return false;
    }

    @Override
    public int compareTo(Process other) {
        return Long.compare(id, other.id);
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d)", name, id);
    }
}