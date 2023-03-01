package aula4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    static double calculaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    static double calculaCirculo(double raio) {
        return (Math.PI * Math.pow(raio, 2));
    }

    static double calculaTrapezio(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    static double calculaQuadrado(double lado) {
        return lado * lado;
    }

    static double calculaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A:");
        double a = sc.nextDouble();
        System.out.println("Entre com o valor de B:");
        double b = sc.nextDouble();
        System.out.println("Entre com o valor de C:");
        double c = sc.nextDouble();
        double triangulo = calculaTriangulo(a, c);
        double circulo = calculaCirculo(c);
        double trapezio = calculaTrapezio(a, b, c);
        double quadrado = calculaQuadrado(b);
        double retangulo = calculaRetangulo(a, b);

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
