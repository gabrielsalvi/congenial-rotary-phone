package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        List<String> aux = new ArrayList<>();

        names.add("Lucas");
        names.add("Joao");
        names.add("Gabriel");
        names.add("Laura");

        System.out.println(names);

        Collections.sort(names);

        for (String element : names)
        {
            System.out.println("--> " + element);
        }

        names.set(3, "Caroline");

        System.out.println("Was the name removed? - " + names.remove("Joao"));
        System.out.println("Was the name removed? - " + names.remove("Mariana"));

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext())
        {
            System.out.println("--> " + iterator.next());
        }

        String name = names.get(1);

        System.out.println(name);

        System.out.println("Length: " + names.size());

        if (names.contains(name))
        {
            System.out.println(name + " is in the list!");
        }
        else
        {
            System.out.println(name + " is NOT in the list!");
        }

        System.out.println("Index of " + name + " is " + names.indexOf(name));

        aux.addAll(names);

        names.clear();

        System.out.println("Aux list: " + aux);

        System.out.println("Is the 'names' list empty? - " + names.isEmpty());
    }
}
