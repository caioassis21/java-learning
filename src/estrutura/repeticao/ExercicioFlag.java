package estrutura.repeticao;

/**
 * Faça um programa que leia vários números (o valor 9999 faz o programa parar)
 * no final de tudo, mostre na tela:
 * - Quantos valores foram digitados
 * - A soma dos valores
 * - A média dos valores
 * - Qual foi o maior valor digitado
 * OBS: Não considere o flag como pate dos dados
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFlag {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 0;
        int soma = 0;
        int maior = 0;


        while (numero != 9999) {
            System.out.println("---------------------------------");
            System.out.println( + (cont +1) + " valor [9999 faz parar]");
            System.out.println("---------------------------------");

            System.out.print("numero: ");
            numero = sc.nextInt();

            if (numero != 9999) {
                soma = soma + numero;
                if (cont == 0) {
                    maior = numero;
                } else {
                    if (numero > cont) {
                        maior = numero;
                    }
                }

                cont = cont +1;
            }



        }

        System.out.println("================= FLAG DIGITADO ====================");

        double media = (double) soma / cont;

        System.out.printf("Ao todo voce digitou %d valores%n", cont);
        System.out.printf("A soma entre eles foi %d%n", soma);
        System.out.printf("E a média foi: %.2f%n", media);
        System.out.printf("O maior valor digitado foi %d", maior);

        sc.close();
    }
}
