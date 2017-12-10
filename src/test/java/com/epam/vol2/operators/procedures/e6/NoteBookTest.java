package com.epam.vol2.operators.procedures.e6;

import org.junit.Assert;
import org.junit.Test;

public class NoteBookTest {

    @Test
    public void writeTheLetter() throws Exception {
        Assert.assertEquals("New note created! Index of note is 1",
                NoteBook.getInstance().writeTheLetter("kkk"));
    }

    @Test
    public void readTheLetter() throws Exception {
        Assert.assertEquals("Nothing to read!",
                NoteBook.getInstance().readTheLetter(1));
        NoteBook.getInstance().writeTheLetter("kkk");
        Assert.assertEquals("Note with index 1: kkk",
                NoteBook.getInstance().readTheLetter(1));

    }

    @Test
    public void deleteTheLetter() throws Exception {
        Assert.assertEquals("Nothing to delete!",
                NoteBook.getInstance().deleteTheLetter(1));
        NoteBook.getInstance().writeTheLetter("kkk");
        Assert.assertEquals("Note with index 1 deleted!",
                NoteBook.getInstance().deleteTheLetter(1));
    }

    @Test
    public void editTheLetter() throws Exception {
        Assert.assertEquals("Nothing to edit!",
                NoteBook.getInstance().editTheLetter(1,"ggggg"));
        NoteBook.getInstance().writeTheLetter("kkk");
        Assert.assertEquals("Note with index 1 edited!",
                NoteBook.getInstance().editTheLetter(1,"ggg"));
    }

    @Test
    public void showAll() throws Exception {
        Assert.assertEquals("",
                NoteBook.getInstance().showAll());
        NoteBook.getInstance().writeTheLetter("kkk");
        Assert.assertEquals("Note #1:\n" +
                        "kkk\n\n",
                NoteBook.getInstance().showAll());
    }

}