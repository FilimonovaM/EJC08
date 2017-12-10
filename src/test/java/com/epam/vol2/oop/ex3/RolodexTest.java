package com.epam.vol2.oop.ex3;

import org.junit.Assert;
import org.junit.Test;

public class RolodexTest {
    Stationery rolodex = new Rolodex();
    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Rolodex", rolodex.getName());
    }

    @Test
    public void getAmount() throws Exception {
        Assert.assertEquals(1, rolodex.getAmount());
    }

    @Test
    public void getCost() throws Exception {
        Assert.assertEquals(40, rolodex.getCost());
    }
}