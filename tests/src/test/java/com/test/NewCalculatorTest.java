package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewCalculatorTest
{
    @Test
    public void shouldSumTwoValues ()
    {
        int valueA = 1, valueB = 2, sum;

        NewCalculator newCalculator = new NewCalculator();

        assertEquals(3, newCalculator.sum(valueA, valueB));
    }

    @Test
    public void shouldSumThreeValues ()
    {
        int valueA = 1, valueB = 2, valueC = 4, sum;

        NewCalculator newCalculator = new NewCalculator();

        assertEquals(7, newCalculator.sum(valueA, valueB, valueC));
    }
}
