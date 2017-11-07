package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.InitialTheHorses;
import com.epam.hw4.menu.config.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;

public class HorseMenuLevel implements MenuLevel {
    int answer;
    MenuLevel newLevel;
    InitialTheHorses initialTheHorses = new InitialTheHorses();


    /**
     * uses for choosing a horse.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the EnterMenuLevel or to the WalletMenuLevel)
     */
    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        answer = -1;
        newLevel = new EnterMenuLevel();
        while (answer != 0) {
            System.out.println(Answer.HORSES.toString(1));
            answer = Character.getNumericValue(answerReader.read());
            if (answer > 0 && answer < 6) {
                newLevel = new WalletMenuLevel();
                System.out.println(initialTheHorses.initTheHorses(answer)
                        + Answer.HORSES.toString(3));
                break;
            }
        }
        return (newLevel);
    }
}



