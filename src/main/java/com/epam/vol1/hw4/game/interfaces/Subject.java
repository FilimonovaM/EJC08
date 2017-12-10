package com.epam.vol1.hw4.game.interfaces;

import com.epam.vol1.hw4.horses.interfaces.Observer;

public interface Subject {

    /**
     * uses for adding a horses.
     */
    String addHorse(Observer... horse);

    /**
     * uses for starting of the race.
     */
    String race();

    /**
     * uses for to compare chosen horses and winner.
     */
    boolean isWin();

    /**
     * uses for setting a chosen horses.
     */
    String setChosenHorse(int i);

    /**
     * uses getting a chosen horses.
     */
    String getChosenHorse();
}
