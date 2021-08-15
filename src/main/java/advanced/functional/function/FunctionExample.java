package advanced.functional.function;

import java.util.function.Function;

public class FunctionExample
{
    public static void main(String[] args)
    {
        Function<String, Integer> strToInteger = Integer::valueOf;
        Function<String, String> reverseString = text -> new StringBuilder(text).reverse().toString();

        System.out.println(strToInteger.apply("77") + 3);
        System.out.println(reverseString.apply("gabriel"));
    }
}
