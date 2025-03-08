package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaParesEImpares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 1;
        int somaPares = 0;
        int contPares = 0;
        int somaImpares = 0;
        int contImpares = 0;

        while (contador <= 5 ) {

            System.out.print("Digite o " + contador + " º valor: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                somaPares = somaPares + numero;
                contPares = contPares +1;
            }

            else {
                somaImpares = somaImpares + numero;
                contImpares = contImpares +1;
            }

            contador = contador +1;
        }

        double mediaPares = (double) somaPares / contPares;
        double mediaImpares = (double) somaImpares / contImpares;

        System.out.printf("Voce digitou %d numeros pares. A média é %.2f%n", contPares, mediaPares);
        System.out.printf("Voce digitou %d numeros impares. A média é %.2f%n", contImpares, mediaImpares);

        sc.close();
    }
}
