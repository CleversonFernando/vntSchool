package aula3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;
        String unidade;

        System.out.println("Digite os valores de um triangulo retângulo:");
        System.out.println("Qual a unidade de medida?");
        unidade = sc.nextLine();
        System.out.println("Digite o valor da base:");
        base = sc.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura = sc.nextDouble();

        //calcular area do triangulo

        area = (base*altura) / 2;

        System.out.println("Valor da base: " + base + unidade + "²");
        System.out.println("Valor da altura: " + altura + unidade + "²");
        System.out.println("Valor da area: " + area + unidade + "²");

    }
}
