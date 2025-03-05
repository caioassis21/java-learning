package estrutura.repeticao;

import java.util.Scanner;

public class JogoDoPin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("-----------------------\n");
        System.out.print("     Jogo do Pin!      \n");
        System.out.print("-----------------------\n");

        System.out.print("Quer contar até quanto? ");
        int fimContador = sc.nextInt();

        int cont = 1;

        while (cont <= fimContador) {
            if (cont % 4 != 0) {
                System.out.print(+cont + " - ");
            }
            else {
                System.out.print("PIN! - ");

            }

            cont = cont +1;
        }

        System.out.println("Fim!");
    }
}
