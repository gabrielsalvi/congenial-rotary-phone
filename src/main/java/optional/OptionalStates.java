package optional;

import java.util.Optional;

public class OptionalStates
{
    public static void main(String[] args)
    {
        Optional<String> stringOptional = Optional.of("Hey there");

        System.out.println("Optinal value is present");
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("it isn't present"));

        Optional<String> nullOptional = Optional.ofNullable(null);

        System.out.println("Optinal value isn't present");
        nullOptional.ifPresentOrElse(System.out::println, () -> System.out.println("null = it isn't present"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Optinal value  isn't present");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = it isn't present"));

        Optional<String> errorOptional = Optional.of(null);

        System.out.println("Optinal value that throws NullPointerException");
        errorOptional.ifPresentOrElse(System.out::println, () -> System.out.println("error = it isn't present"));
    }
}