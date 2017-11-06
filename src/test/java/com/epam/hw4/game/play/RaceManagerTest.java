package com.epam.hw4.game.play;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceManagerTest {
    RaceManager raceManager = new RaceManager();

    @Test
    public void addTest() throws Exception {
        Assert.assertEquals("The horses are ready ro race!", raceManager.addHorse(new HorseTest()));
    }

    @Test
    public void raceTest() throws Exception {
        raceManager.addHorse(new HorseTest());
        Assert.assertEquals("\n Winner is Knopka", raceManager.race());
    }

    @Test
    public void setChosenHorseTest() throws Exception {
        raceManager.addHorse(new HorseTest());
        Assert.assertEquals("Knopka", raceManager.setChosenHorse(1));
    }

    @Test
    public void isWinTest() throws Exception {
        raceManager.addHorse(new HorseTest());
        raceManager.setChosenHorse(1);
        raceManager.race();
        boolean actual = raceManager.isWin();
        Assert.assertTrue(actual);
    }

    @Test
    public void getChosenHorseTest() throws Exception {
        raceManager.addHorse(new HorseTest());
        raceManager.setChosenHorse(1);
        Assert.assertEquals("Knopka",raceManager.getChosenHorse());
    }
}