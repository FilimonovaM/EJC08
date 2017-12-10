package com.epam.vol1.hw3.farm.birds.duck;

import com.epam.vol1.hw3.farm.birds.duck.Duck;
import com.epam.vol1.hw3.farm.birds.duck.RedHetDuck;
import org.junit.Test;

public class RedHetDuckTest {
    Duck duck = new RedHetDuck();

    @Test(expected = NullPointerException.class)
    public void displayTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.display();
    }
}