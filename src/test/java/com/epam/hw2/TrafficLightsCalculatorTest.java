package com.epam.hw2;


import org.junit.Assert;
import org.junit.Test;

public class TrafficLightsCalculatorTest {

    @Test
    public void testChecker(){
        Operations operations = new Operations();
        Assert.assertEquals(0, operations.check("0"));
        Assert.assertEquals(100, operations.check("100"));
        Assert.assertEquals(-100, operations.check("-100"));
        Assert.assertEquals(-1, operations.check("R"));
        Assert.assertEquals(-1, operations.check(""));
    }
}
