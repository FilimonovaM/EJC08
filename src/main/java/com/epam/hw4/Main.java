package com.epam.hw4;

import com.epam.hw4.game.RaceManager;
import com.epam.hw4.horse.types.*;

public class Main {

    public static void main(String[] args) {
        RaceManager raceManager = new RaceManager();
        raceManager.addHorse(new Donkey(), new Plotva(), new ArabianHorse(), new RainbowPony(), new Zebra());
        System.out.println(raceManager.race());
    }
}
