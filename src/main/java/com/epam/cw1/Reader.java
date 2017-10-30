package com.epam.cw1;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    int numberOfMonth;
    Month month;
    Checker checker;

    public void read(BufferedReader bufferedReader) throws IOException {
        System.out.println("Enter the number of month:");
        checker = new Checker();
        try {
            checker.validator(bufferedReader.readLine());
        } catch (ArrayIndexOutOfBoundsException err) {
            System.err.println(err.getMessage());
        }
        System.out.println(currentMonth(numberOfMonth));
    }

    public String currentMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
        switch (numberOfMonth) {
            case 1:
                month = Month.JANUARY;
                break;
            case 2:
                month = Month.FEBRUARY;
                break;
            case 3:
                month = Month.MARCH;
                break;
            case 4:
                month = Month.APRIL;
                break;
            case 5:
                month = Month.MAY;
                break;
            case 6:
                month = Month.JUNE;
                break;
            case 7:
                month = Month.JULY;
                break;
            case 8:
                month = Month.AUGUST;
                break;
            case 9:
                month = Month.SEPTEMBER;
                break;
            case 10:
                month = Month.OCTOBER;
                break;
            case 11:
                month = Month.NOVEMBER;
                break;
            case 12:
                month = Month.DECEMBER;
                break;
            default:
                month = Month.INCORRECT;
        }
        return month.toString();
    }
}
