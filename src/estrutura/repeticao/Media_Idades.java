package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a
 * idade de um indivíduo.
 * O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
 * Calcular e imprimir a idade média deste grupo de indivíduos.
 * Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
 */

import java.util.Locale;
import java.util.Scanner;

public class Media_Idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade;
        int somaIdade = 0;
        int contador = 0;

        System.out.println("Digite as idades:");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Impossivel calcular");
        } else {
            while (idade >= 0) {
                somaIdade = somaIdade + idade;
                contador = contador +1;
                idade = sc.nextInt();
            }

            double media = (double) somaIdade / contador;

            System.out.printf("MEDIA = %.2f%n", media);

            sc.close();
        }

    }
}