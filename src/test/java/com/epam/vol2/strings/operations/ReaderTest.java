package com.epam.vol2.strings.operations;

import org.junit.Assert;
import org.junit.Test;

public class ReaderTest {

    @Test
    public void getScore() throws Exception {
        Assert.assertEquals(0, Reader.getInstance().getScore());
        Reader.getInstance().setScore();
        Assert.assertEquals(1, Reader.getInstance().getScore());
    }
}