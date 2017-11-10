package com.epam.hw4.menu.configuration;

import com.epam.hw4.game.play.Log;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.menu.levels.EnterMenuLevel;

import java.io.IOException;

public class Menu {
    MenuLevel menuLevel;
    AnswerReader answerReader;
    Log log = Log.getInstance();

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
            log.logTheEvent("Player moved to: " + menuLevel.getClass().getCanonicalName().toString());
            menuLevel = menuLevel.run(answerReader);
            if (menuLevel == null) {
                log.logTheEvent("Player leave the menu");
                log.closeTheLog();
                break;
            }
        }
        return (answerReader.closeReader());
    }
}
