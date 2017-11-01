package com.epam.hw4.horse.types;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.Random;

public class Plotva implements Observer {
    int dist = 200;//км.
    int speed;//км.ч.
    int result;
    String name = "Plotva";
    Random speedRandomizer;

    @Override
    public int randomizeSpeed() {
        speed = 5;
        result = speed;
        speedRandomizer = new Random();
        for (int i = 0; i < (dist / 10); i++) {
            result += speedRandomizer.nextInt((result <= speed) ? 10 : 5);
        }
        System.out.println("Plotva ");
        System.out.println(result);
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
