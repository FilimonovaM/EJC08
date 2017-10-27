package com.epam.cw2;

public class KittyCat extends Cat {

    public KittyCat(String name) {this.name = name;}

    String getName(){
        return (String) toString();
    }

    @Override
    void setName(String name) {
        this.name = name;
    }
}
