package advanced.threads;

import java.util.stream.IntStream;

public class ParallelStream
{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(n -> factorial(n));
        long end = System.currentTimeMillis();

        System.out.println("Serial execution time -> " + (end - start));

        start = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(n -> factorial(n));
        end = System.currentTimeMillis();

        System.out.println("Parallel execution time -> " + (end - start));
    }

    public static long factorial(long num)
    {
        long fact = 0;

        for (int i = 0; i < num; i++)
        {
            fact *= i;
        }

        return fact;
    }
}
