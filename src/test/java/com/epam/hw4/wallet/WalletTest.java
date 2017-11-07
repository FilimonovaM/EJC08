package com.epam.hw4.wallet;

import org.junit.Assert;
import org.junit.Test;

public class WalletTest {
    Wallet wallet = new Wallet();

    @Test
    public void setNewPlayerBalanceTest() throws Exception {
        Assert.assertEquals(100, wallet.setNewPlayersBalance(100));
    }

    @Test
    public void getPlayerBalanceTest() throws Exception {
        wallet.setNewPlayersBalance(100);
        Assert.assertEquals(100, wallet.getPlayerBalance());
    }

    @Test
    public void setPlayerBalanceTest() throws Exception {
        wallet.setNewPlayersBalance(100);
        Assert.assertEquals(110, wallet.setPlayersBalance(10));
    }

    @Test
    public void setBetTest() throws Exception {
        Assert.assertEquals(10, wallet.setBet(10));
        wallet.setBet(0);
    }

    @Test
    public void calculateWinnersGainTest() {
        wallet.setBet(10);
        Assert.assertEquals("\nYou WIN!!! \n" +
                        "But, you can get only a half of the gain, because the Heralt bets on Plotva " +
                        "too! \nYour balance is 105",
                wallet.calculateWinnersGain(1, true, "Plotva"));
        wallet.setBet(0);
        wallet.setNewPlayersBalance(100);
    }
}