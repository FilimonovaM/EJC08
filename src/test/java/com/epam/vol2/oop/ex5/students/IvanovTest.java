package com.epam.vol2.oop.ex5.students;

import org.junit.Assert;
import org.junit.Test;

public class IvanovTest {
    Ivanov ivanov = new Ivanov();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Ivanov", ivanov.getName());
    }

    @Test
    public void getCount() throws Exception {
        Assert.assertEquals(0, ivanov.getCount());
    }
}