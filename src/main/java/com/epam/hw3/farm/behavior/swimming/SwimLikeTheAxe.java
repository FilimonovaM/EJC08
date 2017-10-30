package com.epam.hw3.farm.behavior.swimming;

import com.epam.hw3.farm.behavior.interfaces.SwimBehavior;

public class SwimLikeTheAxe implements SwimBehavior {

    /**
     * uses for demonstration one of the birds of swim behavior.
     *
     * @return String message
     */
    @Override
    public String swim() {
        return ("\tYou cast it to the water...It sinking to the dark deep");
    }
}
