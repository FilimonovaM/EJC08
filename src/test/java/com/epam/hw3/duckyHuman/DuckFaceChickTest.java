package com.epam.hw3.duckyHuman;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class DuckFaceChickTest {
    HomoSapience duck = new DuckFaceChick();

    @Test(expected = NullPointerException.class)
    public void presentHerselfTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.presentHerself();
    }
}
