package com.epam.hw4.menu;

import com.epam.hw4.game.InitialTheHorses;
import com.epam.hw4.phrases.Answer;
import com.epam.hw4.wallet.Wallet;

public class BetMenuLevel implements MenuLevel {
    int answer;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();
    InitialTheHorses initialTheHorses;

    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        initialTheHorses = new InitialTheHorses();
        answer=-1;
        while (answer != 0) {
            if (wallet.getPlayerBalance() > 0) {
                System.out.println(Answer.BET.toString(1));
                answer = answerReader.read(-1);
                if (answer > 0 && answer <= wallet.getPlayerBalance()) {
                    System.out.println(Answer.BET.toString(2)+wallet.setBet(answer));
                    System.out.println(initialTheHorses.runTheRace());
                } else if (answer == 0) {
                    return new WalletMenuLevel();
                } else {
                    System.out.println(Answer.BET.toString(3)+wallet.getPlayerBalance());
                }
            } else {
                System.out.println(Answer.RACE.toString(5));
                return null;
            }
        }
        return newLevel;
    }
}
