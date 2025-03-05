package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que calcula o IMC (Índice de Massa Corporal) e classifica o usuário em categorias:
 * - Abaixo de 18.5: Abaixo do peso.
 * - Entre 18.5 e 24.9: Peso normal.
 * - Entre 25 e 29.9: Sobrepeso.
 * - Acima de 30: Obesidade.
 * Use a fórmula: IMC = peso / (altura * altura).
 * Solicite ao usuário o peso (em kg) e a altura (em metros), calcule o IMC e exiba a classificação.
 */

import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("O seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }


        sc.close();

    }
}
