package com.epam.hw4.game;

import com.epam.hw4.horse.types.*;
import com.epam.hw4.phrases.Answer;
import com.epam.hw4.wallet.Wallet;

public class InitialTheHorses {
    RaceManager raceManager;
    Wallet wallet;

    public InitialTheHorses() {
        raceManager = new RaceManager();
        wallet = new Wallet();
        raceManager.addHorse(new ArabianHorse(), new Donkey(), new Plotva(),
                new RainbowPony(), new Zebra());
    }


    /**
     *
     */
    public String initTheHorses(int value) {
        return (raceManager.setChosenHorse(value));
    }

    public String runTheRace() {
        System.out.println(Answer.HORSES.toString(3));
        System.out.println(raceManager.race());
        if (raceManager.isWin()) {
            if (raceManager.getChosenHorse().equalsIgnoreCase(" plotva")) {
                return wallet.winWithGeralt();
            } else {
                return wallet.aloneWin();
            }
        } else {
            return wallet.loose();
        }
    }
}
