package aula12;

import java.util.Scanner;

public class Exercicio3 {

    private static void verificadorParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é impar!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();

        verificadorParImpar(numero);

        sc.close();
    }
}



