package com.epam.vol1.hw4.game.play;

import org.junit.Assert;
import org.junit.Test;

public class RaceManagerTest {

    RaceManager raceManager = new RaceManager();

    @Test(expected = NullPointerException.class)
    public void addHorseNullPointerExceptionTest() throws Exception {
        raceManager.mounts = null;
        raceManager.addHorse(new HorseTest());
        raceManager.addHorse(null);
    }

    @Test(expected = NullPointerException.class)
    public void raceExceptionTest() throws Exception {
        raceManager.mounts = null;
        raceManager.race();
    }

    @Test(expected = NullPointerException.class)
    public void isWinException() throws Exception {
        raceManager.winners = null;
        raceManager.mounts = null;
        raceManager.isWin();
    }

    @Test(expected = NullPointerException.class)
    public void setChosenHorseException() throws Exception {
        raceManager.mounts = null;
        raceManager.setChosenHorse(0);
    }

    @Test(expected = NullPointerException.class)
    public void getChosenHorseException() throws Exception {
        raceManager.mounts = null;
        raceManager.setChosenHorse(-1);
        raceManager.getChosenHorse();
    }

    @Test
    public void addTest() throws Exception {
        Assert.assertEquals("The horses are ready ro race!", raceManager.addHorse(new HorseTest()));
    }

    @Test
    public void raceTest() throws Exception {
        raceManager.addHorse(new HorseTest());
        Assert.assertEquals("The race is done", raceManager.race());
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
        Assert.assertEquals("Knopka", raceManager.getChosenHorse());
    }
}