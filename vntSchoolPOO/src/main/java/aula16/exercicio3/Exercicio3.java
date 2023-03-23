package aula16.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int n = sc.nextInt();

        OperacaoMatematica operacaoMatematica = new OperacaoMatematica();
        System.out.println(operacaoMatematica.parOuImpar(n));
        System.out.println(operacaoMatematica.negativoOuPositivo(n));
    }
}
