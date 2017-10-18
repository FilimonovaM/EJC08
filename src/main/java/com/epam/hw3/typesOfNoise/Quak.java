package com.epam.hw3.typesOfNoise;

public class Quak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the types of speak behavior
     */
    @Override
    public void speak() {
        System.out.println("\tWhat happen if we will ask something? \n \"Quak-quak!!!\"");
    }
}
