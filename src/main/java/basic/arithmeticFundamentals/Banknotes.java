/* Contagem de Cédulas

Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de
notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você
deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor
lido e a relação de notas necessárias.

- Entrada: Você receberá um valor inteiro N (0 < N < 1000000).

- Saída: Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias,
seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim
de linha. */


package basic.arithmeticFundamentals;

import java.io.IOException;
import java.util.Scanner;

public class Banknotes
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int banknote, i, money;
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        money = scanner.nextInt();

        scanner.close();

        System.out.printf("%d\n", money);

        for (i = 0; i < 7; i++)
        {
            banknote = money / banknotes[i];
            money = money % banknotes[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", banknote, banknotes[i]);
        }
    }
}