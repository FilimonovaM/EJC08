package com.epam.hw3.farm.behavior.noise;

import org.junit.Assert;
import org.junit.Test;

public class QuakTest {
    Quak quak = new Quak();

    @Test
    public void speakTest() throws Exception {
        Assert.assertEquals(("\tWhat do we hear when we ask it something? " +
                "\n\"Quak-quak!!!\""), quak.speak());
    }
}