package com.epam.cw2;

public abstract class Cat {
    protected String name;

    @Override
    public String toString() {
        return ("My name is " + name + " & I`m a cat.");
    }

    abstract void setName(String name);
    abstract String getName();

}
