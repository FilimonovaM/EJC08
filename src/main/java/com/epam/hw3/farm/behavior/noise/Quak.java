package com.epam.hw3.farm.behavior.noise;

import com.epam.hw3.farm.behavior.interfaces.MakeASoundBehavior;

public class Quak implements MakeASoundBehavior {

    /**
     * uses for demonstration one of the birds of speak behavior.
     */
    @Override
    public String speak() {
        return ("\tWhat do we hear when we ask it something? \n\"Quak-quak!!!\"");
    }
}
