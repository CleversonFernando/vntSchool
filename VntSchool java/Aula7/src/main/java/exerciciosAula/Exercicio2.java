package exerciciosAula;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        if (raio <= 0) {
            System.out.println("Valores negativos ou igual a zero não são valores válidos!");
        } else {
            double resultado = Math.PI * Math.pow(raio, 2);
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}
