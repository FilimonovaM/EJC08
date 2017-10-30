package com.epam.hw3.farm.behavior.flight;

import com.epam.hw3.farm.behavior.interfaces.FlyBehavior;

public class FlyByStrangeFantasies implements FlyBehavior {

    /**
     * uses for demonstration one of the birds of fly behavior.
     */
    @Override
    public String fly() {
        return ("\t\"And yet the REAL man must be able to fly!\"");
    }
}
