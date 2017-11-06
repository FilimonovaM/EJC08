package com.epam.hw4.horse.types;

import org.junit.Assert;
import org.junit.Test;

public class DonkeyTest {
    Donkey donkey = new Donkey();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals(" Donkey", donkey.getName());
    }
}