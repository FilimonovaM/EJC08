package com.epam.hw3.farm.behavior.flight;

import org.junit.Assert;
import org.junit.Test;

public class FlyByStrangeFantasiesTest {
    FlyByStrangeFantasies flyByStrangeFantasies = new FlyByStrangeFantasies();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\t\"And yet the REAL man must be able to fly!\""), flyByStrangeFantasies.fly());
    }
}