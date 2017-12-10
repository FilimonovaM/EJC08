package com.epam.vol2.operators.procedures.e3;

import java.util.Formatter;

public class FunctionWithX {

    /**
     * uses to find f(i).
     *
     * @param start is a first value of i.
     * @param end   is a high border of the value of i
     * @param step  is a rule of i changing
     * @return String message about the i & f(i)
     */
    public String function(int start, int end, int step) {
        Formatter formatter = new Formatter();
        StringBuffer sb = new StringBuffer();
        String formatString = "|arg i = %d | f(i) = %.2f|\n__________________________\n";
        double func = 0;
        System.out.println("__________________________");
        for (int i = start; i <= end; i += step) {
            sb.append(String.format(formatString, i, Math.tan(2 * i) - 3));
        }
        return sb.toString();
    }
}
