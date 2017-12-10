package com.epam.vol1.hw4.horses.interfaces;

public interface Observer {

    /**
     * uses for calculating a race result for horses.
     */
    int randomizeSpeed();

    /**
     * uses for getting horses name.
     */
    String getName();

    /**
     * uses for getting horses result.
     */
    int getResult();
}
