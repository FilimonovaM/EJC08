package com.epam.vol2.oop.ex2;

import org.junit.Assert;
import org.junit.Test;

public class AntonyTest {
    @Test
    public void calculateCost() throws Exception {
        Antony antony = new Antony();
        Assert.assertEquals("Antony`s statinery cost 282", antony.calculateCost());
    }

}