package collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample
{
    public static void main(String[] args)
    {
        TreeMap<String, String> capitals = new TreeMap<>();

        capitals.put("SP", "São Paulo");
        capitals.put("RR", "Boa Vista");
        capitals.put("RO", "Porto Velho");
        capitals.put("AC", "Rio Branco");
        capitals.put("ES", "Vitória");
        capitals.put("MG", "Belo Horizonte");

        System.out.println(capitals);

        System.out.println("First key --> " + capitals.firstKey());
        System.out.println("Last key --> " + capitals.lastKey());

        System.out.println("Lower key (RO)--> " + capitals.lowerKey("RO"));
        System.out.println("Higher key (RO)--> " + capitals.higherKey("RO"));

        System.out.println("First entry --> " + capitals.firstEntry().getKey() + " - " + capitals.firstEntry().getValue());

        Map.Entry<String, String> firstEntry = capitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = capitals.pollLastEntry();

        System.out.println("Removing and returning first entry: " + firstEntry.getKey() + " --> " + firstEntry.getValue());
        System.out.println("Removing and returning last entry: " + lastEntry.getKey() + " --> " + lastEntry.getValue());

        Iterator<String> iterator = capitals.keySet().iterator();

        while (iterator.hasNext())
        {
            String key = iterator.next();
            System.out.println(key + " : " + capitals.get(key));
        }

        for (String capital : capitals.keySet())
        {
            System.out.println(capital + " -> " + capitals.get(capital));
        }

        for (Map.Entry<String, String> capital : capitals.entrySet())
        {
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }
    }
}