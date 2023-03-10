package aula10;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = 100;
        int ano = 2010;
        System.out.printf("Salário em %d R$ %.2f\n", ano, salario);
        double porcentagemInicial = 0.015;

        do {
            ano++;
            if (ano == 2011) {
                salario = salario + salario * porcentagemInicial;
                System.out.printf("Salário em %d R$ %.2f\n ", ano, salario);
            } else {
                porcentagemInicial *= 2;
                salario = salario + salario * (porcentagemInicial);
                System.out.printf("Salário em %d R$ %.2f\n", ano, salario);
            }
        } while (ano < 2022);

        sc.close();
    }
}

