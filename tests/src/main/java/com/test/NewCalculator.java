package com.test;

public class NewCalculator
{
    public int sum (int ...values)
    {
        int sum = 0;

        for (int value : values)
            sum += value;

        return sum;
    }
}
