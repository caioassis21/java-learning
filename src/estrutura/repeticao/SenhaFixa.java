package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:".
 * Quando a senha for informada corretamente, deve ser impressa a mensagem "Acesso Permitido" e o
 *  algoritmo encerrado.
 * Considere que a senha correta é o valor 2002.
 *
 * Exemplo:
 * Digite a senha: 2312
 * Senha Invalida! Tente novamente:
 * 2010
 * Senha Invalida! Tente novamente:
 * 1022
 * Senha Invalida! Tente novamente:
 * 2002
 * Acesso Permitido
 */

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != senhaCorreta) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
