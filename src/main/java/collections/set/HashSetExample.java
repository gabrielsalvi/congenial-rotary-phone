package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample // don't allow duplicates, and it doesn't keep the insertion order
{
    public static void main(String[] args)
    {
        Set<Double> scores = new HashSet<>();
        Iterator<Double> iterator;

        scores.add(2.5);
        scores.add(6.8);
        scores.add(1.2);
        scores.add(4.3);
        scores.add(4.3);

        iterator = scores.iterator();

        while(iterator.hasNext())
        {
            System.out.println("--> " + iterator.next());
        }

        scores.remove(2.5);

        System.out.println("Length: " + scores.size());
        System.out.println("Is the hashset empty? - " + scores.isEmpty());
    }
}
