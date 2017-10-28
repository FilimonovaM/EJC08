package com.epam.hw3.typesOfSwimming;

import com.epam.hw3.interfaces.SwimBehavior;

public class SwimLikeACapriciousWoman implements SwimBehavior {

    /**
     * uses for demonstration one of the types of swim behavior.
     */
    @Override
    public void swim() {
        System.out.println("\tIf you call her to swim, she says anything like: \n\"Oh... You are so stupid! " +
                "I can`t to swim because the water\n can soak & spoil my hair " +
                "or washing off the autosunburn!\"");
    }
}
