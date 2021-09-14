package com.test;

public class Calculator
{
    public int sum(String expression)
    {
        int sum = 0;

        for (String value : expression.split("\\+"))
            sum += Integer.valueOf(value);

        System.out.println(sum);

        return sum;
    }
}
