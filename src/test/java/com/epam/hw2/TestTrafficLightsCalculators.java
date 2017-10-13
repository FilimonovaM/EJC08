package com.epam.hw2;


import org.junit.Assert;
import org.junit.Test;

public class TestTrafficLightsCalculators {
    TrafficLightsCalculator trafficLightsCalculator = new TrafficLightsCalculator();

    @Test
     public void testAnswer(){
        Assert.assertEquals("RED", trafficLightsCalculator.answer(0));
        Assert.assertEquals("YELLOW", trafficLightsCalculator.answer(2));
        Assert.assertEquals("YELLOW", trafficLightsCalculator.answer(13));
        Assert.assertEquals("RED", trafficLightsCalculator.answer(60));
        Assert.assertEquals("GREEN", trafficLightsCalculator.answer(66));
    }
}
