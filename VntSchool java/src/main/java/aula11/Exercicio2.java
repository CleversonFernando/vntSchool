package aula11;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int primeiro = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        int segundo = sc.nextInt();

        imprimir("soma " , somar(primeiro, segundo));
        imprimir("multiplicação " , multiplicar(primeiro, segundo));
        imprimir("dobro primeiro " , dobro(primeiro));
        imprimir("dobro segundo " , dobro(segundo));
    }
    private static void imprimir(String x , int variavel) {

        System.out.println("Resultado " + x + variavel);
    }
    private static int dobro(int valor) {
        return multiplicar(valor, 2);
    }

    private static int multiplicar(int primeiro, int segundo) {
        return primeiro * segundo;
    }

    private static int somar(int primeiro, int segundo) {
        return primeiro + segundo;
    }
}
