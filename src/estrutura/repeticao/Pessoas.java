package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vamos cadastrar? ");
        int numeroPessoas = sc.nextInt();

        System.out.print("Qual é o peso de referencia? ");
        double pesoReferencia = sc.nextDouble();

        int contador = 1;
        double peso;

        int pessoasForaLimite = 0;
        int mulheresForaLimite = 0;
        int homensForaLimite = 0;


        char sexo;

        while (contador <= numeroPessoas) {
            System.out.println("-----------------------------------------------------");
            System.out.println("      Pessoa " + contador + " de " + numeroPessoas);
            System.out.println("-----------------------------------------------------");

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);

            if (peso > pesoReferencia) {
                pessoasForaLimite = pessoasForaLimite + 1;
                if (sexo == 'f' || sexo == 'F') {
                    mulheresForaLimite = mulheresForaLimite + 1;
                } else if (sexo == 'm' || sexo == 'M') {
                    homensForaLimite = homensForaLimite + 1;
                }

                System.out.printf("======== Peso acima do limite ( %.1f kg) =======%n", pesoReferencia);
            } else {
                System.out.printf("======== Peso dentro do limite (%.1f kg) =======%n", pesoReferencia);
            }

            contador = contador + 1;
        }

        System.out.printf("\nAo todo temos %d pessoas acima do limite de %.1f " +
                "kg%n", pessoasForaLimite, pesoReferencia);

        System.out.printf("E dessas pessoas, %d são HOMENS e %d sao " +
                "MULHERES%n", homensForaLimite, mulheresForaLimite);


        sc.close();
    }
}
