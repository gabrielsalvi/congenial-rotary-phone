package functional.function;

import java.util.function.Consumer;

public class ConsumerExample
{
    public static void main(String[] args)
    {
        Consumer<String> printPhrase = System.out::println;
        Consumer<String> printPhraseLambda = phrase -> System.out.println(phrase);

        printPhrase.accept("omae wa mou shindeiru");
        printPhraseLambda.accept("NANI???");
    }
}