package com.epam.hw4.game.play;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.horse.types.*;
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
     * uses for sending the information about what the horse player choose.
     *
     * @return name of the chosen horse
     */
    public String initTheHorses(int value) {
        return (raceManager.setChosenHorse(value));
    }

    /**
     * uses to start the race.
     *
     * @return info about the winner
     */
    public String runTheRace() {
        System.out.println(Answer.RACE.toString(-1));
        raceManager.race();
        return (wallet.calculateWinnersGain(raceManager.winners.size(),raceManager.isWin(),raceManager.getChosenHorse()));
    }
}
