package com.epam.vol1.hw3.farm.birds.human;

import com.epam.vol1.hw3.farm.birds.human.DuckFaceChick;
import com.epam.vol1.hw3.farm.birds.human.HomoSapience;
import org.junit.Test;

public class HomoSapienceTest {
    HomoSapience duck = new DuckFaceChick();

    @Test(expected = NullPointerException.class)
    public void performFlyTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.performFly();
    }

    @Test(expected = NullPointerException.class)
    public void performSpeakTest() throws NullPointerException {
        duck.makeASoundBehavior = null;
        duck.performSpeak();
    }

    @Test(expected = NullPointerException.class)
    public void performSwimTest() throws NullPointerException {
        duck.swimBehavior = null;
        duck.performSwim();
    }

    @Test(expected = NullPointerException.class)
    public void setFlyBehaviorTest() throws NullPointerException {
        duck.setFlyBehavior(null);
    }

    @Test(expected = NullPointerException.class)
    public void setQuakBehaviorTest() throws NullPointerException {
        duck.setQuakBehavior(null);
    }

    @Test(expected = NullPointerException.class)
    public void setSwimBehaviorTest() throws NullPointerException {
        duck.setSwimBehavior(null);
    }
}