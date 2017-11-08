package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.menu.configuration.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

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
            answer = answerReader.readInt();
            if (answer > 0 && answer <= 100) {
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
