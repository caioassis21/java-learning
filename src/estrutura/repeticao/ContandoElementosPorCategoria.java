package estrutura.repeticao;

import java.util.Objects;
import java.util.Scanner;

public class ContandoElementosPorCategoria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de pessoas que tem no evento: ");
        int numeroPessoas = sc.nextInt();

        int contador = 1;
        int mulheres = 0;
        int homens = 0;




        while (contador <= numeroPessoas) {

            System.out.println("Digite o seu sexo (F - feminino  e M - masculino): ");
            String sexo = sc.next();

            if (Objects.equals(sexo, "M") || Objects.equals(sexo, "m")) {
                homens = homens +1;
            }

            if (Objects.equals(sexo, "F") || Objects.equals(sexo, "f")) {
                mulheres = mulheres +1;
            }

            contador = contador+1;



        }

        System.out.println("Total de pessoas: " +numeroPessoas);
        System.out.println("Total de homens: " + homens);
        System.out.println("Total de mulheres: " + mulheres);

        sc.close();
    }

}
