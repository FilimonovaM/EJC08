package com.epam.hw3.typesOfFlight;

import com.epam.hw3.interfaces.FlyBehavior;

public class FlyByStrangeFantasies implements FlyBehavior {

    /**
     * uses for demonstration one of the types of fly behavior.
     */
    @Override
    public void fly() {
        System.out.println("\t\"And yet the REAL man must be able to fly!\"");
    }
}
