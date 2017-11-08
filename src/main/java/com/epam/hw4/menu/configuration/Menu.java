package com.epam.hw4.menu.configuration;

import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.menu.levels.EnterMenuLevel;

import java.io.IOException;

public class Menu {
    MenuLevel menuLevel;
    AnswerReader answerReader;

    public Menu() {
        menuLevel = new EnterMenuLevel();
        answerReader = new AnswerReader();
    }

    /**
     * uses for switching between the menu levels.
     *
     * @return - phrase for saying goodbye to player
     */
    public String changeMenuLevel() throws IOException {
        for (; ; ) {
            menuLevel = menuLevel.run(answerReader);
            if (menuLevel == null) {
                break;
            }
        }
        return (answerReader.closeReader());
    }
}
