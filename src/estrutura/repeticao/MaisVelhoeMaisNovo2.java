package estrutura.repeticao;

import java.util.Scanner;

public class MaisVelhoeMaisNovo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int idade;
        int totalMasculino = 0;
        int totalFeminino = 0;
        int idadeHomemMaisVelho = 0;
        int idadehomemMaisNovo = 0;
        int idadeMulherMaisVelha = 0;
        int idadeMulherMaisNova = 0;

        char sexo;

        String nome;
        String homemMaisVelho = "";
        String homemMaisNovo = "";
        String mulherMaisVelha = "";
        String mulherMaisNova = "";

        while (contador <= 4) {
            System.out.println("----------------------------------------");
            System.out.println("              " + contador + "º pessoa");
            System.out.println("----------------------------------------");

            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);
            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (sexo == 'm' || sexo == 'M') {
                totalMasculino = totalFeminino + 1;
                if (totalMasculino == 1) {
                    idadehomemMaisNovo = idade;
                    homemMaisNovo = nome;
                    idadeHomemMaisVelho = idade;
                    homemMaisVelho = nome;

                } else {
                    if (idade < idadehomemMaisNovo) {

                            idadehomemMaisNovo = idade;
}
                    homemMaisNovo = nome;

                }
                if (idade > idadeHomemMaisVelho) {
                    idadeHomemMaisVelho = idade;
                    homemMaisVelho = nome;
                }

            } else if (sexo == 'f' || sexo == 'F') {
                totalFeminino = totalFeminino + 1;
                if (totalFeminino == 1) {
                    idadeMulherMaisNova = idade;
                    mulherMaisNova = nome;
                    idadeMulherMaisVelha = idade;
                    mulherMaisVelha = nome;

                } else if (idade < idadeMulherMaisNova) {

                    idadeMulherMaisNova = idade;
                    mulherMaisNova = nome;

                }
                if (idade > idadeMulherMaisVelha) {
                    idadeMulherMaisVelha = idade;
                    mulherMaisVelha = nome;
                }

            }

            contador = contador + 1;

        }

        System.out.printf("Ao todo tivemos %d homens e %d mulheres cadastradas", totalMasculino,
                totalFeminino);

        System.out.printf("%nA mulher mais jovem é a %s que tem %d anos%n", mulherMaisNova,
                idadeMulherMaisNova);

        System.out.printf("A mulher mais velha é a %s que tem %d anos%n", mulherMaisVelha,
                idadeMulherMaisVelha);

        System.out.printf("O homem mais jovem é o %s que tem %d anos%n", homemMaisNovo,
                idadehomemMaisNovo);

        System.out.printf("O homem mais velho é o %s que tem %d anos%n", homemMaisVelho, idadeHomemMaisVelho);

        sc.close();
    }
}

