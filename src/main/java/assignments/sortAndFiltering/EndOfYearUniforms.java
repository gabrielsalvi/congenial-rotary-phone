/*
Desafio:
    O professor Girafales organizou a confecção de um uniforme para as
    turmas da escola para comemorar o final do ano. Após algumas conversas,
    ficou decidido com os alunos que eles poderiam escolher a cor do uniforme
    entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para
    organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando
    estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada:
    - Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que
    indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2
    linhas contém informações de cada um dos uniformes (serão duas linhas de informação
    para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha
    irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho
    do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e
    esta valor não deverá ser processado.

Saída:
    - Para cada caso de entrada deverão ser impressas as informações ordenadas pela
    cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último
    por ordem ascendente de nome.
*/

package assignments.sortAndFiltering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class EndOfYearUniforms
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<TShirt> list = new ArrayList<>();

        var n = Integer.parseInt(st.nextToken());

        while (n > 0)
        {
            var name = br.readLine();
            var tShirtDetails = br.readLine().split(" ");

            list.add(new TShirt(name, tShirtDetails[0], tShirtDetails[1]));

            n--;
        }

        Comparator<TShirt> comparator = Comparator
                .comparing(TShirt::getColor).reversed()
                .thenComparing(TShirt::getSize).reversed()
                .thenComparing(TShirt::getOwner);

        list.stream().sorted(comparator).forEach(System.out::println);
    }
}

class TShirt
{
    private String size;
    private String color;
    private String owner;

    public TShirt (String owner, String color, String size)
    {
        this.owner = owner;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}