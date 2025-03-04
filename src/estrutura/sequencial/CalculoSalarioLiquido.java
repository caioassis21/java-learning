package estrutura.sequencial;

/*
 * ENUNCIADO:
 * Escreva um programa que calcula o salário líquido de um funcionário após descontos.
 * Considere os seguintes descontos fixos:
 * - INSS: 10% do salário bruto.
 * - Imposto de Renda: 7% do salário bruto.
 * Solicite ao usuário o salário bruto e exiba o salário líquido.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = sc.nextDouble();

        double impostoInss = (salarioBruto * 10) / 100;
        double impostoRenda = (salarioBruto * 7) / 100;

        double salarioLiquido = salarioBruto - impostoInss - impostoRenda;

        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        sc.close();


    }
}
