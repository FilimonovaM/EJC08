package com.epam.hw3.typesOfFlight;

public class FlyByPlaneLikeACapriciousWoman implements FlyBehavior {

    /**
     * uses for demonstration one of the types of fly behavior.
     *
     */
    @Override
    public void fly() {
        System.out.println("\tShe says about the air-vehicle: \n\"Oh I'm not going to fly in an economy class! Who am I in your mind?\"");
    }
}