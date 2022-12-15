package com.jad;

public abstract class Cup {
    private Liquid liquid;
    private final String name;

    protected Cup(final String name) {
        this.name = name;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(final Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return this.getName() + " : " + this.getLiquid().getName();
    }

    public String getName() {
        return name;
    }
}
