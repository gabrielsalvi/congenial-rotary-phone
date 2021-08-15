package advanced.functional;

import java.util.function.UnaryOperator;

public class Immutability
{
    public static void main(String[] args)
    {
        int value = 5;
        UnaryOperator<Integer> doubleOfValue = v -> v * 2;

        System.out.println(doubleOfValue.apply(value));
        System.out.println(value);
    }
}