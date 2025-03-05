package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que verifica se um número inserido pelo usuário é par ou ímpar.
 * Solicite ao usuário um número inteiro e use o operador % para determinar se o número é divisível por 2.
 * Exiba "O número é par" se o resto for zero, caso contrário, exiba "O número é ímpar".
 */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }

        sc.close();
    }
}
