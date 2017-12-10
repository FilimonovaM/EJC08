package com.epam.vol1.hw3.farm.behavior.swimming;

import com.epam.vol1.hw3.farm.behavior.interfaces.SwimBehavior;

public class SwimLikeAChampion implements SwimBehavior {

    /**
     * uses for demonstration one of the birds of swim behavior.
     *
     * @return String message
     */
    @Override
    public String swim() {
        return ("\tIt swim like a God or an Aquaman! It was created for water!");
    }
}
