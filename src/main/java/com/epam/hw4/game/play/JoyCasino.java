package com.epam.hw4.game.play;

import com.epam.hw4.menu.config.Menu;

import java.io.IOException;

public class JoyCasino {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        System.out.println(menu.changeMenuLevel());
    }
}
