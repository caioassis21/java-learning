package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em
 *  ordem crescente ou decrescente.
 * O programa deve finalizar quando forem digitados dois valores iguais.
 *
 * Exemplo:
 * Digite dois numeros: 5
 * 4
 * DECRESCENTE!
 *
 * Digite outros dois numeros: 3
 * 8
 * CRESCENTE!
 *
 * Digite outros dois numeros: 2
 * 2
 */

import java.util.Scanner;

public class ProblemaCrescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num1 != num2) {
            if (num1 > num2) {
                System.out.println("DECRESCENTE!");
            } else {
                System.out.println("CRESCENTE!");
            }

            System.out.println("Digite outros dois numeros:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        sc.close();
    }
}
