package estrutura.repeticao;


import java.util.Scanner;

public class RepeticaoComFlag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int idade = 0;
        int soma = 0;
        int cont = 1;
        int maior = 0;

        while (idade != 9999) {
            System.out.println("Digite a sua idade");
            idade = sc.nextInt();

            if (idade != 9999) {
                soma = soma + idade;
            }

            if (cont == 1) {
                maior = idade;
            } else if (idade > maior) {
                maior = idade;
            }

            cont = cont +1;


        }

        double media = (double) soma / cont;

        System.out.println("Ao todo voce digitou " + cont + "valores");
        System.out.println("A soma de todas as idades é: " + soma);
        System.out.printf("A média foi %.2f%n", media);
        System.out.printf("O maior valor digitado foi %d", maior);

        sc.close();
    }
}
