package com.epam.hw4.game.play;

import org.junit.Assert;
import org.junit.Test;

public class InitialTheHorsesTest {
    InitialTheHorses initialTheHorses = new InitialTheHorses();

    @Test
    public void initTheHorsesTest() throws Exception {
        Assert.assertEquals(" Plotva", initialTheHorses.initTheHorses(3));
    }
}