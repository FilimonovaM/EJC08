package com.epam.vol1.hw4.game.play;

import org.junit.Assert;
import org.junit.Test;

public class InitialTheHorsesTest {

    InitialTheHorses initialTheHorses = new InitialTheHorses();

    @Test(expected = NullPointerException.class)
    public void runTheRace() throws Exception {
        initialTheHorses.raceManager = null;
        initialTheHorses.initTheHorses(1);
    }

    @Test
    public void initTheHorsesTest() throws Exception {
        Assert.assertEquals("Plotva", initialTheHorses.initTheHorses(3));
    }

    @Test(expected = NullPointerException.class)
    public void initTheHorsesExceptionTest() throws Exception {
        initialTheHorses.raceManager = null;
        initialTheHorses.initTheHorses(1);
    }
}