package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
 * Calcule e imprima a média semestral.
 * Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0, 10]).
 * Cada nota deve ser validada separadamente.
 *
 * Exemplo 1:
 * Digite a primeira nota: 3.5
 * Digite a segunda nota: 10.0
 * MEDIA = 6.75
 *
 * Exemplo 2:
 * Digite a primeira nota: -3.5
 * Valor invalido! Tente novamente: 3.5
 * Digite a segunda nota: 11.0
 * Valor invalido! Tente novamente: 10.5
 * Valor invalido! Tente novamente: 10.0
 * MEDIA = 6.75
 */

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();
        while (nota01 < 0 || nota01 > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota01 = sc.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();
        while (nota02 < 0 || nota02 > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota02 = sc.nextDouble();
        }

        double media = (nota01 + nota02) / 2.0;

        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
