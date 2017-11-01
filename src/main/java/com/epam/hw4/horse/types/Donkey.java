package com.epam.hw4.horse.types;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.Random;

public class Donkey implements Observer {
    private int dist = 200;//км.
    private int result = 0;
    private String name = "Donkey";
    Random speedRandomizer;

    @Override
    public int randomizeSpeed() {
        int speed = 5;
        result = speed;
        speedRandomizer = new Random();
        for (int i = 0; i < (dist / 10); i++) {
            result += speedRandomizer.nextInt((result <= speed) ? 10 : 5);
        }
        System.out.println("Donkey ");
        System.out.println(result);
        return result;
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
