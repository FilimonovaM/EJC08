package com.epam.vol2.oop.ex3;

public class NoteBook implements Stationery {
    String name = "NoteBook";
    public int cost = 10;
    private int amount = 1;

    /**
     * uses to get name.
     *
     * @return name.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * uses to get recommended amount.
     *
     * @return recommended amount.
     */
    @Override
    public int getAmount() {
        return amount;
    }

    /**
     * uses for getting cost.
     *
     * @return recommended amount.
     */
    @Override
    public int getCost() {
        return cost;
    }
}
