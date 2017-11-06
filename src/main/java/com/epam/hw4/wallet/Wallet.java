package com.epam.hw4.wallet;

import com.epam.hw4.answer.phrases.Answer;

public class Wallet {
    static private int playerBalance = 100;
    static private int bet = 0;

    /**
     * uses for getting the player balance.
     *
     *@return the player balance
     */
    public int getPlayerBalance() {
        return playerBalance;
    }

    /**
     * uses for setting changes to the the player balance.
     *
     *@return the player balance
     */
    protected String setPlayersBalance(int cash) {
        playerBalance += cash;
        return Answer.WALLET.toString(1) + playerBalance;
    }

    /**
     * uses for making a bet.
     *
     *@return the player bet
     */
    public int setBet(int bet) {
        this.bet = bet;
        return bet;
    }

    /**
     * uses for processing the information about the alone win.
     *
     *@return our congratulations & the player balance
     */
    public String aloneWin() {
        setPlayersBalance(bet);
        return Answer.RACE.toString(2) + getPlayerBalance();
    }

    /**
     * uses for processing the information about the player win, when the Geralt win too.
     *
     *@return our congratulations & the player balance
     */
    public String winWithGeralt() {
        setPlayersBalance(bet/2);
        return Answer.RACE.toString(3) + getPlayerBalance();
    }

    /**
     * uses for processing the information about the casino win.
     *
     *@return our condolences & the player balance
     */
    public String loose() {
        setPlayersBalance((-1) * bet);
        return Answer.RACE.toString(4) + getPlayerBalance();
    }
}
