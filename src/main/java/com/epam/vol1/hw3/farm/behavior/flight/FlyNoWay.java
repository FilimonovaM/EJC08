package com.epam.vol1.hw3.farm.behavior.flight;

import com.epam.vol1.hw3.farm.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    /**
     * uses for demonstration one of the birds of fly behavior.
     *
     * @return String message
     */
    @Override
    public String fly() {
        return ("\tIt can`t fly");
    }
}
