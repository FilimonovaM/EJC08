package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

import java.io.IOException;

public class WalletMenuLevel implements MenuLevel {
    int answer = -1;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();

    /**
     * uses for checking player balance or moving to the BetMenuLevel.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the HorseMenuLevel or to the BetMenuLevel)
     */
    @Override
    public MenuLevel run(AnswerReader answerReader) {
        newLevel = new HorseMenuLevel();
        System.out.println(Answer.WALLET.toString(2));
        while (answer != 0) {
            System.out.println(Answer.WALLET.toString(-1));
            try {
                answer = answerReader.readInt();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
            if (answer == 1) {
                System.out.println(Answer.WALLET.toString(1) + wallet.getPlayerBalance());
            } else if (answer == 2) {
                newLevel = new BetMenuLevel();
                break;
            } else if (answer == 3) {
                newLevel = new ReplenishBalanceMenuLevel();
                break;
            }
        }
        return newLevel;
    }
}
