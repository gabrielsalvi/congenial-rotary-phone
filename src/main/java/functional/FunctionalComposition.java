package functional;

import java.util.Arrays;

public class FunctionalComposition
{
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3, 4};

        // functional
        Arrays.stream(values)
                .filter(value -> value % 2 == 1)
                .map(value -> value * 2)
                .forEach(System.out::println);

        // imperative
        for (int i = 0; i < values.length; i++)
        {
            int value;

            if (values[i] % 2 == 1)
            {
                value = values[i] << 1;
                System.out.println(value);
            }
        }
    }
}