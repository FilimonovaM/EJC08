package com.epam.hw3;

import com.epam.hw3.typesOfFlight.FlyNoWay;
import com.epam.hw3.typesOfNoise.MuteQuak;
import com.epam.hw3.typesOfSwimming.SwimLikeTheAxe;

public class DuckSculpture extends Duck {

    public DuckSculpture() {
        makeASoundBehavior = new MuteQuak();
        flyBehavior = new FlyNoWay();
        swimBehavior = new SwimLikeTheAxe();
    }

    /**
     * uses for personal presentation of the classes which extends from the superclass HomoSapience
     */
    @Override
    public void display() {
        System.out.println("It is a sculpture of duck");
    }
}
