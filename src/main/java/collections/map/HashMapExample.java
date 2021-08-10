package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<String, Integer> worldChampions = new HashMap<>();

        worldChampions.put("Brazil", 5);
        worldChampions.put("Germany", 4);
        worldChampions.put("Italy", 4);
        worldChampions.put("Uruguay", 2);
        worldChampions.put("Argentina", 2);
        worldChampions.put("France", 2);
        worldChampions.put("England", 1);
        worldChampions.put("Spain", 1);

        System.out.println(worldChampions);

        worldChampions.put("Brazil", 6);

        System.out.println(worldChampions);

        System.out.println(worldChampions.get("Brazil"));

        System.out.println("Contains Uruguay? -> " + worldChampions.containsKey("Uruguay"));

        worldChampions.remove("Uruguay");

        System.out.println("Contains Uruguay? -> " + worldChampions.containsKey("Uruguay"));

        System.out.println("Contains value 3 -> " + worldChampions.containsValue(3));

        System.out.println("Size of wordChampions: " + worldChampions.size());

        for (Map.Entry<String, Integer> entry : worldChampions.entrySet())
        {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println();

        for (String key : worldChampions.keySet())
        {
            System.out.println(key + " --> " + worldChampions.get(key));
        }

        worldChampions.clear();

        System.out.println("wordChampions is empty? -> " + worldChampions.isEmpty());
    }
}