package estrutura.repeticao;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print("Informe  um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = sc.nextInt();
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool = alcool + 1;
                    break;

                case 2:
                    gasolina = gasolina + 1;
                    break;

                case 3:
                    diesel = diesel + 1;
                    break;
            }
            System.out.print("Informe  um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
