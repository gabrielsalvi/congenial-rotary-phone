package advanced.functional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterations
{
    public static void main(String[] args)
    {
        String[] names = {"Marcelo", "Ana", "Thiago", "Ana", "Julia", "Pietra", "Luis"};

        String printNamesFor = "";

        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals("Ana"))
            {
                printNamesFor += names[i];
            }
        }

        System.out.println("For -> " + printNamesFor);

        String printNamesStream = Stream.of(names)
                .filter(nome -> nome.equals("Ana"))
                .collect(Collectors.joining());

        System.out.println("Stream -> " + printNamesStream);
    }
}