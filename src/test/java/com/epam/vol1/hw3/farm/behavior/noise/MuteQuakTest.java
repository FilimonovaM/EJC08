package com.epam.vol1.hw3.farm.behavior.noise;

import com.epam.vol1.hw3.farm.behavior.noise.MuteQuak;
import org.junit.Assert;
import org.junit.Test;

public class MuteQuakTest {
    MuteQuak muteQuak = new MuteQuak();

    @Test
    public void speakTest() throws Exception {
        Assert.assertEquals(("\tWhat will be heard when we will ask something? " +
                "\n \"___Silence___\""), muteQuak.speak());
    }
}