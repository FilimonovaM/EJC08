package com.epam.vol2.operators.procedures.e4;

public class SimpleArrays {
    /**
     * uses for calculating of sum with special formula.
     *
     * @param ints is massive of digits.
     * @return String message about maximum sum calculated by special formula.
     */
    public String maximum(int... ints) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            max = Math.max(max, ints[i] + ((ints[ints.length - 1] * 2) - i));
        }
        return "Maximum sum is " + max;
    }

}
