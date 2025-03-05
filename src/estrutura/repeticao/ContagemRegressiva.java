package estrutura.repeticao;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sua contagem regressiva vai começar em: ");
        int contagem = sc.nextInt();
        System.out.print("Marcar os multiplos de: ");
        int multiplos = sc.nextInt();

        while (contagem >= 0) {
            if (contagem % multiplos == 0) {
                System.out.print("[" +contagem+ "] - ");
            } else {
                System.out.print(+contagem+ " - ");
            }

            contagem = contagem -1;
        }

        System.out.println("Fim do programa");

        sc.close();
    }
}
