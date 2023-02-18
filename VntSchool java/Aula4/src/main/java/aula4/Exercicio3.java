package aula4;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.println("Entre com o primeiro número:");
        numero1 = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        numero2 = sc.nextInt();

        soma = (numero1 + numero2);

        System.out.printf("Entrada: %d, %d      Saída: SOMA = %d", numero1, numero2, soma);

        sc.close();
    }
}
