package com.epam.vol2.oop.ex2;

import org.junit.Assert;
import org.junit.Test;

public class PaperClipsTest {
    @Test
    public void getValue() throws Exception {
        Stationery paperClips = new PaperClips(1, 2);
        Assert.assertEquals(2, paperClips.getValue());
        Stationery paperClips1 = new PaperClips(-1, 2);
        Assert.assertEquals(2, paperClips1.getValue());
    }
}