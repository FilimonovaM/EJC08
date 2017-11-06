package com.epam.hw4.wallet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WalletTest {
    Wallet wallet = new Wallet();

    @Test
    public void getPlayerBalanceTest() throws Exception {
        Assert.assertEquals(105, wallet.getPlayerBalance());
    }

    @Test
    public void setPlayerBalanceTest() throws Exception {
        Assert.assertEquals("Your balance is: "+110, wallet.setPlayersBalance(10));
    }

    @Test
    public void setBetTest() throws Exception {
        wallet.setPlayersBalance(-10);
        Assert.assertEquals(10, wallet.setBet(10));
        wallet.setBet(-10);
    }

    @Test
    public void aloneWinTest() throws Exception {
        wallet.setBet(10);
        Assert.assertEquals("\nYou are The WINNER!!! \nYour balance is 100", wallet.aloneWin());
    }

    @Test
    public void winWithGeraltTest() throws Exception {
        wallet.setBet(10);
        Assert.assertEquals("\nYou WIN!!! \n" +
                "But, you can get only a half of the gain, because the Heralt bets on Plotva too! \n" +
                "Your balance is 110", wallet.winWithGeralt());
    }

    @Test
    public void looseTest() throws Exception {
        wallet.setBet(5);
        Assert.assertEquals("\n" +
                "CASINO WIN - You loose!!! \n" +
                "Your balance is 105", wallet.loose());
    }
}