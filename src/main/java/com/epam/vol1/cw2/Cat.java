package com.epam.vol1.cw2;

abstract class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
