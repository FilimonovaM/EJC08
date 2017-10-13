package com.epam.hw2;

public class OperationsWithEnteredSymbols {
    private String lineWithSelectedNumber;
    private int enteredInt;
    /**
     * uses for checking of status of the stringBuilder object
     *
     * @param lineWithSelectedNumber include any information that was entered
     * @return is returning a negative digit if lineWithSelectedNumber include a negative digit,
     * another symbol or is empty. Else it return a selected number without some changes.
     */
    public int check(String lineWithSelectedNumber) {
        this.lineWithSelectedNumber = lineWithSelectedNumber;
        try {
            enteredInt = Integer.parseInt(lineWithSelectedNumber);
            if (enteredInt < 0) {
                System.out.println("It is a negative number");
            }else{
                System.out.println("Selected number is " + enteredInt);
            }
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
            enteredInt = -1;
        }
        return enteredInt;
    }
}
