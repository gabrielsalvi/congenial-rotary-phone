package collections.set;

import java.util.TreeSet;

public class TreeSetExample // it doesn't keep the insertion order, but can be sorted
{
    public static void main(String[] args)
    {
        TreeSet<String> capitals = new TreeSet<>();

        capitals.add("São Paulo");
        capitals.add("Rio de Janeiro");
        capitals.add("Porto Alegre");
        capitals.add("Belém");
        capitals.add("Recife");
        capitals.add("Maceió");

        System.out.println(capitals);

        capitals.remove("Rio de Janeiro");

        for (String capital : capitals)
        {
            System.out.println("--> " + capital);
        }

        System.out.println("First: " + capitals.first());
        System.out.println("Last: " + capitals.last());

        System.out.println("Higher than Porto Alegre: " + capitals.higher("Porto Alegre"));
        System.out.println("Lower than Porto Alegre: " + capitals.lower("Porto Alegre"));

        System.out.println("Is the LinkedHashSet empty? - " + capitals.isEmpty());
    }
}
