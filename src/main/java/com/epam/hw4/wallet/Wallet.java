package com.epam.hw4.wallet;

import com.epam.hw4.phrases.Answer;

public class Wallet {
    static private int playerBalance = 100;
    static private int bet = 0;

    /**
     *
     */
    public int getPlayerBalance() {
        return playerBalance;
    }

    private String setPlayersBalance(int cash) {
        playerBalance += cash;
        return "The balance is "+playerBalance;
    }

    public int setBet(int bet) {
        this.bet = bet;
        return bet;
    }

    public String aloneWin() {
        setPlayersBalance(bet);
        return Answer.RACE.toString(2) + getPlayerBalance();
    }

    public String winWithGeralt() {
        setPlayersBalance(0);
        return Answer.RACE.toString(3) + getPlayerBalance();
    }

    public String loose() {
        setPlayersBalance((-1) * bet);
        return Answer.RACE.toString(4) + getPlayerBalance();
    }
}
