package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que calcula o montante final com juros simples.
 * Solicite ao usuário o capital inicial, a taxa de juros mensal (em %) e o tempo (em meses).
 * Use a fórmula: montante = capital + (capital * taxa * tempo).
 * Exiba o montante final.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraJurosSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do capital inicial: ");
        double capitalInicial = sc.nextDouble();

        System.out.print("Digite o valor da taxa de juros mensal (%) : ");
        double taxaJurosMensal = sc.nextDouble() / 100 ;

        System.out.print("Digite o tempo (em meses): ");
        int tempo = sc.nextInt();

        double montante = capitalInicial + (capitalInicial * taxaJurosMensal * tempo);

        System.out.printf("Montante Final: %.2f%n", montante);

        sc.close();


    }
}
