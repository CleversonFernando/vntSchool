package exerciciosAula;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o preço:");
        double preco = sc.nextDouble();
        double precoLimite = 30.0;
        double total;

        total = preco < precoLimite ? preco * 0.90 : preco * 0.80;
        System.out.println(total);

        sc.close();
    }
}