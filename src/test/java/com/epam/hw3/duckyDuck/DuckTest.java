package com.epam.hw3.duckyDuck;

import com.epam.hw3.typesOfSwimming.SwimBehavior;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {
    Duck duck = new RedHetDuck();

    @Test(expected = NullPointerException.class)
    public void performFlyTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.performFly();
    }

    @Test(expected = NullPointerException.class)
    public void performQuakTest() throws NullPointerException {
        duck.makeASoundBehavior = null;
        duck.performQuak();
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