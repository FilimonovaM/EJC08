package com.epam.vol2.oop.ex3;

import java.util.ArrayList;
import java.util.List;

public class NewDude {
    private static List<Stationery> stationeryList;
    public NewDude(){
        stationeryList = new ArrayList<>();
        stationeryList.add(new NoteBook());
        stationeryList.add(new Rolodex());
        stationeryList.add(new Pen());
        stationeryList.add(new Pencil());
    }

    /**
     * uses to get stationery set.
     *
     * @return info about names and amounts of stationery set.
     */
    public String getStartSet() {

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("A new employee receives such office supplies:");
        for (Stationery s : stationeryList) {
            stringBuffer.append(s.getName() + " - " + s.getAmount()+"\n");
        }
        return stringBuffer.toString();
    }
    public List<Stationery> getList(){
        return stationeryList;
    }
}
