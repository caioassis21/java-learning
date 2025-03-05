package estrutura.repeticao;

/**
 * Fazer um programa que conta em ordem decrecente de 10 até 0
 */

public class ExemploWhile02 {
    public static void main(String[] args) {

        int numero = 10;

        while (numero >= 0) {
            System.out.print(+ numero + " - ");
            numero = numero - 1;
        }

        System.out.print("Fim do programa!");
    }
}
