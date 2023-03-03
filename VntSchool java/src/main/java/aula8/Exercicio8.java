package aula8;

import java.util.Scanner;

public class Exercicio8 {

    static double calcularIMC(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura:");
        double altura = sc.nextDouble();
        System.out.println("Entre com a peso:");
        double peso = sc.nextDouble();

        if (altura > 0 && peso > 0) {
            double imc = calcularIMC(altura, peso);
            String texto = "Obesidade Grau III (Mórbida) ";
            if (imc < 16) texto = "Magreza grave ";
            if (imc >= 16 && imc < 17) texto = "Magreza moderada ";
            if (imc >= 17 && imc < 18.5) texto = "Magreza leve ";
            if (imc >= 18.5 && imc < 25) texto = "Saudável ";
            if (imc >= 25 && imc < 30) texto = "Sobrepeso ";
            if (imc >= 30 && imc < 35) texto = "Obesidade Grau I ";
            if (imc >= 35 && imc < 40) texto = "Obesidade Grau II (Severa) ";

            System.out.printf("%s %.2f", texto, imc);
        } else {
            System.out.println("Valores precisam ser maior que zero!");
        }

        sc.close();
    }
}
