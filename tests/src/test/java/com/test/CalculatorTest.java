package com.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest
{
    @Test
    public void testSum()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.sum("1+1+3");
        assertEquals(5, sum);
    }
}
