package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que divide o valor de uma conta entre amigos.
 * Solicite ao usuário o valor total da conta e o número de amigos.
 * Calcule e exiba o valor que cada amigo deve pagar.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDivisaoConta {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da conta: R$ ");
        double valorTotalConta = sc.nextDouble();

        System.out.print("Digite o numero de amigos que vao dividir a conta: ");
        int numeroAmigos = sc.nextInt();

        double valorPorAmigo = valorTotalConta / numeroAmigos;

        System.out.printf("Cada amigo deve pagar: R$ %.2f%n", valorPorAmigo);

        sc.close();
    }
}
