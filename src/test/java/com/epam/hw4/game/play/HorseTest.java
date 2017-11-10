package com.epam.hw4.game.play;

import com.epam.hw4.horses.interfaces.Observer;

public class HorseTest implements Observer {

    public int randomizeSpeed() {
        return 1;
    }

    public String getName() {
        return "Knopka";
    }

    public int getResult() {
        return 50;
    }
}
