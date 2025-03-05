package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que solicita três números ao usuário e determina qual é o maior.
 * Exiba o maior número ou uma mensagem informando se há números iguais
 *  (caso dois ou mais números sejam iguais).
 */

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int numero03 = sc.nextInt();


        if (numero01 == numero02 || numero01 == numero03 || numero02 == numero03) {
            System.out.println("Há numeros iguais");
        } else if (numero01 > numero02 && numero01 > numero03) {
            System.out.println("O numero " + numero01 + " é maior");
        } else if (numero02 > numero01 && numero02 > numero03) {
            System.out.println("O numero " + numero02 + " é maior");
        } else {
            System.out.println("O numero " + numero03 + " é maior");
        }

        sc.close();
    }


}
