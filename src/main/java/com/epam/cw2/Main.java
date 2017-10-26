package com.epam.cw2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();
        Cat barsic = new Cat("Barsik");
        Cat potap = new Cat("Potap");
        Cat shura = new Cat("Shura");
        catSet.add(barsic);
        catSet.add(potap);
        catSet.add(shura);
        for (Cat cat : catSet) {
            System.out.println(cat.toString());
        }

    }


}
