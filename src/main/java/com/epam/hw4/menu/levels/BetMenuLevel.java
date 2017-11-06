package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.InitialTheHorses;
import com.epam.hw4.menu.config.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

public class BetMenuLevel implements MenuLevel {
    int answer;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();
    InitialTheHorses initialTheHorses;

    /**
     * uses for making a bet or exit if the player spend all his money.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     * @return newLevel - uses to change a level of the menu
     * (to the WalletMenuLevel or exit)
     */
    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        initialTheHorses = new InitialTheHorses();
        answer = -1;
        while (answer != 0) {
            if (wallet.getPlayerBalance() > 0) {
                System.out.println(Answer.BET.toString(1));
                answer = answerReader.read();
                if (answer > 0 && answer <= wallet.getPlayerBalance()) {
                    System.out.println(Answer.BET.toString(2) + wallet.setBet(answer));
                    System.out.println(initialTheHorses.runTheRace());
                } else if (answer == 0) {
                    return new WalletMenuLevel();
                } else {
                    System.out.println(Answer.BET.toString(3) + wallet.getPlayerBalance());
                }
            } else {
                System.out.println(Answer.RACE.toString(5));
                newLevel =  null;
                answer = 0;
            }
        }
        return newLevel;
    }
}
