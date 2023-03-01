package exerciciosAula;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A");
        double a = sc.nextDouble();
        System.out.println("Entre com o valor de B");
        double b = sc.nextDouble();
        System.out.println("Entre com o valor de C");
        double c = sc.nextDouble();

        double delta = calcularDelta(a, b, c);

        if (delta >= 0) {
            double xUm = calcularXUm(a, b, delta);
            double xDois = calcularXDois(a, b, delta);

            System.out.println("X': " + xUm);
            System.out.println("X'': " + xDois);

        } else {
            System.out.println("Valor de delta menor que zero não possuí raiz real!");
        }

        sc.close();
    }

    static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    static double calcularXUm(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    static double calcularXDois(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);

    }
}