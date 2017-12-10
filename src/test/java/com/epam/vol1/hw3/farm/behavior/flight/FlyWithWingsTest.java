package com.epam.vol1.hw3.farm.behavior.flight;

import com.epam.vol1.hw3.farm.behavior.flight.FlyWithWings;
import org.junit.Assert;
import org.junit.Test;

public class FlyWithWingsTest {
    FlyWithWings flyWithWings = new FlyWithWings();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\"I`m flying with wings\""), flyWithWings.fly());
    }
}