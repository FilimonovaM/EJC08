package com.epam.hw4.horse.types;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.Random;

public class Donkey implements Observer {
    private int dist = 200;//км.
    private int result = 0;
    private String name = " Donkey";
    Random speedRandomizer;

    /**
     * uses for calculating a race result for horses.
     *
     * @return result of the race
     */
    @Override
    public int randomizeSpeed() {
        int speed = 5;
        result = speed;
        speedRandomizer = new Random();
        for (int i = 0; i < (dist / 10); i++) {
            result += speedRandomizer.nextInt((result <= speed) ? 10 : 5);
        }
        System.out.println("Donkey - " + result);
        return result;
    }

    /**
     * uses for getting horse name.
     *
     * @return horse name
     */
    @Override
    public String getName() {
        return name;
    }
}
