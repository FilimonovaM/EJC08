package com.epam.cw1;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReader {
    Reader reader = new Reader();

    @Test(expected = IOException.class)
    public void testRead() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.close();
        reader.read(bufferedReader);
    }

    @Test
    public void testCurrentMonth(){
        Assert.assertEquals("DECEMBER", reader.currentMonth(12));
        Assert.assertEquals("JANUARY", reader.currentMonth(1));
        Assert.assertEquals("INCORRECT", reader.currentMonth(-1000));
        Assert.assertEquals("INCORRECT", reader.currentMonth(10000));
    }
}
