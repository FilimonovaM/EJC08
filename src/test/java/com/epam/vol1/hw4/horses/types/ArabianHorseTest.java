package com.epam.vol1.hw4.horses.types;

import org.junit.Assert;
import org.junit.Test;

public class ArabianHorseTest {
    ArabianHorse arabianHorse = new ArabianHorse();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Arabian Horse", arabianHorse.getName());
    }
}