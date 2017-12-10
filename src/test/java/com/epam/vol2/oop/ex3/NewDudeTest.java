package com.epam.vol2.oop.ex3;

import org.junit.Assert;
import org.junit.Test;

public class NewDudeTest {
    @Test
    public void getStartSet() throws Exception {
    NewDude newDude = new NewDude();
        Assert.assertEquals("NoteBook - 1\n" +
                "Rolodex - 1\n" +
                "Pen - 2\n" +
                "Pencil - 2\n",newDude.getStartSet());
    }
}