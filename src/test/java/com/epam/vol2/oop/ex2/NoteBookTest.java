package com.epam.vol2.oop.ex2;

import org.junit.Assert;
import org.junit.Test;

public class NoteBookTest {
    @Test
    public void getValue() throws Exception {
        Stationery noteBook = new NoteBook(1, 2);
        Assert.assertEquals(2, noteBook.getValue());
        Stationery noteBook1 = new NoteBook(-1, 2);
        Assert.assertEquals(2, noteBook1.getValue());
    }
}