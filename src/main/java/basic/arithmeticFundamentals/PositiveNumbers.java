/* Quantidade de Números Positivos

Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em
seguida, apresente a quantidade de valores positivos digitados.

- Entrada: Você receberá seis valores, negativos e/ou positivos.

- Saída: Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
ao final. */

package basic.arithmeticFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0, count = 0;
        double number;

        while (i < 6)
        {
            number = Double.parseDouble(br.readLine());

            if (number > 0.0)
            {
                count++;
            }
            i++;
        }

        System.out.println(count + " valores positivos");
    }
}