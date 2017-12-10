package com.epam.vol1.cw2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.callTheCat();
    }

    private void callTheCat() {
        Set<Cat> catSet = new HashSet<>();
        Cat barsic = new KittyCat("Barsik");
        Cat potap = new KittyCat("Potap");
        Cat shura = new KittyCat("Shura");
        catSet.add(barsic);
        catSet.add(potap);
        catSet.add(shura);
        potap = shura;
        catSet.forEach(cat -> System.out.println("Object Cat : " + cat.getName()));
        potap.setName("Shura 2.0");
        catSet.forEach(System.out::println);
    }
}
