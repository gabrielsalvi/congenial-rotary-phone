package optional;

import java.util.Optional;

public class OptionalExample
{
    public static void main(String[] args)
    {
        Optional<String> stringOptional = Optional.of("Optional value");

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());

        stringOptional.ifPresent(System.out::println);

        stringOptional.ifPresentOrElse(System.out::println,
                () -> System.out.println("The value isn't present"));

        if (stringOptional.isPresent())
        {
            String value = stringOptional.get();
            System.out.println(value);
        }

        stringOptional.map((value) -> value.concat("!!!")).ifPresent(System.out::println);

        System.out.println(stringOptional.orElseThrow(IllegalAccessError::new));
    }
}