package com.epam.hw4.wallet;

public class Wallet {
    private int playerBalance = 100;
    private int bet;

    public int getPlayerBalance() {
        return playerBalance;
    }

    private String setPlayersBalance(int cash) {
        playerBalance += cash;
        return "The balance is replenished";
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public String win() {
        setPlayersBalance(bet);
        return "You win. Your balance is "+ getPlayerBalance();
    }

    public String loose(){
        setPlayersBalance((-1)*bet);
        return "Casino win. Your balance is "+ getPlayerBalance();
    }
}
