package com.epam.vol2.oop.ex4;

import com.epam.vol2.oop.ex3.NewDude;
import com.epam.vol2.oop.ex3.Stationery;

import java.util.Comparator;
import java.util.List;

public class SortedStationery {
    NewDude newDude;
    List <Stationery> stationeryList;
    StringBuffer sb = new StringBuffer();
    public SortedStationery(NewDude newDude){
        this.newDude = newDude;
    }
/**
 * uses for sort alphabet sort.
 *
 * @return String with names of office supply.
 */
    public String sortByAlphabet() {
        stationeryList = newDude.getList();
        stationeryList.sort(new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return showList(stationeryList);
    }

    /**
     * uses for ascending sort.
     *
     * @return String with names of office supply.
     */
    public String costSort() {
        stationeryList = newDude.getList();
        stationeryList.sort(new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.getCost()-o2.getCost();
            }
        });
        return showList(stationeryList);
    }

    /**
     * uses for alphabet & ascending sort.
     *
     * @return String with names of office supply.
     */
    public String multiSort() {
        stationeryList = newDude.getList();
        stationeryList.sort(new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                int i = o1.getName().compareTo(o2.getName());
                if(i==0){
                    return o1.getCost()-o2.getCost();
                }else {
                    return i;
                }
            }
        });
        return showList(stationeryList);
    }

    /**
     * uses uses to show result of sorting.
     *
     * @return String with names of sorted office supply.
     */
    public String showList(List<Stationery> arrayList){
        sb.setLength(0);
        for(Stationery s:stationeryList){
            sb.append(s.getName()+" ");
        }
        return sb.toString();
    }
}
