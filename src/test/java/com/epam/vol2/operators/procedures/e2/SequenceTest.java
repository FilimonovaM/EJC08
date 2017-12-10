package com.epam.vol2.operators.procedures.e2;

import org.junit.Assert;
import org.junit.Test;

public class SequenceTest {
    @Test
    public void minWithCondition() throws Exception {
        Sequence sequence = new Sequence();
        Assert.assertEquals("The minimal index of sequence " +
                "element compliance with the condition is 1\n" +
                "The sequence of the numbers from 1 to 7 is: \n" +
                "1\t2\t3\t4\t5\t6\t7\t", sequence.minWithCondition(-1,7));
    }
}