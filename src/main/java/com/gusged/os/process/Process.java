package com.gusged.os.process;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

import com.gusged.os.Kernel;

@Data
public abstract class Process implements Comparable<Process> {
    private static transient long lastId = 0;

    private final long id;
    private final Kernel kernel;
    private Process parent;
    private final List<Process> children;
    private ProcessState state;
    private int priority;

    public Process(Kernel kernel, Process parent, int priority) {
        id = lastId++;
        this.kernel = kernel;
        this.parent = parent;
        this.priority = priority;
        children = new ArrayList<>();

        if (parent != null) {
            parent.addChild(this);
        }
    }

    public abstract void execute();

    public void destroy() {
        if (parent != null) {
            parent.removeChild(this);
        }

        for (var child : children) {
            child.parent = parent;
        }

        children.clear();
    }

    public void addChild(Process child) {
        children.add(child);
    }

    public void removeChild(Process child) {
        children.remove(child);
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Process otherProcess) {
            return id == otherProcess.id;
        }

        return false;
    }

    @Override
    public int compareTo(Process other) {
        return Long.compare(id, other.id);
    }
}