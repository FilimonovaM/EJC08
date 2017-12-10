package com.epam.vol1.hw3.farm.behavior.flight;

import com.epam.vol1.hw3.farm.behavior.flight.FlyByPlaneLikeACapriciousWoman;
import org.junit.Assert;
import org.junit.Test;

public class FlyByPlaneLikeACapriciousWomanTest {
    FlyByPlaneLikeACapriciousWoman flyByPlaneLikeACapriciousWoman = new FlyByPlaneLikeACapriciousWoman();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\tShe says about the air-vehicle: \n\"Oh I'm not going to fly in an economy class! " +
                "Who am I in your mind?\""), flyByPlaneLikeACapriciousWoman.fly());
    }
}