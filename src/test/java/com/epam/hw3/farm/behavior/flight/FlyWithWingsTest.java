package com.epam.hw3.farm.behavior.flight;

import org.junit.Assert;
import org.junit.Test;

public class FlyWithWingsTest {
    FlyWithWings flyWithWings = new FlyWithWings();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\"I`m flying with wings\""), flyWithWings.fly());
    }
}