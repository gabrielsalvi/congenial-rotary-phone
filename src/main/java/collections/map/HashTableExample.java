package collections.map;

import java.util.Hashtable;

public class HashTableExample
{
    public static void main(String[] args)
    {
        Hashtable<String, Integer> soccerPlayers = new Hashtable<>();

        soccerPlayers.put("Taison", 10);
        soccerPlayers.put("Yuri", 11);
        soccerPlayers.put("Daniel", 42);
        soccerPlayers.put("Mauricio", 27);
        soccerPlayers.put("Edenilson", 8);

        System.out.println(soccerPlayers);

        soccerPlayers.put("Palacios", 16);
        soccerPlayers.remove("Edenilson");

        System.out.println(soccerPlayers);

        soccerPlayers.replace("Mauricio", 7);
        soccerPlayers.put("Palacios", 11);

        System.out.println(soccerPlayers);

        int shirtNumber = soccerPlayers.get("Taison");

        System.out.println("Taison - " + shirtNumber);

        for (String key : soccerPlayers.keySet())
        {
            System.out.println(key + " -> " + soccerPlayers.get(key));
        }
    }
}