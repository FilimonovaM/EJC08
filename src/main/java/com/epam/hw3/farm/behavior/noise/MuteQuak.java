package com.epam.hw3.farm.behavior.noise;

import com.epam.hw3.farm.behavior.interfaces.MakeASoundBehavior;

public class MuteQuak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the birds of speak behavior.
     */
    @Override
    public String speak() {
        return ("\tWhat will be heard when we will ask something? \n \"___Silence___\"");
    }
}
