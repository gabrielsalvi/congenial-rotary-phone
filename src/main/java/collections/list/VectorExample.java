package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        List<String> sports = new Vector<>();

        sports.add("Soccer");
        sports.add("Volleyball");
        sports.add("Basketball");
        sports.add("Handball");

        sports.set(3, "Skateboarding");

        System.out.println(sports.get(2));

        for (String sport : sports)
        {
            System.out.println("--> " + sport);
        }
    }
}
