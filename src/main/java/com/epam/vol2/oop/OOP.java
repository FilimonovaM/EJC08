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
     *
     */
    public void start() {
        Pen pen = new Pen("red");
        System.out.println(pen.hashCode());
        System.out.println(pen.equals(new Pen("blue")));
        System.out.println(pen.toString());

        Antony antony = new Antony();
        System.out.println(antony.calculateCost());

        NewDude newDude = new NewDude();
        System.out.println(newDude.getStartSet());

        SortedStationery sortedStationery = new SortedStationery(newDude);
        System.out.println(sortedStationery.sortByAlphabet());
        System.out.println(sortedStationery.costSort());
        System.out.println(sortedStationery.multiSort());

        Schedule schedule = new Schedule();
        System.out.println("\n-----"+schedule.checkGroup()+"-----");

        Submarine submarine = new Submarine();
        System.out.println(submarine.prepareSubmarine());
    }
}
