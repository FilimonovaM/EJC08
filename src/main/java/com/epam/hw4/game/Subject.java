package com.epam.hw4.game;

import com.epam.hw4.horse.interfaces.Observer;

public interface Subject {

    /**
     *
     */
    void addHorse(Observer... horse);

    String race();

    boolean isWin();

    String setChosenHorse(int i);

    String getChosenHorse();
}
