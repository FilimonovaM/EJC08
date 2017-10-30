package com.epam.hw3.farm.behavior.flight;

import com.epam.hw3.farm.behavior.interfaces.FlyBehavior;

public class FlyByPlaneLikeACapriciousWoman implements FlyBehavior {

    /**
     * uses for demonstration one of the birds of fly behavior.
     *
     * @return String message
     */
    @Override
    public String fly() {
        return ("\tShe says about the air-vehicle: \n\"Oh I'm not going to fly in an economy class! " +
                "Who am I in your mind?\"");
    }
}
