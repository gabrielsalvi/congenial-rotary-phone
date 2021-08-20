package advanced.javaTen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class TypeInference
{
    public static void main(String[] args)
    {
        printURLAfterConnect();
        printSum(2, 3, 12, 1);
    }

    private static void printURLAfterConnect()
    {
        try
        {
            var url = new URL("https://pt.wikipedia.org/wiki/Mangak%C3%A1");
            var urlConnection = url.openConnection();
            
            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream())))
            {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printSum(int ... numbers)
    {
        int sum;

        if (numbers.length > 0)
        {
            sum = 0;

            for (var number : numbers)
            {
                sum += number;
            }

            System.out.println("Sum: " + sum);
        }
    }
}