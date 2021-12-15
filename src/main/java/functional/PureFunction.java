package functional;

import java.util.function.BiPredicate;

public class PureFunction
{
    public static void main(String[] args)
    {
        BiPredicate<Integer, Integer> isGreater = (param, comparator) -> param > comparator;

        System.out.println(isGreater.test(7, 9));
        System.out.println(isGreater.test(7, 9));
    }
}