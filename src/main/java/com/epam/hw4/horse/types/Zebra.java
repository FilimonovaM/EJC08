package com.epam.hw4.horse.types;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.Random;

public class Zebra implements Observer{
    int dist = 200;//км.
    int speed;//км.ч.
    int result;
    Random speedRandomizer;

    @Override
    public int randomizeSpeed() {
        speed = 5;
        result = speed;
        speedRandomizer = new Random();
        for (int i = 0; i<(dist/10);i++){
            result +=speedRandomizer.nextInt((result<=speed)?10:5);
        }
        System.out.println("Donkey ");
        System.out.println(result);
        return result;
    }

    @Override
    public int updateResults() {
        return 0;
    }

    @Override
    public int reloadList() {
        return 0;
    }
}
