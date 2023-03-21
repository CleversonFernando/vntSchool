package aula10;

import java.util.Scanner;

public class Exercicio9 {

    private static double massaFinal;

    private static double calcularTempoEmMinutos(double gramas) {
        double tempo = 0;
        while (gramas >= 0.5) {
            gramas = gramas / 2;
            tempo = tempo + 50;
        }
        massaFinal = gramas;
        return tempo / 60;
    }

    private static double calcularTempoEmHoras(double gramas) {
        double tempo = calcularTempoEmMinutos(gramas);
        return tempo / 60;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean aprovador;
        double gramas;
        do {
            System.out.println("Entre com o peso em gramas:");
            gramas = sc.nextInt();
            if (gramas <= 0) {
                System.out.println("Não é um valor válido!");
                aprovador = true;
            } else {
                System.out.println("Massa inicial: " + gramas + "g");
                aprovador = false;
            }
        } while (aprovador);
        System.out.printf("Tempo em horas: %.4f Tempo em minutos: %.4f%n",
                calcularTempoEmHoras(gramas), calcularTempoEmMinutos(gramas));
        System.out.printf("Massa final: %.4fg", massaFinal);

        sc.close();
    }
}
