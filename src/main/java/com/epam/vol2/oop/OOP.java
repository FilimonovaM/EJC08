package com.epam.vol2.oop;

import com.epam.vol2.oop.ex1.Pen;
import com.epam.vol2.oop.ex2.Antony;
import com.epam.vol2.oop.ex3.NewDude;
import com.epam.vol2.oop.ex4.SortedStationery;
import com.epam.vol2.oop.ex5.Schedule;
import com.epam.vol2.oop.ex6.Submarine;

public class OOP {
    public static void main(String[] args) {
        OOP oop = new OOP();
        oop.start();
    }

    /**
     * uses to start the app
     */
    public void start() {
        Pen pen = new Pen("red");
        System.out.println("EX1:");
        System.out.println("hash code: " + pen.hashCode());
        System.out.println("equals blue pen: " + pen.equals(new Pen("blue")));
        System.out.println("pen toString: " + pen.toString());

        Antony antony = new Antony();
        System.out.println("\nEX2:");
        System.out.println(antony.calculateCost());

        NewDude newDude = new NewDude();
        System.out.println("\nEX3:");
        System.out.println(newDude.getStartSet());

        System.out.println("\nEX4:");
        SortedStationery sortedStationery = new SortedStationery(newDude);
        System.out.println("List sorted by alphabet:\n" + sortedStationery.sortByAlphabet());
        System.out.println("List sorted by cost:\n" + sortedStationery.costSort());
        System.out.println("List sorted by alphabet & cost:\n" + sortedStationery.multiSort());

        System.out.println("\nEX5:");
        Schedule schedule = new Schedule();
        System.out.println("\n-----" + schedule.checkGroup() + "-----");

        System.out.println("\nEX6-7:");
        Submarine submarine = new Submarine();
        System.out.println(submarine.prepareSubmarine());
    }
}
