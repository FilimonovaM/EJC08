package com.epam.vol1.hw3.farm.behavior.flight;

import com.epam.vol1.hw3.farm.behavior.flight.FlyByStrangeFantasies;
import org.junit.Assert;
import org.junit.Test;

public class FlyByStrangeFantasiesTest {
    FlyByStrangeFantasies flyByStrangeFantasies = new FlyByStrangeFantasies();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\t\"And yet the REAL man must be able to fly!\""), flyByStrangeFantasies.fly());
    }
}