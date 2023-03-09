package aula11;

public class Exercicio1 {

    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{7, 8}, {10, 11}};
        int[][] matrizResposta = new int[2][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResposta[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(" | " + matrizResposta[i][j]);
            }
            System.out.println();
        }
    }
}