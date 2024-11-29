package com.jad;

public abstract class Organ {
    private final String name;

    protected Organ(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
