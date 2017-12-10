package com.epam.vol1.hw3.farm.birds.duck;

import com.epam.vol1.hw3.farm.behavior.flight.FlyWithWings;
import com.epam.vol1.hw3.farm.behavior.noise.Quak;
import com.epam.vol1.hw3.farm.behavior.swimming.SwimLikeAChampion;

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
            System.out.println("It`s is ready to test its properties!");
        } else {
            throw new NullPointerException("Check the initialization of the objects includes birds of " +
                    "birds behavior(Class " + this.getClass() + "). Anything of this object is empty.");
        }
    }
}
