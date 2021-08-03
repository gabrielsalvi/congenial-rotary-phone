/* Análise de Números

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.

- Entrada: Você receberá 5 valores inteiros.

- Saída: Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */

package basic.arithmeticFundamentals;

import java.io.IOException;
import java.util.Scanner;

public class NumbersClassification
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int i, number, even = 0, odd = 0, positive = 0, negative = 0;

        for (i = 0; i < 5; i++)
        {
            number = scanner.nextInt();

            if (number % 2 == 0) {
                even++;
            }
            else
            {
                odd++;
            }

            if (number > 0)
            {
                positive++;
            }
            else if (number < 0)
            {
                negative++;
            }
            
        }

        scanner.close();

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}