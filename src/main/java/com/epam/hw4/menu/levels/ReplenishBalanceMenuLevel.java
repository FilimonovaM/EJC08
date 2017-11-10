package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

import java.io.IOException;

public class ReplenishBalanceMenuLevel implements MenuLevel {
    int answer = -1;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();

    /**
     * uses for replenishing player balance WalletMenuLevel.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the HorseMenuLevel or to the BetMenuLevel)
     */
    @Override
    public MenuLevel run(AnswerReader answerReader) {
        newLevel = new WalletMenuLevel();
        while (answer != 0) {
            System.out.println(Answer.REPLENISH.toString(1));
            try {
                answer = answerReader.readInt();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
            if (answer > 0 && answer <= 99) {
                System.out.println(Answer.WALLET.toString(1) + wallet.setPlayersBalance(answer));
                break;
            } else if (answer > 100) {
                System.out.println(Answer.REPLENISH.toString(2));
            } else {
                System.out.println(Answer.REPLENISH.toString(-1));
            }
        }
        return newLevel;
    }
}
