package com.epam.vol2.oop.ex2;

public class Stationery {
    int cost;
    int amount;

    public Stationery(int cost, int amount) {
        this.cost = Math.abs(cost);
        this.amount = Math.abs(amount);
    }

    /**
     * uses for calculating of the sum of stationery`s cost
     *
     * @return cost
     */
    protected int getValue() {
        return cost * amount;
    }
}
