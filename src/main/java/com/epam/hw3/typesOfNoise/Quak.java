package com.epam.hw3.typesOfNoise;

public class Quak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the types of speak behavior.
     */
    @Override
    public void speak() {
        System.out.println("\tWhat do we hear when we ask it something? \n\"Quak-quak!!!\"");
    }
}
