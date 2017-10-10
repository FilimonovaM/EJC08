package com.epam.hw1;


import java.io.IOException;

public class CatFeeding {
    StringBuilder stringBuilder;
    private String name;
    private int amount;
    private boolean relay;
    Operations oper;

    CatFeeding(boolean relay){
        this.relay = relay;
        stringBuilder = new StringBuilder();
        amount = 0;
        oper = new Operations();
    }

    /**
     * uses to start cat`s loop
     * */
    public void start() throws IOException {
        name = oper.read().toString();
        stringBuilder.setLength(0);
        while (relay) {
            System.out.println("\nLet`s feed " + name + "! If you want to give a bowl of special nutrition " +
                    "press any even number. \nPress any odd number to give a mouse. \nPress another key to escape.");
            stringBuilder = stringBuilder.append(oper.read().toString());
            if (!oper.isNum(stringBuilder) || !relay){
                relay=false;
            } else {
                relay = eat();
            }
        }
    }

    /**
     * uses for saving of the dialog logic
     * @return boolean answer to start().relay
     * */
    private boolean eat() throws IOException {
        int catsChoose = oper.parseToInt(stringBuilder);
        boolean bol = true;
        stringBuilder.setLength(0);
        if (catsChoose % 2 == 0) {
            System.out.println("Cat don`t want to eat this  special cat`s nutrition. It want to hunt! Try to " +
                    "give him a mouse!");
        } else {
            System.out.println("Choose amount of the mouses & press <ENTER>");
            stringBuilder.append(oper.read().toString());
            if (oper.isNum(stringBuilder) & stringBuilder.length()>=0 & oper.parseToInt(stringBuilder)>=0) {
                int num = Integer.parseInt(stringBuilder.toString());
                amount += Integer.parseInt(stringBuilder.toString());
                if (amount >= 15){
                    System.out.println(name +
                            " caught 15 out of "+amount+" mice."+ "It is full.");
                    bol = false;
                } else if (amount < 15 && num > 1) {
                    System.out.println(name + " is happy! It \n" +
                                "caught "+num+" mice. \n" +
                                "It needs more mice. \n" +
                                "Total eaten:"+ amount+" mice");
                } else if (amount < 15 && num == 1) {
                    System.out.println(name + " is happy! It \n" +
                            "caught 1 mouse. "+
                            "Total eaten:"+ amount+" mice.");
                } else {
                    System.out.println(name + " is in sorrow. You forgot to give him a mouse.Total eaten: amount mice");
                }
            } else {
                System.out.println("It is not a number or \n" +
                        "a negative number.");
            }
        }
        return bol;
    }
}
