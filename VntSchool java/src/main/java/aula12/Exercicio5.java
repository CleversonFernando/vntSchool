package aula12;

import java.util.Scanner;

public class Exercicio5 {

    private static void verificadorDeNegativos(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
                System.out.print("|" + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com na posição [" + i + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz inicial:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matriz sem elementos negativos:");
        verificadorDeNegativos(matriz);
        sc.close();
    }
}