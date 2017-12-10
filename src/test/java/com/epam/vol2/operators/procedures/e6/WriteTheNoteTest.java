package com.epam.vol2.operators.procedures.e6;

import org.junit.Assert;
import org.junit.Test;

public class WriteTheNoteTest {
    @Test
    public void isDigit() throws Exception {
        WriteTheNote writeTheNote = new WriteTheNote();
        Assert.assertFalse(!writeTheNote.isDigit("100"));
    }
}