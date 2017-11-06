package com.epam.hw4.game.interfaces;

import com.epam.hw4.horse.interfaces.Observer;

public interface Subject {

    /**
     * uses for adding a horse.
     *
     */
    void addHorse(Observer... horse);

    /**
     * uses for starting of the race.
     *
     */
    String race();

    /**
     * uses for to compare chosen horse and winner.
     *
     */
    boolean isWin();

    /**
     * uses for setting a chosen horse.
     *
     */
    String setChosenHorse(int i);

    /**
     * uses getting a chosen horse.
     *
     */
    String getChosenHorse();
}
