package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "notas"
 * <p>
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro
 * e segundo semestres de uma disciplina anual. Em seguida, mostrar a nota
 * final que o aluno obteve (com uma casa decimal) no ano, juntamente com
 * um texto explicativo. Caso a nota final do aluno seja inferior a 60.00,
 * mostrar a mensagem "REPROVADO".
 */

public class ProblemaNotas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();

        double notaFinal = nota01 + nota02;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
        if (notaFinal >= 60) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();

    }
}
