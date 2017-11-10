package com.epam.hw4.game.play;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.interfaces.Subject;
import com.epam.hw4.horses.interfaces.Observer;
import com.epam.hw4.wallet.Wallet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RaceManager implements Subject {
    ArrayList<Observer> mounts;
    ArrayList<Observer> winners;
    static Observer chosenHorse;
    Wallet wallet = Wallet.getOurInstance();

    public RaceManager() {
        mounts = new ArrayList<>();
    }

    /**
     * uses for adding a horses.
     */
    @Override
    public String addHorse(Observer... horses) {
        for (Observer horse : horses) {
            mounts.add(horse);
        }
        return (Answer.HORSES.toString(2));
    }

    /**
     * uses for starting of the race.
     *
     * @return name of the winner(horses)
     */
    @Override
    public String race() {
        mounts.forEach((list) -> list.randomizeSpeed());
        Collections.sort(mounts, new Comparator<Observer>() {
            @Override
            public int compare(Observer o1, Observer o2) {
                return o2.getResult() - o1.getResult();
            }
        });
        winners = new ArrayList<>();
        int win = 0;
        for (Observer horse : mounts) {
            if (horse.getResult() >= win) {
                win = horse.getResult();
                winners.add(horse);
            } else {
                break;
            }
        }
        winners.forEach((list) -> System.out.println(Answer.RACE.toString(1) + " " + list.getName()));
        return Answer.RACE.toString(6);
    }

    /**
     * uses for to compare chosen horses and winner.
     *
     * @return boolean - true if player win
     */
    @Override
    public boolean isWin() {
        for (Observer winner : winners) {
            if (winner.getName().equals(chosenHorse.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * uses for setting a chosen horses.
     *
     * @return name of the chosen horses
     */
    @Override
    public String setChosenHorse(int i) {
        chosenHorse = mounts.get(i - 1);
        return chosenHorse.getName();
    }

    /**
     * uses getting a chosen horses.
     *
     * @return name of the chosen horses
     */
    @Override
    public String getChosenHorse() {
        return chosenHorse.getName();
    }
}
