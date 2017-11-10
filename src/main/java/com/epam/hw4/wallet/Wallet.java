package com.epam.hw4.wallet;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.play.Log;

import java.io.IOException;

public class Wallet {
    static private int playerBalance = 100;
    static private int bet = 0;
    private static final Wallet walletInstance = new Wallet();
    Log log = Log.getInstance();

    public static Wallet getOurInstance(){
        return walletInstance;
    }

    /**
     * uses for getting the player balance.
     *
     * @return the player balance
     */
    public int getPlayerBalance() {
        return playerBalance;
    }

    /**
     * uses for setting changes to the the player balance.
     *
     * @return the player balance
     */
    public int setNewPlayersBalance(int cash) throws IOException {
        playerBalance = cash;
        log.logTheEvent("We have a new Balance: "+cash);
        return playerBalance;
    }

    public int setPlayersBalance(int cash) throws IOException {
        playerBalance += cash;
        log.logTheEvent("Balance was changed: "+cash);
        return playerBalance;
    }

    /**
     * uses for making a bet.
     *
     * @return the player bet
     */
    public int setBet(int bet) throws IOException {
        this.bet = bet;
        log.logTheEvent("Player make a bet: "+bet);
        return bet;
    }

    /**
     * uses for processing the information about the types of the win or loose.
     *
     * @param winnersSize     - is amount of the horses-winners
     * @param isWin           - true if player win
     * @param chosenHorseName - name of the chosen horses
     * @return our congratulations & the player balance
     */
    public String calculateWinnersGain(int winnersSize, boolean isWin, String chosenHorseName) throws IOException {
        int value;
        int gain = bet;
        if (isWin) {
            if (chosenHorseName.equalsIgnoreCase("Plotva")) {
                value = 3;
                gain /= 2 * winnersSize;
            } else {
                value = 2;
                gain /= winnersSize;
            }

        } else {
            value = 4;
            gain *= (-1);
        }
        bet = 0;
        return Answer.RACE.toString(value) + setPlayersBalance(gain);
    }
}
