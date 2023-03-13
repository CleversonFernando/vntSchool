package aula12;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        boolean confirma = true;
        System.out.println(numeroAleatorio);
        do {
            System.out.println("Entre com um número:");
            int numero = sc.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Você acertou!");
                confirma = false;
            } else {
                if (numero < numeroAleatorio) {
                    System.out.println("O número verdadeiro é maior");
                } else {
                    System.out.println("O número verdadeiro é menor");
                }
            }
        } while (confirma);

        sc.close();
    }
}