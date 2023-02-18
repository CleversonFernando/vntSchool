package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Entre com o " + i + "º valor:");
            list.add(sc.nextInt());
        }
        int diferenca = ((list.get(0)*list.get(1)) - (list.get(2)*list.get(3)));

        System.out.printf("Entrada: " + list + " Saída: DIFERENÇA= %d", diferenca);
        sc.close();
        }
    }

