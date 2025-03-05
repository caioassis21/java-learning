package estrutura.condicional;

/*
 * ENUNCIADO:
 * Escreva um programa que solicita ao usuário a nota de um aluno (de 0 a 100) e classifica-o conforme abaixo:
 * - Nota >= 90: A (Excelente)
 * - Nota >= 75: B (Bom)
 * - Nota >= 60: C (Regular)
 * - Nota >= 40: D (Precisa melhorar)
 * - Nota < 40: F (Reprovado)
 * Exiba a classificação correspondente.
 */

import java.util.Locale;
import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        String status;

        if (nota >= 90) {
            status = "A (Excelente)";
        } else if (nota >= 75) {
            status = "B (Bom)";
        } else if (nota >= 60) {
            status = "C (Regular)";
        } else if (nota >= 40) {
            status = "D (Precisa melhorar)";
        } else {
            status = "F (Reprovado)";
        }

        System.out.println("Status: " + status);

        sc.close();

    }
}
