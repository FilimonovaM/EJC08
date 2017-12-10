package com.epam.vol2.oop.ex4;

import com.epam.vol2.oop.ex3.NewDude;
import org.junit.Assert;
import org.junit.Test;

public class SortedStationeryTest {
    SortedStationery sortedStationery = new SortedStationery(new NewDude());

    @Test
    public void sortByAlphabet() throws Exception {
        Assert.assertEquals("NoteBook Pen Pencil Rolodex ",
                sortedStationery.sortByAlphabet());
    }

    @Test
    public void costSort() throws Exception {
        Assert.assertEquals("Pencil Pen NoteBook Rolodex ",
                sortedStationery.costSort());
    }

    @Test
    public void multiSort() throws Exception {
        Assert.assertEquals("NoteBook Pen Pencil Rolodex ",
                sortedStationery.multiSort());
    }

}