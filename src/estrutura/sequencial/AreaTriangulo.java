package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que calcula a área de um triângulo com base na fórmula:
 * area = (base * altura) / 2.
 * Solicite ao usuário a base e a altura do triângulo e exiba a área.
 */

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triangulo: ");
        double baseTriangulo = sc.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        double alturaTriangulo = sc.nextDouble();

        double area = (baseTriangulo * alturaTriangulo) / 2;

        System.out.printf("A área do triângulo é: %.2f%n", area);
    }

}
