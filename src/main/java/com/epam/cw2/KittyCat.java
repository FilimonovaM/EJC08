package com.epam.cw2;

public class KittyCat extends Cat {

    public KittyCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return ("My name is " + getName() + " & I`m a cat.");
    }
}
