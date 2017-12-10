package com.epam.vol2.oop.ex3;

public class Pen implements Stationery {
    String name = "Pen";
    public int cost = 4;
    private int amount = 2;

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
