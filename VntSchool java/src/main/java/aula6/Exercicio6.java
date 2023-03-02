package aula6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número: ");
        int numero = sc.nextInt();
        String resposta;

        resposta = numero >= 10 ? "Número é maior ou igual 10" : "";
        System.out.println(resposta);
        resposta = numero <= 5 ? "Numero é menor ou igual 5" : "Número é maior que 5";
        System.out.println(resposta);

        sc.close();
    }
}
