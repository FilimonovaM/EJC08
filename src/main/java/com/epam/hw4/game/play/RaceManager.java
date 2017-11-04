package com.epam.hw4.game.play;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.interfaces.Subject;
import com.epam.hw4.horse.interfaces.Observer;

import java.util.ArrayList;

public class RaceManager implements Subject {
    private ArrayList<Observer> horses;
    private ArrayList<Observer> winHorses;
    private Observer winner;
    private Observer choozenHorse;

    /**
     *
     */
    public RaceManager() {
        horses = new ArrayList<>();
        winHorses = new ArrayList<>();
        choozenHorse = null;
        winner = null;
    }

    @Override
    public void addHorse(Observer... horse) {
        for (Observer observer : horse) {
            horses.add(observer);
        }
    }

    @Override
    public String race() {
        int winScore = 0;
        int horseSpeed = 0;

        for (Observer horse : horses) {
            horseSpeed = horse.randomizeSpeed();
            if (winScore <= horseSpeed) {
                winScore = horseSpeed;
                winner = horse;
            }
        }
        return Answer.RACE.toString(1) + winner.getName();
    }

    @Override
    public boolean isWin() {
        return (choozenHorse == winner) ? true : false;
    }

    @Override
    public String setChosenHorse(int i) {
        choozenHorse = horses.get(i - 1);
        return (choozenHorse.getName());
    }

    @Override
    public String getChosenHorse() {
        return choozenHorse.getName();
    }
}
