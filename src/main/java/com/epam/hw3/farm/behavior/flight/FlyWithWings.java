package com.epam.hw3.farm.behavior.flight;

import com.epam.hw3.farm.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    /**
     * uses for demonstration one of the birds of fly behavior.
     *
     * @return String message
     */
    @Override
    public String fly() {
        return ("\"I`m flying with wings\"");
    }
}
