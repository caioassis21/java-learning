package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Faça um programa que leia dois operandos de uma expressão e mostre
 * um menu que perimta o usuario escolher que opção ele quer realizar:
 * [1] Adição
 * [2] Subtração
 * [3] Multiplicção
 * [4] Entrar com novos dados
 * [5] Sair
 */


import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Operando 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Operando 2: ");
        int numero2 = sc.nextInt();

        int escolha = 0;
        int resposta;

        while (escolha != 5) {
            System.out.println("====== Escolha uma operação ========");
            System.out.println("[ 1 ] - Adição");
            System.out.println("[ 2 ] - Subtração");
            System.out.println("[ 3 ] - Multiplicação");
            System.out.println("[ 4 ] - Entrar com novos dados");
            System.out.println("[ 5 ] - Sair");
            System.out.print("Escreva sua opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:// Adição
                    resposta = numero1 + numero2;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Calculando: " + numero1 + " + " +numero2+ " = " + resposta);
                    System.out.println("-------------------------------------------------");
                    break;

                case 2: // Subtracao
                    resposta = numero1 - numero2;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Calculando: " + numero1 + " - " +numero2+ " = " + resposta);
                    System.out.println("-------------------------------------------------");
                    break;

                case 3:
                    resposta = numero1 * numero2;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Calculando: " + numero1 + " + " +numero2+ " = " + resposta);
                    System.out.println("-------------------------------------------------");
                    break;

                case 4:
                    System.out.print("Operando 1: ");
                    numero1 = sc.nextInt();
                    System.out.print("Operando 2: ");
                    numero2 = sc.nextInt();
                    break;

                case 5:
                    System.out.println("================== Saindo ======================");
                    break;

                default:
                    System.out.println("Opção invalida.");
                    break;

            }
        }

        System.out.println("======== Volte Sempre!==========");


    }
}
