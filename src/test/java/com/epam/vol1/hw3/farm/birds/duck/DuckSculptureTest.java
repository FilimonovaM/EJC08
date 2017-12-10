package com.epam.vol1.hw3.farm.birds.duck;

import com.epam.vol1.hw3.farm.birds.duck.Duck;
import com.epam.vol1.hw3.farm.birds.duck.DuckSculpture;
import org.junit.Test;

public class DuckSculptureTest {
    Duck duck = new DuckSculpture();

    @Test(expected = NullPointerException.class)
    public void displayTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.display();
    }
}