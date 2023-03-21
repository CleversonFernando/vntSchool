package aula12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

    private static void ordenaVetor(int[] vetor) {
        int aux;
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[i]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre com o " + (i + 1) + "º número:");
            vetor[i] = sc.nextInt();
        }
        ordenaVetor(vetor);

        System.out.println(Arrays.toString(vetor));
        sc.close();
    }
}
