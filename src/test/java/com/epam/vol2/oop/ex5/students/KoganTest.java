package com.epam.vol2.oop.ex5.students;

import org.junit.Assert;
import org.junit.Test;

public class KoganTest {
    Kogan kogan = new Kogan();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Kogan", kogan.getName());
    }

    @Test
    public void getCount() throws Exception {
        Assert.assertEquals(0, kogan.getCount());
    }
}