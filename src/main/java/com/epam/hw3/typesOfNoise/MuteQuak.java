package com.epam.hw3.typesOfNoise;

import com.epam.hw3.interfaces.MakeASoundBehavior;

public class MuteQuak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the types of speak behavior.
     */
    @Override
    public void speak() {
        System.out.println("\tWhat will be heard when we will ask something? \n \"___Silence___\"");
    }
}
