package com.epam.hw4;

import com.epam.hw4.horse.types.*;

public class Main {

    public static void main(String[] args){
        Donkey donkey = new Donkey();
        Plotva plotva = new Plotva();
        ArabianHorse arabianHorse = new ArabianHorse();
        RainbowPony rainbowPony = new RainbowPony();
        Zebra zebra = new Zebra();
        donkey.randomizeSpeed();
        plotva.randomizeSpeed();
        arabianHorse.randomizeSpeed();
        rainbowPony.randomizeSpeed();
        zebra.randomizeSpeed();
    }

}
