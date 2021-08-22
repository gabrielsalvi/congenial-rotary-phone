/*
Desafio:
    Crie um programa onde você receberá valores inteiros não negativos como entrada.
    Ordene estes valores de acordo com o seguinte critério: - Primeiro os Pares
                                                            - Depois os Ímpares

    Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada:
    A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000).
    Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão,
    cada uma delas, um valor inteiro não negativo.

Saída:
    Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser
    impresso em uma linha.
 */

package assignments.sortAndFiltering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class SortingEvenAndOddNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aux, n = Integer.parseInt(st.nextToken());

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            aux = Integer.parseInt(st.nextToken());

            if (aux % 2 == 0)
            {
                even.add(aux);
            } else
            {
                odd.add(aux);
            }
        }

        even.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        odd.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}