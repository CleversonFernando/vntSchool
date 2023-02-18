package aula4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;
        int horaMes;
        int valorHora;

        System.out.println("Entre com o número do funcionário:");
        numero = sc.nextInt();
        System.out.println("Entre com as horas trabalhadas:");
        horaMes = sc.nextInt();
        System.out.println("Entre com o valor por hora:");
        valorHora = sc.nextInt();
        listaFuncionario(numero, horaMes, valorHora);
        sc.close();
    }

    private static void listaFuncionario(int numero, int horaMes, int valorHora) {
        double salario;
        salario = (horaMes * valorHora);
        System.out.printf("Entrada: %d,%d,%d     Saída: NUMERO = %d, SALARIO = R$%.2f%n", numero, horaMes, valorHora, numero, salario);
    }
}

