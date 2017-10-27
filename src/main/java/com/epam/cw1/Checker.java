package com.epam.cw1;

public class Checker {
    int numberOfMonth;

    public int validator(String number) {
        numberOfMonth = 13;
        try {
            numberOfMonth = isNum(number);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        if (numberOfMonth > 0 && numberOfMonth < 13) {
            return numberOfMonth;
        }
        throw new ArrayIndexOutOfBoundsException("Number is incorrect");
    }

    public int isNum(String number) throws NumberFormatException{
        numberOfMonth = Integer.parseInt(number);
        return  numberOfMonth;
    }
}
