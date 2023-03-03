package aula8;

import java.util.Scanner;

public class Exercicio12 {

    static double menor;
    static double maior;
    static double medio;

    static void ordenador(double a, double b, double c) {
        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        }
        if (b >= a && b >= c) {
            maior = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        }
        if (c >= a && c >= b) {
            maior = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de I [1 a 3]:");
        System.out.println("Ordem crescente [1]:");
        System.out.println("Ordem decrescente [2]:");
        System.out.println("Ordem maior entre dois [3]:");
        int i = sc.nextInt();

        if (i != 1 && i != 2 && i != 3) {
            System.out.println("Valor deve ser entre 1 e 3!");
        } else {
            System.out.println("Entre com o valor de A:");
            double a = sc.nextInt();
            System.out.println("Entre com o valor de B:");
            double b = sc.nextInt();
            System.out.println("Entre com o valor de C:");
            double c = sc.nextInt();

            switch (i) {
                case 1:
                    ordenador(a, b, c);
                    System.out.println(menor + " , " + medio + " , " + maior);
                    break;
                case 2:
                    ordenador(a, b, c);
                    System.out.println(maior + " , " + medio + " , " + menor);
                    break;
                case 3:
                    ordenador(a, b, c);
                    System.out.println(menor + " , " + maior + " , " + medio);
                    break;
                default:
                    System.out.println("Valor deve ser entre 1 e 3!");

            }
        }
        sc.close();
    }
}
