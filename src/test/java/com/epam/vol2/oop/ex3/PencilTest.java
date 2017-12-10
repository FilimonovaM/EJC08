package com.epam.vol2.oop.ex3;

import org.junit.Assert;
import org.junit.Test;

public class PencilTest {
    Stationery pencil = new Pencil();
    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Pencil", pencil.getName());
    }

    @Test
    public void getAmount() throws Exception {
        Assert.assertEquals(2, pencil.getAmount());
    }

    @Test
    public void getCost() throws Exception {
        Assert.assertEquals(2, pencil.getCost());
    }
}