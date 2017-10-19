package com.epam.hw3.typesOfFlight;

import com.epam.hw3.typesOfFlight.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    /**
     * uses for demonstration one of the types of fly behavior
     */
    @Override
    public void fly() {
        System.out.println("\"I`m flying with wings\"");
    }
}
