package optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalPrimitiveTypes
{
    public static void main(String[] args)
    {
        System.out.println("int optional value");
        OptionalInt.of(13).ifPresent(System.out::println);

        System.out.println("double optional value");
        OptionalDouble.of(27.57).ifPresent(System.out::println);

        System.out.println("long optional value");
        OptionalLong.of(10L).ifPresent(System.out::println);
    }
}