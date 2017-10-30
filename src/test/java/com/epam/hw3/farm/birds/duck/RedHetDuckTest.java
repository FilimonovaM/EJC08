package com.epam.hw3.farm.birds.duck;

import org.junit.Test;

public class RedHetDuckTest {
    Duck duck = new RedHetDuck();

    @Test(expected = NullPointerException.class)
    public void displayTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.display();
    }
}