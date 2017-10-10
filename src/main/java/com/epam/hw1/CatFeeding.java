package com.epam.hw1;


import java.io.IOException;

public class CatFeeding {
    StringBuilder sb;
    String name;
    int amount;
    boolean relay;
    Operations oper;

    CatFeeding(boolean relay){
        this.relay = relay;
        sb = new StringBuilder();
        amount = 0;
        oper = new Operations();
    }

    public void start() throws IOException {
        name = oper.read().toString();
        sb.setLength(0);
        while (relay) {
            System.out.println("\nLet`s feed " + name + "! If you want to give a bowl of special nutrition " +
                    "press any even number. \nPress any odd number to give a mouse. \nPress another key to escape.");
            sb = sb.append(oper.read().toString());
            if (!oper.isnum(sb) || !relay){
                relay=false;
            } else {
                relay = eat();
            }
        }
    }

    public boolean eat() throws IOException {
        int catsChoose = oper.parseToInt(sb);
        boolean bol = true;
        sb.setLength(0);
        if (catsChoose % 2 == 0) {
            System.out.println("Cat don`t want to eat this  special cat`s nutrition. It want to hunt! Try to give him a mouse!");
        } else {
            System.out.println("Choose amount of the mouses & press <ENTER>");
            sb.append(oper.read().toString());
            if (oper.isnum(sb) & sb.length()>=0 & oper.parseToInt(sb)>=0) {
                int num = Integer.parseInt(sb.toString());
                amount += Integer.parseInt(sb.toString());
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
