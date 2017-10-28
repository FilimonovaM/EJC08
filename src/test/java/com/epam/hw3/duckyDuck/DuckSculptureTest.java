package com.epam.hw3.duckyDuck;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 028 28.10.17.
 */
public class DuckSculptureTest {
    Duck duck = new DuckSculpture();

    @Test(expected = NullPointerException.class)
    public void displayTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.display();
    }
}