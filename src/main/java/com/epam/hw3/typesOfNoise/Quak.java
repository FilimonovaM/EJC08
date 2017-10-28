package com.epam.hw3.typesOfNoise;

import com.epam.hw3.interfaces.MakeASoundBehavior;

public class Quak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the types of speak behavior.
     */
    @Override
    public void speak() {
        System.out.println("\tWhat do we hear when we ask it something? \n\"Quak-quak!!!\"");
    }
}
