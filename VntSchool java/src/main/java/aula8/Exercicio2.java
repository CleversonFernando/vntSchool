package aula8;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();
        String indicadorParImpar;
        String indicadorPositivoNegativo;

        if (numero % 2 == 0) {
            indicadorParImpar = "Par";
        } else {
            indicadorParImpar = "Impar";
        }
        if (numero < 0) {
            indicadorPositivoNegativo = "Negativo";
        } else if (numero > 0) {
            indicadorPositivoNegativo = "Positivo";
        } else {
            indicadorPositivoNegativo = "igual a zero";
        }
        System.out.println("O número é: " + indicadorParImpar + " e " + indicadorPositivoNegativo);

        sc.close();
    }
}
