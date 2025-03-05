package estrutura.repeticao;

import java.util.Scanner;

public class CalculoEmLaco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 1;
        int numero;
        int soma = 0;
        int contFinal;

        System.out.print("Quantas numeros voce vai informar? ");
        contFinal = sc.nextInt();

        while (cont <= contFinal) {
            System.out.println("Digite um numero: ");
             numero = sc.nextInt();
             soma = soma + numero;

             cont = cont +1;
        }

        double media = (double) soma / cont;

        System.out.println("A soma dos numeros é: " + soma);
        System.out.printf("A media dos numeros é: %.2f%n", media);

        sc.close();
    }
}
