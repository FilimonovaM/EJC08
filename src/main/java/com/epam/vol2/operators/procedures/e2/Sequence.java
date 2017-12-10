package com.epam.vol2.operators.procedures.e2;


public class Sequence {
    /**
     * uses to find minimal value of condition which
     * compliance with i%5==0 && show  the condition.
     *
     * @param n is the maximal value og condition.
     * @return String message with index of the minimum
     * value which compliance with the condition(i%5 == 0)
     */
    public String minWithCondition(int start, int n) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        int sum = 0;
        int a = 0;
        int min = 0;
        boolean needMin = true;
        sb1.append("The sequence of the numbers from 1 to " + n + " is: \n");
        for (int i = start; i <= n; i++) {
            sum += i;
        }
        for (int i = 1; i <= n; i++) {
            a = 1 / ((n + 1) * (n + 1));
            if (a < sum && needMin) {
                min = i;
                needMin = false;

            }
            sb1.append(String.valueOf(i) + "\t");
        }
        if (min <= n) {
            sb.append("The minimal index of sequence element " +
                    "compliance with the condition is " + min + "\n");
        }
        sb.append(sb1);
        return sb.toString();
    }
}
