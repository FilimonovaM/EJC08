package com.epam.hw3.duckyDuck;

import com.epam.hw3.typesOfFlight.FlyWithWings;
import com.epam.hw3.typesOfNoise.Quak;
import com.epam.hw3.typesOfSwimming.SwimLikeAChampion;

public class DuckSculpture extends Duck {
    public DuckSculpture() {
        makeASoundBehavior = new Quak();
        flyBehavior = new FlyWithWings();
        swimBehavior = new SwimLikeAChampion();
    }

    /**
     * uses for personal presentation of the classes which extends from the superclass HomoSapience.
     */
    @Override
    public void display() throws NullPointerException {
        System.out.println("This is a sculpture of the typical domestic duck.");
        if (makeASoundBehavior != null && flyBehavior != null && swimBehavior != null) {
            System.out.println("It`s synthetic & it don`t care how we will testing its properties!");
        } else {
            throw new NullPointerException("Check the initialization of the objects includes types of " +
                    "duck behavior (" + this.getClass() + "). Anything of this object is empty.");
        }
//
    }
}
