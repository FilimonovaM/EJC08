package com.epam.hw3.duckyDuck;

import com.epam.hw3.typesOfFlight.FlyWithWings;
import com.epam.hw3.typesOfNoise.Quak;
import com.epam.hw3.typesOfSwimming.SwimLikeAChampion;

public class RedHetDuck extends Duck {

    public RedHetDuck() {
        makeASoundBehavior = new Quak();
        flyBehavior = new FlyWithWings();
        swimBehavior = new SwimLikeAChampion();
    }

    /**
     * uses for personal presentation of the classes which extends from the superclass HomoSapience.
     */
    @Override
    public void display() {
        System.out.println("It is a RedHetDuck");
    }
}
