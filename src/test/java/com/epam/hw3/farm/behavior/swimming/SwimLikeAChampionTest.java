package com.epam.hw3.farm.behavior.swimming;

import org.junit.Assert;
import org.junit.Test;

public class SwimLikeAChampionTest {
    SwimLikeAChampion swimLikeAChampion = new SwimLikeAChampion();

    @Test
    public void swimTest() throws Exception {
        Assert.assertEquals(("\tIt swim like a God or an Aquaman! It was " +
                "created for water!"), swimLikeAChampion.swim());
    }
}