package com.epam.vol1.hw4.horses.types;

import org.junit.Assert;
import org.junit.Test;

public class PlotvaTest {
    Plotva plotva = new Plotva();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Plotva", plotva.getName());
    }
}