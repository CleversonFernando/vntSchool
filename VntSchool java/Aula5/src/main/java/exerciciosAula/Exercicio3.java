package exerciciosAula;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o dia do mês: ");
        int diaMes = sc.nextInt();
        String resposta;

        resposta = diaMes <= 15 ? "Primeira Quinzena" : "Segunda Quinzena";

        System.out.println(resposta);

        sc.close();
    }
}