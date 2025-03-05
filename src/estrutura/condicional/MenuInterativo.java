package estrutura.condicional;

/*
 * ENUNCIADO:
 * Crie um programa que exibe um menu interativo com as seguintes opções:
 * 1. Calcular IMC.
 * 2. Verificar par ou ímpar.
 * 3. Sair.
 * O programa deve solicitar ao usuário que escolha uma opção e executar a ação correspondente:
 * - Para a opção 1, calcule o IMC conforme descrito no exercício anterior.
 * - Para a opção 2, verifique se um número é par ou ímpar conforme descrito no primeiro exercício.
 * - Para a opção 3, encerre o programa.
 * Caso o usuário insira uma opção inválida, exiba "Opção inválida!".
 */

import java.util.Locale;
import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEscolha uma das opções: ");
        System.out.println("1 - Calcular IMC");
        System.out.println("2 - Verificar se um numero é par ou impar");

        int escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                System.out.print("\nDigite o seu peso (em kg): ");
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

                break;

            case 2:
                System.out.print("\nDigite um numero: ");
                int numero = sc.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O numero " + numero + " é par!");
                } else {
                    System.out.println("O numero " + numero + " é impar!");
                }

                break;

            default:
                System.out.println("Opção inválida!");

        }

        sc.close();
    }
}
