package estrutura.repeticao;

/*
 * ENUNCIADO:
 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a
 * idade de um indivíduo.
 * O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
 * Calcular e imprimir a idade média deste grupo de indivíduos.
 * Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
 */

import java.util.Locale;
import java.util.Scanner;

public class Media_Idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Impossivel Calcular");
        }

        else {

        }
    }
}
