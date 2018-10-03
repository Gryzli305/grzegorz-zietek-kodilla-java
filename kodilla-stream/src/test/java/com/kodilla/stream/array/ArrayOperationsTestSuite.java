package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int numbers [] = {2,3,4,5};
        double averageExpected = 3.5;

        double average = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(averageExpected,average, 0.01);
    }
}
