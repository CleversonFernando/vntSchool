package aula26.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7, 14, 16);

        Stream<Integer> stream = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<Integer> list2 = list.stream().filter(numeroPar -> numeroPar % 2 == 0).map(numero -> numero*20);

        System.out.println(Arrays.toString(list2.toArray()));
    }
}
