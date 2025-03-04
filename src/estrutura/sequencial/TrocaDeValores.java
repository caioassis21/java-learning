package estrutura.sequencial;
/*
 * ENUNCIADO:
 * Escreva um programa que troca os valores de duas variáveis.
 * Solicite ao usuário dois números, troque os valores das variáveis e exiba os novos valores.
 */

import java.util.Scanner;

public class TrocaDeValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor01 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor02 = sc.nextInt();

        int aux = valor01;
        valor01 = valor02;
        valor02 = aux;

        System.out.println("Valores após a troca:");
        System.out.println("primeiro valor: " +valor01);
        System.out.println("Ssegundo valor: " +valor02);

        sc.close();

    }
}
