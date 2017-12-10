package com.epam.vol1.hw3.farm.birds.human;

import com.epam.vol1.hw3.farm.birds.human.DuckFaceChick;
import com.epam.vol1.hw3.farm.birds.human.HomoSapience;
import org.junit.Test;

public class DuckFaceChickTest {
    HomoSapience duck = new DuckFaceChick();

    @Test(expected = NullPointerException.class)
    public void presentHerselfTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.presentHerself();
    }
}
