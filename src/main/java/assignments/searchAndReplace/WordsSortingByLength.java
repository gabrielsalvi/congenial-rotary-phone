/*
Desafio:
    Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve
    receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras
    decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.

Entrada:
    A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada
     caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter
     entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

Saída:
    A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o
    tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve
    ser impresso entre duas palavras.
 */

package assignments.searchAndReplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsSortingByLength
{
    public static void main(String[] args) throws IOException
    {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++)
        {
            String[] words = br.readLine().split(" ");

            Arrays.sort(words);

            Stream<String> sorted = Arrays.stream(words)
                    .sorted(Comparator.comparingInt(String::length)
                            .reversed());

            System.out.println(sorted.collect(Collectors.joining(" ")));
        }
    }
}