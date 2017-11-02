package com.epam.hw4.wallet;

import com.epam.hw4.phrases.Answer;

public class Wallet {
    static private int playerBalance = 100;
    static private int bet=0;

    public int getPlayerBalance() {
        return playerBalance;
    }

    private String setPlayersBalance(int cash) {
        playerBalance += cash;
        return "The balance is replenished";
    }

    public int setBet(int bet) {
        this.bet = bet;
        return bet;
    }

    public String removeBet(){
        bet = 0;
        return Answer.WALLET.toString(3);
    }

    public String aloneWin() {
        setPlayersBalance(bet*2);
        removeBet();
        return Answer.HORSES.toString(5)+ getPlayerBalance();
    }

    public String winWithGeralt() {
        setPlayersBalance(bet);
        removeBet();
        return Answer.HORSES.toString(6)+ getPlayerBalance();
    }

    public String loose(){
        setPlayersBalance((-1)*bet);
        removeBet();
        return Answer.HORSES.toString(7)+ getPlayerBalance();
    }
}
