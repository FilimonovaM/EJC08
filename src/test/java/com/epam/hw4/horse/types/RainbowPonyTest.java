package com.epam.hw4.horse.types;

import org.junit.Assert;
import org.junit.Test;

public class RainbowPonyTest {
    RainbowPony rainbowPony = new RainbowPony();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Rainbow pony", rainbowPony.getName());
    }
}