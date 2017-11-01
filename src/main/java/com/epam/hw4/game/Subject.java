package com.epam.hw4.game;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.ArrayList;

public interface Subject {
    void addHorse(Observer... horse);

    String race();

    String win(ArrayList winners);
}
