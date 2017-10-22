package com.home.patterns.observer;

import java.util.ArrayList;

/**
 * Created by Admin on 022 22.10.17.
 */
public class Cat {
    ArrayList<int[]> arrayList= new ArrayList<>(10);
    int[] i = new int[]{1,1,1};
    int[] j = new int[]{2,2,2};
    int[] k = new int[]{3,3,3};
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.catArray();
    }
    private void catArray(){
        arrayList.add(0,i);
        arrayList.add(1,j);
        arrayList.add(2,k);
        for(int t:arrayList.get(1)){
            System.out.println(arrayList.get(1)[t]);
        }
    }
}
