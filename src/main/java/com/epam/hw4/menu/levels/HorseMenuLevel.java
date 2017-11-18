package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.InitialTheHorses;
import com.epam.hw4.game.play.log.Log;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;

import java.io.IOException;

public class HorseMenuLevel implements MenuLevel {
    int answer = -1;
    MenuLevel newLevel;
    InitialTheHorses initialTheHorses = new InitialTheHorses();


    /**
     * uses for choosing a horses.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the EnterMenuLevel or to the WalletMenuLevel)
     */
    @Override
    public MenuLevel run(AnswerReader answerReader) throws IOException {
        newLevel = new EnterMenuLevel();
        while (answer != 0) {
            System.out.println(Answer.HORSES.toString(1));
            try {
                answer = answerReader.readInt();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                Log.getInstance().logTheEvent("Buffered reader is crashed " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                Log.getInstance().logTheEvent("NumberFormatExceptions " + e.getMessage());
            }
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



