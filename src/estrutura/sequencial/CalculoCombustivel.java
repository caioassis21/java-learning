package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que calcula o consumo médio de combustível de um carro.
 * Solicite ao usuário a distância percorrida (em km) e a quantidade de combustível gasta (em litros).
 * Exiba o consumo médio em km/l.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Digite a quantidade de combustível gasta (litros): ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = (double) distancia / combustivelGasto;

        System.out.printf("Consumo médio: %.2f km/l%n", consumoMedio);

        sc.close();


    }
}
