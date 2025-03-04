package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que converte um valor em reais (BRL) para dólares (USD).
 * Use uma taxa de câmbio fixa de 1 USD = 5 BRL.
 * Solicite ao usuário o valor em reais e exiba o valor convertido.
 */

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Reais: R$ ");
        double valorReais = sc.nextDouble();

        double taxaCambio = 5.00;
        double valorDolar =  valorReais / taxaCambio;

        System.out.printf("O valor em dolar é: $ %.2f%n", valorDolar);

        sc.nextDouble();


    }
}
