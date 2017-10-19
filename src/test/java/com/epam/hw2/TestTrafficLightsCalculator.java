package com.epam.hw2;


import org.junit.Assert;
import org.junit.Test;

public class TestTrafficLightsCalculator {
    TrafficLightsCalculator trafficLightsCalculator = new TrafficLightsCalculator();

    @Test
    public void testAnswer() {
        Assert.assertEquals("RED", trafficLightsCalculator.answer(0));
        Assert.assertEquals("YELLOW", trafficLightsCalculator.answer(2));
        Assert.assertEquals("YELLOW", trafficLightsCalculator.answer(13));
        Assert.assertEquals("RED", trafficLightsCalculator.answer(60));
        Assert.assertEquals("GREEN", trafficLightsCalculator.answer(66));
        Assert.assertEquals("Negative argument, unacceptable index of array", trafficLightsCalculator.answer(-1));
    }
}
