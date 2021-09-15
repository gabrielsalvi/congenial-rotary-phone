package assignments.problemsSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoodOrBadSets
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOperations = Integer.parseInt(br.readLine());

        while (numOperations != 0)
        {
            List<String> list = new ArrayList<>();

            String setDefinition = "Conjunto Bom";

            for (int i = 0; i < numOperations; i++)
                list.add(br.readLine());

            list = list.stream().sorted().collect(Collectors.toList());

            for (int i = 0; i < numOperations - 1; i++)
            {
                if (list.get(i+1).startsWith(list.get(i)))
                    setDefinition = "Conjunto Ruim";
            }

            System.out.println(setDefinition);
            numOperations = Integer.parseInt(br.readLine());
        }
    }
}