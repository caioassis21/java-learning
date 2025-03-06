package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class CalculoEmLaco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int totalNumerosInformados;
        int contador = 1;
        int numero;


        System.out.print("Quantas numeros voce vai informar? ");
        totalNumerosInformados = sc.nextInt();

        while (contador <= totalNumerosInformados) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            soma = soma + numero;
            contador = contador + 1;

        }

        System.out.println("A soma foi: " + soma);

        double media = (double) soma / totalNumerosInformados;

        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}

