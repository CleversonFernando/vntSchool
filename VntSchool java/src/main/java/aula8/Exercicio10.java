package aula8;

import java.util.Scanner;

public class Exercicio10 {

    static int calcularHora(int horaInicial, int horaFinal) {
        int resultado;
        if (horaInicial == horaFinal) {
            resultado = 24;
        } else if (horaFinal < horaInicial) {
            resultado = 24 - (horaInicial - horaFinal);
        } else {
            resultado = horaFinal - horaInicial;
        }
        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a hora inicial entre [0 e 24] ");
        int horaInicial = sc.nextInt();
        System.out.println("Entre com a hora final entre [0 e 24]");
        int horaFinal = sc.nextInt();

        if (horaInicial >= 0 && horaInicial <= 24 && horaFinal >= 0 && horaFinal <= 24) {

            System.out.println("Total de horas jogadas: " + calcularHora(horaInicial, horaFinal) + " horas");
        } else {
            System.out.println("Valores devem ser entre 0 e 24!");
        }
        sc.close();
    }
}
