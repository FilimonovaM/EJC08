package com.epam.hw3.farm.behavior.flight;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlyByPlaneLikeACapriciousWomanTest {
    FlyByPlaneLikeACapriciousWoman flyByPlaneLikeACapriciousWoman = new FlyByPlaneLikeACapriciousWoman();

    @Test
    public void flyTest() throws Exception {
        Assert.assertEquals(("\tShe says about the air-vehicle: \n\"Oh I'm not going to fly in an economy class! " +
                "Who am I in your mind?\""),flyByPlaneLikeACapriciousWoman.fly());
    }
}