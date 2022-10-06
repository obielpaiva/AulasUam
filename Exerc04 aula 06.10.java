package exerc04;

import java.util.Scanner;

public class Exerc04 {

    //Exercício04
//Desenvola um programa que receba o nome de três alunos em uma matriz string,
//em outra matriz (3x2) receba as notas da N1 e N2 e em um vetor (1x3) receba o 
//resultado do cálculo da média.Por fim, apresente o nome do aluno e a média 
//ponderada (N1*0,4+ N2*0,6)
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomes[][] = new String[3][1];
        double notas[][] = new double[3][2];
        double medias[] = new double[3];
        for (int linha = 0; linha < 3; linha++) {
            for (int colunas = 0; colunas < 2; colunas++) {
                if (colunas == 0) {
                    System.out.print("Digite o nome:");
                    nomes[linha][colunas] = entrada.next();
                    System.out.println("Digite a nota N1: ");
                    notas[linha][colunas] = entrada.nextDouble();
                } else {
                    System.out.println("Digite a nota N2: ");
                    notas[linha][colunas] = entrada.nextDouble();

                }
            }
            medias[linha] = notas[linha][0] * 0.4 + notas[linha][1] * 0.6;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("A media do(a) aluno " + nomes[i][0] + " e: " + medias[i]);

        }

    }

}
