package com.epam.vol2.oop.ex6;

import org.junit.Assert;
import org.junit.Test;

public class SubmarineTest {
    Submarine submarine = new Submarine();

    @Test
    public void prepareSubmarine() throws Exception {
        Assert.assertEquals("We are live in a yellow submarine!",
                submarine.prepareSubmarine());
    }
}