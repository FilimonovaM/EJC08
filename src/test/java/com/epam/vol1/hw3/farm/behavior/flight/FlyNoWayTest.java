package com.epam.vol1.hw3.farm.behavior.flight;

import com.epam.vol1.hw3.farm.behavior.flight.FlyNoWay;
import org.junit.Assert;
import org.junit.Test;


public class FlyNoWayTest {
    FlyNoWay flyNoWay = new FlyNoWay();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\tIt can`t fly"), flyNoWay.fly());
    }
}