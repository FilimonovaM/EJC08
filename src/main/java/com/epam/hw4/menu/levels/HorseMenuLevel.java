package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.InitialTheHorses;
import com.epam.hw4.menu.config.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;

public class HorseMenuLevel implements MenuLevel {
    char answer;
    MenuLevel newLevel;
    InitialTheHorses initialTheHorses = new InitialTheHorses();

    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        newLevel = new WalletMenuLevel();
        while (answer != '0') {
            System.out.println(Answer.HORSES.toString(1));
            answer = answerReader.read();
            switch (answer) {
                case '0':
                    newLevel = new EnterMenuLevel();
                    answer = '0';
                    break;
                case '1':
                    System.out.println(initialTheHorses.initTheHorses(1)
                            + Answer.HORSES.toString(2));
                    answer = '0';
                    break;
                case '2':
                    System.out.println(initialTheHorses.initTheHorses(2)
                            + Answer.HORSES.toString(2));
                    answer = '0';
                    break;
                case '3':
                    System.out.println(initialTheHorses.initTheHorses(3)
                            + Answer.HORSES.toString(2));
                    answer = '0';
                    break;
                case '4':
                    System.out.println(initialTheHorses.initTheHorses(4)
                            + Answer.HORSES.toString(2));
                    answer = '0';
                    break;
                case '5':
                    System.out.println(initialTheHorses.initTheHorses(5)
                            + Answer.HORSES.toString(2));
                    answer = '0';
            }
        }

        return (newLevel);
    }
}
