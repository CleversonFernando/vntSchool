package aula4;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        int numero2 = sc.nextInt();

        int soma = (numero1 + numero2);

        System.out.printf("Entrada: %d, %d      Saída: SOMA = %d", numero1, numero2, soma);

        sc.close();
    }
}
