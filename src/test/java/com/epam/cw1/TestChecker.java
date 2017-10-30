package com.epam.cw1;

import org.junit.Assert;
import org.junit.Test;

public class TestChecker {

    Checker checker = new Checker();

    @Test
    public void testIsNum() {
        Assert.assertEquals(12, checker.isNum("12"));
    }

    @Test(expected = NumberFormatException.class)
    public void testIsNumException() {
        checker.isNum("r");
        checker.isNum("");
        checker.isNum(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOfExceptionsValidator() {
        checker.validator("0");
        checker.validator("13");
        checker.validator("-13");
    }
}
