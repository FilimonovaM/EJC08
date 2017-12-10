package com.epam.vol1.hw4.horses.types;

import com.epam.vol1.hw4.horses.interfaces.Observer;

import java.util.Random;

public class RainbowPony implements Observer {
    private String name = "Rainbow pony";
    private int result;
    Random random;

    /**
     * uses for calculating a race result for horses.
     *
     * @return result of the race
     */
    @Override
    public int randomizeSpeed() {
        int speed = 5;
        result = speed;
        random = new Random();
        for (int i = 0; i < (10); i++) {
            speed = random.nextInt((speed <= 5) ? 10 : 5) + 1;
            result += speed;
        }
        System.out.println(name + " - " + result);
        return result;
    }

    /**
     * uses for getting horses name.
     *
     * @return horses name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * uses for getting horses result.
     *
     * @return horses result
     */
    @Override
    public int getResult() {
        return result;
    }
}
