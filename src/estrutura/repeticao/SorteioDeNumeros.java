package estrutura.repeticao;

import java.util.Scanner;

public class SorteioDeNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("------------------------\n");
        System.out.print("    Sorteio de numeros  \n");
        System.out.print("------------------------\n");

        int qtdeSorteio;
        int contador = 1;
        int soma = 0;
        int numeroAleatorio;

        System.out.print("Quantos numeros voce quer que eu sorteie: ");
        qtdeSorteio = sc.nextInt();

        while (contador <= qtdeSorteio) {
             numeroAleatorio = (int)(Math.random() * 10) + 1; // sorteia de 1 a 10
            System.out.println("O " + contador + "° valor foi: " +numeroAleatorio);
            soma = soma + numeroAleatorio;

            contador = contador +1;
        }

        System.out.println("A soma dos numeros sorteados é " + soma);

        sc.close();
    }
}
