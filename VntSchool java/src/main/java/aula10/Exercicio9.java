package aula10;

import java.util.Scanner;

public class Exercicio9 {

    private static void calcularTempo(double gramas) {
        double tempo = 0;
        while (gramas >= 0.5) {
            gramas = gramas / 2;
            tempo = tempo + 50;
        }
        tempo = (tempo / 60) / 60;
        System.out.printf("Massa final: %.2fg Tempo em horas: %.4f ", gramas, tempo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean aprovador;
        do {
            System.out.println("Entre com o peso em gramas:");
            double gramas = sc.nextInt();
            if (gramas <= 0) {
                System.out.println("Não é um valor válido!");
                aprovador = true;
            } else {
                System.out.println("Massa inicial: " + gramas + "g");
                calcularTempo(gramas);
                aprovador = false;
            }
        } while (aprovador);

        sc.close();
    }
}
