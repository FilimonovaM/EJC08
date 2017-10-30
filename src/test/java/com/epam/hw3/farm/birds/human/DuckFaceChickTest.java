package com.epam.hw3.farm.birds.human;

import org.junit.Test;

public class DuckFaceChickTest {
    HomoSapience duck = new DuckFaceChick();

    @Test(expected = NullPointerException.class)
    public void presentHerselfTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.presentHerself();
    }
}
