package com.epam.hw3.farm.birds.duck;

import org.junit.Test;

public class DuckSculptureTest {
    Duck duck = new DuckSculpture();

    @Test(expected = NullPointerException.class)
    public void displayTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.display();
    }
}