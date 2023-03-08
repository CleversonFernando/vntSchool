package aula8;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();
        String indicadorParImpar = "";

        //recebe número positivo e classifica em par ou impar
        if (numero > 0) {
            if (numero % 2 == 0) {
                indicadorParImpar = "Par";
            } else {
                indicadorParImpar = "Impar";
            }
            System.out.println("O número é: " + indicadorParImpar);
        } else {
            System.out.println("Número deve ser positivo!");
        }

        sc.close();
    }
}
