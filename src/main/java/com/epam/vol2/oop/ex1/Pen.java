package com.epam.vol2.oop.ex1;

public class Pen {
    String color;

    public Pen(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < color.length(); i++) {
            hash += (int) color.charAt(0);
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pen other = (Pen) obj;
        if (color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "This is " + color + " pen.";
    }
}
