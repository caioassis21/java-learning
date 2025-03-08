package estrutura.repeticao;

import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de valores a serem lidos.");
        int qtdeNumerosLidos = sc.nextInt();

        int cont = 1;
        int maior = 0;
        int menor = 0;


        while (cont <= qtdeNumerosLidos) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (cont == 1) {
                maior = numero;
                menor = numero;
            } else if (numero < menor) {

                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            cont = cont + 1;
        }

        System.out.println("O menor numero é " + menor);
        System.out.println("O maior numero é " + maior);

        sc.close();
    }
}
