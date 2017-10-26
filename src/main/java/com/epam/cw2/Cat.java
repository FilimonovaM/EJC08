package com.epam.cw2;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("My name is " + name + ". & I`m a cat.");
    }
}
