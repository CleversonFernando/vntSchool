package aula8;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();
        String texto;

        if (numero % 2 == 0) {
            texto = "Par";
        } else {
            texto = "Impar";
        }
        System.out.println("O número é: " + texto);
    }
}
