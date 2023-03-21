package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    static List<Integer> calcularDivisores(int numero) {
        List<Integer> list = new ArrayList<>();
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com o número: ");
        int numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("Entre com valores inteiros e maiores que zero!");
        } else {
            System.out.println("Os divisores são: " + calcularDivisores(numero));
        }
        sc.close();
    }
}
    
