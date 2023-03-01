package exerciciosAula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        String resposta = "";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Entre com o valor: " + i);
            list.add(sc.nextDouble());

        }
        if ((list.get(0) + list.get(1) > list.get(2)) && (list.get(0) + list.get(2) > list.get(1)) && (list.get(1) + list.get(2) > list.get(0))) {
            if (list.get(0).equals(list.get(1)) && (list.get(1).equals(list.get(2)))) {
                resposta = "Triangulo equilátero";
            } else {
                resposta = ((list.get(0).equals(list.get(1)) || (list.get(1).equals(list.get(2))) || (list.get(2).equals(list.get(0))))) ? "Triangulo Isóceles" : "Triangulo escaleno";
            }
        } else {
            resposta = "Valores inválidos!";
        }
        System.out.println(resposta);
        sc.close();
    }
}
