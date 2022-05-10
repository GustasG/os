package com.gusged.os.process;

import java.util.Set;
import java.util.HashSet;

import lombok.Getter;
import lombok.Setter;

import com.gusged.os.Kernel;
import com.gusged.os.resource.Resource;

@Setter
@Getter
public abstract class Process implements Comparable<Process> {
    private static long lastId = 0;

    private final long id;
    protected final Kernel kernel;
    private String name;
    private Process parent;
    protected final Set<Process> children;
    protected final Set<Resource> acquiredResources;
    private ProcessState state;
    private int priority;

    public Process(Process parent, int priority) {
        this.id = lastId++;
        this.kernel = Kernel.instance();
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
        children.forEach(Process::destroy);
        acquiredResources.forEach(kernel::freeResource);

        children.clear();
        acquiredResources.clear();
        kernel.destroyProcess(this);
    }

    protected <T extends Resource> void requestResource(Class<T> clazz) {
        kernel.requestResource(clazz, this);
    }

    protected <T extends Resource> void freeResource(Class<T> clazz) {
        acquiredResources.removeIf(resource -> resource.getClass().equals(clazz));
        kernel.freeResource(clazz);
    }

    @SuppressWarnings("unchecked")
    protected <T extends Resource> T findAcquiredResource(Class<T> clazz) {
        for (var resource : acquiredResources) {
            if (resource.getClass().equals(clazz)) {
                return (T) resource;
            }
        }

        throw new IllegalArgumentException("Invalid class");
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
        return Long.compare(priority, other.priority);
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d, priority=%d)", name, id, priority);
    }
}