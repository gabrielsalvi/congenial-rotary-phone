package assignments.problemsSolution;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProductAndDivision
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numOperations = Integer.parseInt(scanner.nextLine());
        BigDecimal result = new BigDecimal(1.0);

        while (numOperations-- > 0)
        {
            var line = scanner.nextLine().split(" ");
            var number = new BigDecimal(line[0]);

            result = line[1].equals("*") ? result.multiply(number) : result.divide(number, MathContext.DECIMAL128);
        }

        System.out.println(result.setScale(0, RoundingMode.DOWN));    }
}