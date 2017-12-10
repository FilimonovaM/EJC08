package com.epam.vol2.oop.ex5.students;

import org.junit.Assert;
import org.junit.Test;

public class VasechkinTest {
    Vasechkin vasechkin = new Vasechkin();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Vasechkin", vasechkin.getName());
    }

    @Test
    public void getCount() throws Exception {
        Assert.assertEquals(0, vasechkin.getCount());
    }
}