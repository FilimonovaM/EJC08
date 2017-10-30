package com.epam.hw3.farm.behavior.swimming;

import com.epam.hw3.farm.behavior.interfaces.SwimBehavior;

public class SwimLikeACapriciousWoman implements SwimBehavior {
    /**
     * uses for demonstration one of the birds of swim behavior.
     */
    @Override
    public String swim() {
        return ("\tIf you call her to swim, she says anything like: \n\"Oh... You are so stupid! " +
                "I can`t to swim because the water\n can soak & spoil my hair " +
                "or washing off the autosunburn!\"");
    }
}
