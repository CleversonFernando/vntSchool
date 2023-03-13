package aula12;

import java.util.Scanner;

public class Exercicio4 {

    private static int somarDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        return soma;
    }

    private static int somarElementosColuna2(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma = soma + matriz[i][1];
        }
        return soma;
    }

    private static int somarElementosLinha3(int[][] matriz) {
        int soma = 0;
        for (int j = 0; j < 3; j++) {
            soma = soma + matriz[2][j];
        }
        return soma;
    }

    private static int somarTodosElementos(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com na posição [" + i + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Soma de todos os elementos: " + somarTodosElementos(matriz));
        System.out.println("Soma dos elementos linha 3: " + somarElementosLinha3(matriz));
        System.out.println("Soma dos elementos coluna 2: " + somarElementosColuna2(matriz));
        System.out.println("Soma dos elementos diagonal principal " +somarDiagonalPrincipal(matriz));

        sc.close();
    }
}