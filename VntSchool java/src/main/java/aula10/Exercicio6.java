package aula10;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("linha: " + i + " quadrado: " + Math.pow(i, 2) + " cubo: " + Math.pow(i, 3));
        }
        sc.close();
    }
}

