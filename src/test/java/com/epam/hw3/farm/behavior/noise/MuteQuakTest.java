package com.epam.hw3.farm.behavior.noise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MuteQuakTest {
    MuteQuak muteQuak = new MuteQuak();

    @Test
    public void speakTest() throws Exception {
        Assert.assertEquals(("\tWhat will be heard when we will ask something? " +
                "\n \"___Silence___\""), muteQuak.speak());
    }
}