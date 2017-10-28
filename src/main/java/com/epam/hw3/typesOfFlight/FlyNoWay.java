package com.epam.hw3.typesOfFlight;

import com.epam.hw3.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    /**
     * uses for demonstration one of the types of fly behavior.
     */
    @Override
    public void fly() {
        System.out.println("\tIt can`t fly");
    }
}
