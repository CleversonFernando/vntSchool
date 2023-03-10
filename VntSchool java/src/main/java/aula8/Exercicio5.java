package aula8;

import java.util.Scanner;

public class Exercicio5 {

    static double calcularAumento(double salario, double porcentagem) {
        return salario * porcentagem;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do funcionário:");
        String nome = sc.nextLine();
        System.out.println("Entre com o salário:");
        double salario = sc.nextInt();
        double novoSalario;
        double porcentagemAumento = 0;

        if (salario > 0) {
            if (salario <= 3000) {
                porcentagemAumento = 1.2;
                novoSalario = calcularAumento(salario, porcentagemAumento);
            } else if (salario <= 6000) {
                porcentagemAumento = 1.15;
                novoSalario = calcularAumento(salario, porcentagemAumento);
            } else if (salario <= 9000) {
                porcentagemAumento = 1.12;
                novoSalario = calcularAumento(salario, porcentagemAumento);
            } else if (salario <= 12000) {
                porcentagemAumento = 1.1;
                novoSalario = calcularAumento(salario, porcentagemAumento);
            } else if (salario <= 16000) {
                porcentagemAumento = 1.07;
                novoSalario = calcularAumento(salario, porcentagemAumento);
            } else {
                System.out.println("Não tem aumento!");
                novoSalario = salario;
            }
            porcentagemAumento *= 10;

            System.out.println(nome);
            System.out.print("Aumento " + porcentagemAumento + "% ");
            System.out.printf("Salário antigo: %.2f Salário novo: %.2f", salario, novoSalario);
            sc.close();
        } else {
            System.out.println("Salário deve ser maior que zero!");
        }
    }
}
