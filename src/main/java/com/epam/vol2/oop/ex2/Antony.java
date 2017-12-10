package com.epam.vol2.oop.ex2;

public class Antony {

    /**
     * uses for calculating of the sum of stationery`s cost
     *
     * @return info about cost
     */
    public String calculateCost(){
        Stationery pen = new Pen(4,2);
        Stationery noteBook = new NoteBook(24, 1);
        Stationery paperClips = new PaperClips(1, 250);
        return "Antony`s statinery cost "+
                (pen.getValue()+noteBook.getValue()+paperClips.getValue());
    }
}
