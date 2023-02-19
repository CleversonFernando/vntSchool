package aula4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    private static double calculaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static double calculaCirculo(double raio) {
        return (Math.PI * Math.pow(raio, 2));
    }

    private static double calculaTrapezio(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    private static double calculaQuadrado(double lado) {
        return lado * lado;
    }

    private static double calculaRetangulo(double base, double altura) {
        return base * altura;
    }


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;


        System.out.println("Entre com o valor de A:");
        a = sc.nextDouble();
        System.out.println("Entre com o valor de B:");
        b = sc.nextDouble();
        System.out.println("Entre com o valor de C:");
        c = sc.nextDouble();
        triangulo = calculaTriangulo(a, c);
        circulo = calculaCirculo(c);
        trapezio = calculaTrapezio(a, b, c);
        quadrado = calculaQuadrado(b);
        retangulo = calculaRetangulo(a, b);

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
