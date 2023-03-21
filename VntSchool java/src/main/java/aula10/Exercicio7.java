package aula10;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = 2000.0;
        int ano = 2010;
        System.out.printf("Salário em %d R$ %.2f%n", ano, salario);
        double porcentagemInicial = 0.015;

        salario = salario + salario * porcentagemInicial;
        System.out.printf("Salário em %d R$ %.2f%n ", (ano+1), salario);

        do {
            ano++;
            porcentagemInicial *= 2;
            salario = salario + salario * (porcentagemInicial);
            System.out.printf("Salário em %d R$ %.2f%n", ano, salario);
        } while (ano < 2022);

        sc.close();
    }
}


