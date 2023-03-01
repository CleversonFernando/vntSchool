package exerciciosAula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Entre com o valor: " + i);
            list.add(sc.nextDouble());
        }
        if ((list.get(0) + list.get(1) > list.get(2)) && (list.get(0) + list.get(2) > list.get(1)) && (list.get(1) + list.get(2) > list.get(0))) {
            if (list.get(0).equals(list.get(1)) && (list.get(1).equals(list.get(2)))) {
                System.out.println("Triangulo equilátero");
            } else if ((list.get(0).equals(list.get(1)) || (list.get(1).equals(list.get(2))) || (list.get(2).equals(list.get(0))))) {
                System.out.println("Triangulo Isóceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Valores inválidos");
        }
        sc.close();
    }
}
