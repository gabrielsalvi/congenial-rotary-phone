/*
Desafio:
    Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro,
    e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso
    você deve atentar aos requisitos a seguir:

    - A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
    - A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
    - A senha pode ter de 6 a 32 caracteres.

Entrada:
    A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S,
    correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída:
    A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos
    solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 */

package assignments.searchAndReplace;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator
{
    private static boolean isValid(final String psw)
    {
        var passwordLength = psw.length();

        Pattern allowed = Pattern.compile("[a-zA-Z0-9]+");
        Pattern required = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");

        return passwordLength >= 6 && passwordLength <= 32 && allowed.matcher(psw).matches()
                && required.matcher(psw).matches();
    }

    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        while(scanner.hasNextLine())
        {
            String password = scanner.nextLine();

            if (isValid(password))
            {
                System.out.println("Senha valida.");
            }
            else
            {
                System.out.println("Senha invalida.");
            }
        }
    }
}