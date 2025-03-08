package estrutura.repeticao;

import java.util.Scanner;

public class MaisVelhoMaisNovo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int idade;
        int maiorIdade = 0;
        int menorIdade = 0;

        String nome;
        String nomeMaiorIdade = "";
        String nomeMenorIdade = "";


        while (contador <= 3) {
            System.out.println("----------------------------------------");
            System.out.println("              " + contador + "º pessoa");
            System.out.println("----------------------------------------");

            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (contador == 1) {
                menorIdade = idade;
                nomeMenorIdade = nome;
                maiorIdade = idade;
                nomeMaiorIdade = nome;

            } else if (idade < menorIdade) {
                menorIdade = idade;
                nomeMenorIdade = nome;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaiorIdade = nome;
            }

            contador = contador +1;

        }

        System.out.printf("\nA pessoa mais jovem é %s que tem %d anos%n", nomeMenorIdade, menorIdade);
        System.out.printf("A pessoa mais velha é %s que tem %d anos%n", nomeMaiorIdade, maiorIdade);

        sc.close();
    }
}
