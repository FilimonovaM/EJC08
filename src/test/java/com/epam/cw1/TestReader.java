package com.epam.cw1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Admin on 026 26.10.17.
 */
public class TestReader {

    Reader reader = new Reader();

    @Test
    public void testValidator() {
        Assert.assertEquals(12, reader.validator("12"));
        Assert.assertEquals(12, reader.validator("h"));
        Assert.assertEquals(12, reader.validator(""));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOfExceptionsValidator() {
        reader.validator("0");
        reader.validator("13");
        reader.validator("-13");
    }

    @Test
    public void TestCurrentMonth(){
        Assert.assertEquals("DECEMBER", reader.currentMonth(12));
        Assert.assertEquals("JANUARY", reader.currentMonth(1));
        Assert.assertEquals("INCORRECT", reader.currentMonth(-1000));
        Assert.assertEquals("INCORRECT", reader.currentMonth(10000));
    }
}
