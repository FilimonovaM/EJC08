package com.epam.hw4.menu;

import com.epam.hw4.phrases.Answer;
import com.epam.hw4.wallet.Wallet;

public class WalletMenuLevel implements MenuLevel {
    char answer;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();

    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        newLevel = new HorseMenuLevel();
        System.out.println(Answer.WALLET.toString(2));
        while (answer != '0') {
            System.out.println(Answer.WALLET.toString(-1));
            answer = answerReader.read();
            if (answer == '1') {
                System.out.println(Answer.WALLET.toString(1) + wallet.getPlayerBalance());
            } else if (answer == '2') {
                return new BetMenuLevel();
            }
        }
        return newLevel;
    }
}
