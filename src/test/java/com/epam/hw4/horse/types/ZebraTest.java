package com.epam.hw4.horse.types;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZebraTest {
    Zebra zebra = new Zebra();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals(" Zebra",zebra.getName());
    }

}