/*
Desafio:
    Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer
    parte da string, inclusive ela toda. Se não houver subsequência comum, a saída deve ser “0”. A
    comparação é case sensitive ('x' != 'X').

Entrada:
    A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma
    contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '),
    inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
    O tamanho da maior subsequência comum entre as duas Strings.
*/

package assignments.searchAndReplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestSubstring
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        String biggest, smallest;

        while ((biggest = br.readLine()) != null)
        {
            smallest = br.readLine();

            if (biggest.length() < smallest.length())
            {
                var aux = biggest;
                biggest = smallest;
                smallest = aux;
            }

            int cont = smallest.length();
            boolean check = true;

            while (cont > 0 && check)
            {
                int diff = smallest.length() - cont;

                for (int i = 0; i <= diff; i++)
                {
                    if (biggest.contains(smallest.substring(i, i + cont)))
                    {
                        cont++;
                        check = false;
                        break;
                    }
                }
                cont--;
            }
            System.out.println(cont);
        }
    }
}