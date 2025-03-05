package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que verifica se um ano inserido pelo usuário é bissexto.
 * Um ano é bissexto se:
 * - É divisível por 4 e não é divisível por 100, ou
 * - É divisível por 400.
 */

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para verificar se ele é bissexto: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }

        
        sc.close();
    }
}
