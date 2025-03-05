package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que verifica se três números inseridos pelo usuário podem formar um triângulo.
 * Para formar um triângulo, a soma de quaisquer dois lados deve ser maior que o terceiro lado.
 * Se for possível formar um triângulo, classifique-o como:
 * - Equilátero: todos os lados iguais.
 * - Isósceles: dois lados iguais.
 * - Escaleno: todos os lados diferentes.
 */

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triangulo: ");
        double lado01 = sc.nextDouble();
        System.out.print("Digite o segundo lado do triangulo: ");
        double lado02 = sc.nextDouble();
        System.out.print("Digite o terceiro lado do triangulo: ");
        double lado03 = sc.nextDouble();

        // Verifica se os lados formam um triangulo
        if (lado01 + lado02 > lado03 && lado01 + lado03 > lado02 && lado03 + lado02 > lado01) {
            System.out.println("Os lados formam um triangulo");

            if (lado01 == lado02 && lado01 == lado03) {
                System.out.println("O triangulo é equilatero");
            } else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03) {
                System.out.println("O triangulo e isosceles");

            } else {
                System.out.println("O triangulo é escaleno");
            }
        } else {
            System.out.println("Os lados não formam um triangulo");
        }


        sc.close();

    }
}
