package com.epam.vol1.hw4.game.play;

import com.epam.vol1.hw4.menu.configuration.Menu;

import java.io.IOException;

public class JoyCasino {

    /**
     * uses for loading an application.
     */
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        System.out.println(menu.changeMenuLevel());
    }
}
