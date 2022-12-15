package com.jad;

public abstract class Liquid {
    private final String name;

    public Liquid(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
