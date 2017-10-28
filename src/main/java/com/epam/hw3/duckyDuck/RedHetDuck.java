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
        if (makeASoundBehavior != null && flyBehavior != null && swimBehavior != null) {
            System.out.println("It`s synthetic & it`s don`t care how we will testing its properties!");
        } else {
            throw new NullPointerException("Check the initialization of the objects includes types of " +
                    "duck behavior(Class " + this.getClass() + "). Anything of this object is empty.");
        }
    }
}
