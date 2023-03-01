package aula4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a unidade de medida:");
        String unidade = sc.nextLine();
        System.out.println("Entre com o valor do Raio:");
        double raio = sc.nextDouble();

        double area = (Math.PI * Math.pow(raio, 2));

        System.out.printf("Entrada: %.2f%s        Saída A=%.2f %s²\n", raio, unidade, area, unidade);
        System.out.printf("Entrada: %.2f%s        Saída A=%.4f %s²", raio, unidade, area, unidade);

        sc.close();
    }
}
