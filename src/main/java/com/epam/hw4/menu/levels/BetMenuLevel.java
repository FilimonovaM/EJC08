package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.InitialTheHorses;
import com.epam.hw4.game.play.Log;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

import java.io.IOException;

public class BetMenuLevel implements MenuLevel {
    int answer = -1;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();
    InitialTheHorses initialTheHorses;
    Log log = Log.getInstance();

    /**
     * uses for making a bet or exit if the player spend all his money.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the WalletMenuLevel or exit)
     */
    @Override
    public MenuLevel run(AnswerReader answerReader) throws IOException {
        initialTheHorses = new InitialTheHorses();
        while (answer != 0) {
            if (wallet.getPlayerBalance() > 0) {
                System.out.println(Answer.BET.toString(1));
                try {
                    answer = answerReader.readInt();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.err.println(e.getMessage());
                }
                if (answer > 0 && answer <= wallet.getPlayerBalance()) {
                    System.out.println(Answer.BET.toString(2) + wallet.setBet(answer));
                    System.out.println(initialTheHorses.runTheRace());
                } else if (answer == 0) {
                    newLevel= new WalletMenuLevel();
                    break;
                } else {
                    System.out.println(Answer.BET.toString(3) + wallet.getPlayerBalance());
                }
            } else {
                System.out.println(Answer.RACE.toString(5));
                newLevel = null;
                answer = 0;
            }
        }
        return newLevel;
    }
}
