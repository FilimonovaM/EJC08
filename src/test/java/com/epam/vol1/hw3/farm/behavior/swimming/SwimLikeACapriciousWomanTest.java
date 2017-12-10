package com.epam.vol1.hw3.farm.behavior.swimming;

import com.epam.vol1.hw3.farm.behavior.swimming.SwimLikeACapriciousWoman;
import org.junit.Assert;
import org.junit.Test;

public class SwimLikeACapriciousWomanTest {
    SwimLikeACapriciousWoman swimLikeACapriciousWoman = new SwimLikeACapriciousWoman();

    @Test
    public void swimTest() throws Exception {
        Assert.assertEquals(("\tIf you call her to swim, she says anything like: \n\"Oh... You are so stupid! " +
                "I can`t to swim because the water\n can soak & spoil my hair " +
                "or washing off the autosunburn!\""), swimLikeACapriciousWoman.swim());
    }
}