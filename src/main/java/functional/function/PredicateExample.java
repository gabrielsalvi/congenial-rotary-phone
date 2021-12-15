package functional.function;

import java.util.function.Predicate;

public class PredicateExample
{
    public static void main(String[] args)
    {
        Predicate<String> isEmpty = String::isEmpty;

        System.out.println(isEmpty.test("Pathfinder"));
        System.out.println(isEmpty.test(""));
    }
}