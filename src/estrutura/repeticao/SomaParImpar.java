package estrutura.repeticao;

import java.util.Scanner;

public class SomaParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("-----------------------\n");
        System.out.print("    Soma par e impar  \n");
        System.out.print("-----------------------\n");

        int contador = 1;
        int numero;
        int numeroPar;
        int numeroImpar;
        int somaPar = 0;
        int somaImpar = 0;

        while (contador <= 5) {
            System.out.print(" Digite o " + contador + "° valor: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                somaPar = somaPar + numero;
            } else {
                somaImpar = somaImpar + numero;
            }

            contador = contador + 1;
        }

        System.out.println("A soma dos pares é " + somaPar);
        System.out.println("A soma dos Impares é " + somaImpar);

        sc.close();

    }
}

