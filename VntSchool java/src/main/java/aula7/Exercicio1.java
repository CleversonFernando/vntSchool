package aula7;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor em dinheiro:");
        double dinheiro = sc.nextDouble();
        if (dinheiro >= 30) {
            System.out.println("Vá ao cinema!");
        } else {
            System.out.println("Fique em casa!");
        }

        sc.close();
    }
}
