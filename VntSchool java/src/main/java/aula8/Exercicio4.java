package aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    static List<Double> list = new ArrayList<>();

    static double calcularMedia(List<Double> list) {
        double soma = 0;
        double media = 0;
        for (double item : list) {
            soma += item;
            media = soma / list.size();
        }
        return media;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Entre com o valor da " + i + "ª nota:");
            list.add(sc.nextDouble());
        }
        double media = calcularMedia(list);

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
