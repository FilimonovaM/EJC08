package com.epam.hw4.horses.types;

import org.junit.Assert;
import org.junit.Test;

public class ZebraTest {
    Zebra zebra = new Zebra();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Zebra", zebra.getName());
    }
}