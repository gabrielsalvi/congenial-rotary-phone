/*
Desafio:
    Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de
    pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais:
    o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos
    em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por
    Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

    Tesoura corta papel; Papel cobre pedra; Pedra derruba lagarto; Lagarto adormece Spock;
    Spock derrete tesoura; Tesoura prende lagarto; Lagarto come papel; Papel refuta Spock;
    Spock vaporiza pedra; Pedra quebra tesoura.

    Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta
    brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar
    ou se dará empate.

Entrada:
    Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade
    de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia,
    respectivamente.

Saída:
    Para cada caso de teste, imprima quem venceu, ou se houve empate.
 */

package assignments.searchAndReplace;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockScissorsPaperLizardSpock
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++)
        {
            String word1 = scanner.next();
            String word2 = scanner.next();

            System.out.println(Game.getWinner(word1, word2));
        }
    }
}

class Game
{
    private static final Map<String, String[]> rules = new HashMap<>();

    static {
        rules.put("pedra", new String[]{"tesoura", "lagarto"});
        rules.put("tesoura", new String[]{"papel", "lagarto"});
        rules.put("papel", new String[]{"pedra", "spock"});
        rules.put("lagarto", new String[]{"papel", "spock"});
        rules.put("spock", new String[]{"pedra", "tesoura"});
    }

    public static String getWinner(String a, String b)
    {
        for (int i = 0; i < rules.get(a).length; i++)
        {
            if (rules.get(a)[i].equals(b))
            {
                return "fernanda";
            }
            else if (rules.get(b)[i].equals(a))
            {
                return "marcia";
            }
        }

        return "empate";
    }
}