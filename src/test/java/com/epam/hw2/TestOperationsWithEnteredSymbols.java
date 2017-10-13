package com.epam.hw2;

import org.junit.Assert;
import org.junit.Test;

public class TestOperationsWithEnteredSymbols {

    @Test
    public void testCheck() {
        OperationsWithEnteredSymbols operationsWithEnteredSymbols = new OperationsWithEnteredSymbols();
        Assert.assertEquals(0, operationsWithEnteredSymbols.check("0"));
        Assert.assertEquals(100, operationsWithEnteredSymbols.check("100"));
        Assert.assertEquals(-100, operationsWithEnteredSymbols.check("-100"));
        Assert.assertEquals(-1, operationsWithEnteredSymbols.check("R"));
        Assert.assertEquals(-1, operationsWithEnteredSymbols.check(""));
        Assert.assertEquals(-1, operationsWithEnteredSymbols.check(null));
    }
}
