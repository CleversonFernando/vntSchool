package aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    static List<Double> list = new ArrayList<>();

    static double calcularSoma(List<Double> list) {
        double soma = 0;
        for (double item : list) {
            soma += item;
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Entre com o valor da " + i + "ª nota:");
            list.add(sc.nextDouble());
        }
        double soma = calcularSoma(list);

        double media = soma / list.size();

        if (media >= 7) {
            texto = "Aprovado!";
        } else if (media < 5) {
            texto = "Reprovado!";
        } else {
            texto = "Recuperação!";
        }
        System.out.println(texto);

        sc.close();
    }
}
