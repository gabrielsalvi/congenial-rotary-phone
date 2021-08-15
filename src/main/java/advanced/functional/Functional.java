package advanced.functional;

import java.util.function.UnaryOperator;

public class Functional
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> calc = value -> 10 * value; // não executa no momento da leitura
        System.out.println(calc.apply(5));
    }

}