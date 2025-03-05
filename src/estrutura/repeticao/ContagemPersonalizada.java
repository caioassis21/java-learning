package estrutura.repeticao;

import java.util.Scanner;

public class ContagemPersonalizada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Onde começa a contagem? ");
        int contador = sc.nextInt();

        System.out.print("Onde termina a contagem? ");
        int fimContagem = sc.nextInt();

        System.out.print("Qual vai ser o incremento? ");
        int incremento = sc.nextInt();

        while (contador <= fimContagem) {
            System.out.print(+contador + " - ");
            contador = contador + incremento;
        }

        System.out.println("Fim!");

    }
}
