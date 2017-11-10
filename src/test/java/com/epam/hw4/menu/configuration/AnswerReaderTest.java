package com.epam.hw4.menu.configuration;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AnswerReaderTest {
    AnswerReader answerReader = new AnswerReader();

    @Test(expected = IOException.class)
    public void readIntTest() throws Exception {
        answerReader.bufferedReader.close();
        answerReader.readInt();
    }

    @Test
    public void closeReaderTest() throws Exception {
        Assert.assertEquals("Ohhh... Don`t come back without the money!!!", answerReader.closeReader());
    }
}