package advanced.javaTen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class TypeInference
{
    public static void main(String[] args) throws IOException
    {
        var url = new URL("https://pt.wikipedia.org/wiki/Mangak%C3%A1");
        var urlConnection = url.openConnection();

        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

        printSum(2, 3, 12, 1);
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