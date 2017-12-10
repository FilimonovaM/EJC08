package com.epam.vol1.hw3.farm.behavior.swimming;

import com.epam.vol1.hw3.farm.behavior.swimming.SwimLikeAChampion;
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