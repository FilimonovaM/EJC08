package com.epam.vol2.oop.ex3;

public class Rolodex implements Stationery {
    String name = "Rolodex";
    public int cost = 40;
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
