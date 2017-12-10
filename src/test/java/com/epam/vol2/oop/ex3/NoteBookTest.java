package com.epam.vol2.oop.ex3;

import org.junit.Assert;
import org.junit.Test;

public class NoteBookTest {
    Stationery noteBook = new NoteBook();

    @Test
    public void getName() throws Exception {
        Assert.assertEquals("NoteBook", noteBook.getName());
    }

    @Test
    public void getAmount() throws Exception {
        Assert.assertEquals(1, noteBook.getAmount());
    }

    @Test
    public void getCost() throws Exception {
        Assert.assertEquals(10, noteBook.getCost());
    }
}