package aula12;

import java.util.*;

public class Exercicio8 {

    static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        while (set.size() < 6) {
            set.add(random.nextInt(60) + 1);
        }
        System.out.println("Números sorteados:");
        for (Integer item : set) {
            System.out.print(" - " + item);
        }
        sc.close();
    }
}