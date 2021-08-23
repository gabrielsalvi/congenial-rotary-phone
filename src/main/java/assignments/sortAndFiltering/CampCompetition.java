/* 
Desafio: 
    Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias 
    por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, 
    sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e 
    executar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc. No primeiro 
    dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo 
    (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um
    aluno, que seria o vencedor. No momento em que entra no círculo, cada aluno recebe uma pequena 
    ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno 
    que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o primeiro 
    detém. O aluno onde o número contado cair, deve ser retirado do grupo, e a contagem inicia novamente 
    segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante, quando o valor 
    que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha 
    é ímpar, a contagem é feita no sentido anti-horário. Desenvolva um programa para que no próximo evento 
    o responsável pela brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo, com 
    base nas informações fornecidas.

Entrada:
    A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro 
    N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as
    N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que 
    consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo 
    inicial. OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras 
    maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número 
    zero.

Saída:
    Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o 
    sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.
*/

package assignments.sortAndFiltering;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampCompetition
{
    public static int setCurrentPosition(final int value, final int removePosition, final int sizeOfStudents)
    {
        if (value % 2 == 0)
        {
            if (removePosition <= sizeOfStudents - 1)
                return removePosition;
            else
                return 0;
        }
        else
        {
            if (removePosition == 0)
                return sizeOfStudents - 1;
            else
                return removePosition - 1;
        }
    }

    public static int setRemovePosition(final int value, final int currentPosition, final int sizeOfStudents)
    {
        if (value % 2 == 0)
            return (sizeOfStudents - (value % sizeOfStudents) + currentPosition) % sizeOfStudents;
        else
            return (value % sizeOfStudents + currentPosition) % sizeOfStudents;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        List<Student> students;

        int numOfStudents = Integer.parseInt(scanner.next());

        while (numOfStudents > 0)
        {
            students = new ArrayList<>();

            for (int i = 0; i < numOfStudents; i++)
            {
                students.add(new Student(scanner.next(), Integer.parseInt(scanner.next())));
            }

            int sizeOfStudents = students.size();
            int removePosition, currentPosition = 0;
            int value = students.get(currentPosition).getNumber();

            for (int i = 0; i < numOfStudents - 1; i++)
            {
                removePosition = setRemovePosition(value, currentPosition, sizeOfStudents);

                value = students.get(removePosition).getNumber();
                students.remove(removePosition);

                sizeOfStudents = students.size();

                currentPosition = setCurrentPosition(value, removePosition, sizeOfStudents);
            }

            System.out.println("Vencedor(a): " + students.get(0).getName());

            numOfStudents = Integer.parseInt(scanner.next());
        }

        scanner.close();
    }
}

class Student
{
    private final String name;
    private final int number;

    public Student(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}