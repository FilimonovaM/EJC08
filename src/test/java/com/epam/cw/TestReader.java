package com.epam.cw;

import org.junit.Assert;
import org.junit.Test;

public class TestReader {
    Reader reader = new Reader();

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testThrowerFail() throws ArrayIndexOutOfBoundsException{
        reader.thrower("kkk");
    }

    @Test
    public void testThrower(){
        Assert.assertEquals("Barsik",reader.thrower("Barsik"));
        Assert.assertEquals("Barsik",reader.thrower("barsik"));
    }
}
