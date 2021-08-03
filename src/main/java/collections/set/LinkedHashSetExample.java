package collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample // it keeps the insertion order of elements
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> sequence = new LinkedHashSet<>();

        sequence.add(3);
        sequence.add(18);
        sequence.add(12);
        sequence.add(6);
        sequence.add(15);

        System.out.println(sequence);

        sequence.remove(18);

        for (Integer i : sequence)
        {
            System.out.println("--> " + i);
        }

        sequence.clear();

        System.out.println("Is the LinkedHashSet empty? - " + sequence.isEmpty());
    }
}