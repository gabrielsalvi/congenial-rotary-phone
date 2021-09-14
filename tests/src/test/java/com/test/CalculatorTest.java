package com.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest
{
    @Test
    public void testSum()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.sum("1+1+3");
        assertEquals(5, sum);
    }

    @Test
    public void testeSumWithMock()
    {
        String calc = "1+4+7";
        Calculator calculator = mock(Calculator.class);

        when(calculator.sum(calc)).thenReturn(12);

        int result = calculator.sum(calc);

        assertEquals(12, result);
    }
}
