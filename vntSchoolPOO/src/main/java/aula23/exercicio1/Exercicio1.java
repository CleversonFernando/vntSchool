package aula23.exercicio1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio1 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.addAll(List.of(0, 2, 4, 5, 6, 8, 10));
        set2.addAll(List.of(5, 6, 7, 8, 9, 10));

        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);

        Set<Integer> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        System.out.println(set4);

        Set<Integer> set5 = new HashSet<>(set1);
        set5.removeAll(set2);
        System.out.println(set5);

    }
}
