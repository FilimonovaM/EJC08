package com.epam.vol2.oop.ex5.students;

import org.junit.Assert;
import org.junit.Test;

public class PetrovTest {
    Petrov petrov = new Petrov();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Petrov", petrov.getName());
    }

    @Test
    public void getCount() throws Exception {
        Assert.assertEquals(0, petrov.getCount());
    }
}