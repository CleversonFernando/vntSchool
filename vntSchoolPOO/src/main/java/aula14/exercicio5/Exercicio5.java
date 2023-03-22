package aula14.exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        boolean valoresCorretos;

        do {
            System.out.println("Entre com o valor da altura:");
            retangulo.setAltura(sc.nextDouble());
            System.out.println("Entre com o valor da largura:");
            retangulo.setLargura(sc.nextDouble());
            if (retangulo.getAltura() <= 0 || retangulo.getLargura() <= 0) {
                System.out.println("Favor inserir valores válidos!");
                valoresCorretos = false;
            } else {
                valoresCorretos = true;
            }
        } while (!valoresCorretos);

        System.out.printf("Area %.2f%n", retangulo.calcularArea());
        System.out.printf("Perímetro %.2f%n", retangulo.calcularPerimetro());
        System.out.printf("Diagonal %.2f%n ", retangulo.calcularDiagonal());

        sc.close();
    }
}