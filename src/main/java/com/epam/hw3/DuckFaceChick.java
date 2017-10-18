package com.epam.hw3;

import com.epam.hw3.typesOfFlight.FlyByPlaneLikeACapriciousWoman;
import com.epam.hw3.typesOfNoise.Quak;
import com.epam.hw3.typesOfSwimming.SwimLikeACapriciousWoman;

public class DuckFaceChick extends HomoSapience {

    public DuckFaceChick() {
        flyBehavior = new FlyByPlaneLikeACapriciousWoman();
        makeASoundBehavior = new Quak();
        swimBehavior = new SwimLikeACapriciousWoman();
    }

    /**
     * uses for personal presentation of the classes which extends from the superclass HomoSapience
     */
    @Override
    public void presentHerself() {
        System.out.println("\tOne of the most useless women of the human population call herself name \nand " +
                "doing a duck face because she convinced that it make her more attractive");
    }
}
