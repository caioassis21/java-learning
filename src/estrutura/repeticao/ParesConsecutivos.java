package estrutura.repeticao;

import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();


        while (numero != 0) {

            if (numero % 2 != 0) {
                numero++;
            }

            int soma = 0;
            int contador = 0;


            while (contador < 5) {
                soma = soma + numero;
                numero = numero + 2;
                contador = contador + 1;
            }

            System.out.println("SOMA = " + soma);

            System.out.print("Digite um numero inteiro: ");
            numero = sc.nextInt();
        }

        sc.close();
    }
}