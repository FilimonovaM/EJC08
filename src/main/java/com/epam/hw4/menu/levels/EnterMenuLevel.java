package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.Log;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

import java.io.IOException;

public class EnterMenuLevel implements MenuLevel {
    int answer;
    MenuLevel newLevel;
    Wallet wallet = Wallet.getOurInstance();

    /**
     * uses for starting the game or exit.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the HorseMenuLevel or exit)
     */
    @Override
    public MenuLevel run(AnswerReader answerReader) throws IOException {
        newLevel = null;
        answer = -1;
        if (wallet.getPlayerBalance() > 0) {
            System.out.println(Answer.WELCOME.toString(-1));
            while (answer != 2) {
                System.out.println(Answer.WELCOME.toString(1));
                try {
                    answer = answerReader.readInt();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                    Log.getInstance().logTheEvent("Buffered reader is crashed " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.err.println(e.getMessage());
                    Log.getInstance().logTheEvent("NumberFormatExceptions " + e.getMessage());
                }
                if (answer == 1) {
                    return new HorseMenuLevel();
                }
            }
        }
        return null;
    }
}
