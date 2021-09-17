/*
Desafio:
    Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de
    cada string. Deve começar pela primeira letra da primeira string, seguido pela primeira letra da
    segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.
    As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada:
    A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de
    casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de
    caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída:
    Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
 */

package assignments.solvingAlgorithms;

import java.util.Scanner;

public class StringCombination
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextLine())
        {
            String[] words = scanner.nextLine().split(" ");

            String wordA = words[0], wordB = words[1], output = "";
            String largest = "", shortest = "", remainder;

            boolean sameLength = false;

            if (wordA.length() > wordB.length())
            {
                largest = wordA;
                shortest = wordB;
            }
            else if (wordA.length() < wordB.length())
            {
                largest = wordB;
                shortest = wordA;
            }
            else
            {
                sameLength = true;
            }

            if (sameLength)
            {
                for (int i = 0; i < wordA.length(); i++)
                {
                    output += String.valueOf(wordA.charAt(i)) + wordB.charAt(i);
                }
            }
            else
            {
                remainder = largest.substring(shortest.length());

                for (int i = 0; i < shortest.length(); i++)
                {
                    output += String.valueOf(wordA.charAt(i)) + wordB.charAt(i);
                }

                output += remainder;
            }

            System.out.println(output);
        }
    }
}