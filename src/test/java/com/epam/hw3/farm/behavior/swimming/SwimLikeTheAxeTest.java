package com.epam.hw3.farm.behavior.swimming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimLikeTheAxeTest {
    SwimLikeTheAxe swimLikeTheAxe = new SwimLikeTheAxe();
    @Test
    public void swimTest() throws Exception {
        Assert.assertEquals(("\tYou cast it to the water...It sinking to the dark deep"), swimLikeTheAxe.swim());
    }
}