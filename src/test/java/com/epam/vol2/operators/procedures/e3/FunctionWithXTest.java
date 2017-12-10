package com.epam.vol2.operators.procedures.e3;

import org.junit.Assert;
import org.junit.Test;

public class FunctionWithXTest {

    @Test
    public void function() throws Exception {
        FunctionWithX functionWithX = new FunctionWithX();
        Assert.assertEquals("|arg i = 0 | f(i) = -3,00|\n" +
                "__________________________\n" +
                "|arg i = 2 | f(i) = -1,84|\n" +
                "__________________________\n" +
                "|arg i = 4 | f(i) = -9,80|\n" +
                "__________________________\n", functionWithX.function(0, 5, 2));
    }
}