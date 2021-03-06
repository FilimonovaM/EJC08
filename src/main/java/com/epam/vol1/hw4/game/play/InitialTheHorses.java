package com.epam.vol1.hw4.game.play;

import com.epam.vol1.hw4.answer.phrases.Answer;
import com.epam.vol1.hw4.horses.types.*;
import com.epam.vol1.hw4.wallet.Wallet;

import java.io.IOException;

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
     * uses for sending the information about what the horses player choose.
     *
     * @return name of the chosen horses
     */
    public String initTheHorses(int value) {
        return (raceManager.setChosenHorse(value));
    }

    /**
     * uses to start the race.
     *
     * @return info about the winner
     */
    public String runTheRace() throws IOException {
        System.out.println(Answer.RACE.toString(-1));
        System.out.println(raceManager.race());
        return (wallet.calculateWinnersGain(raceManager.winners.size(), raceManager.isWin(),
                raceManager.getChosenHorse()));
    }
}
