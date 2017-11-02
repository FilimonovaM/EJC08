package com.epam.hw3.farm.behavior.flight;

import org.junit.Assert;
import org.junit.Test;


public class FlyNoWayTest {
    FlyNoWay flyNoWay = new FlyNoWay();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\tIt can`t fly"), flyNoWay.fly());
    }
}