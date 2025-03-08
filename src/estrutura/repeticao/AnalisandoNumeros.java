package estrutura.repeticao;

import java.util.Scanner;

public class AnalisandoNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vou sortear? ");
        int qtdeNumeros = sc.nextInt();

        int cont = 1;
        int numeroSorteado;
        int maiorQueCinco = 0;
        int divisivelPor3 = 0;

        System.out.print("Sorteando " + qtdeNumeros + " numeros...");

        while (cont <= qtdeNumeros) {
            numeroSorteado = (int) (Math.random() * 9) + 1; // sorteia de 1 a 10
            if (numeroSorteado > 5) {
                maiorQueCinco = maiorQueCinco + 1;
            }

            if (numeroSorteado % 3 == 0) {
                divisivelPor3 = divisivelPor3 + 1;
            }

            System.out.print(+ numeroSorteado + "..");

            cont = cont +1;
        }

        System.out.printf("%n%nDos %d numeros sorteados%n", qtdeNumeros);
        System.out.printf("%d são maiores que cinco%n", maiorQueCinco);
        System.out.printf("%d são divisiveis por tres%n", divisivelPor3);

        sc.close();

    }
}
