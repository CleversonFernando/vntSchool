package aula14.exercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Scanner sc = new Scanner(System.in);
        double imposto = 0;

        boolean valoresCorretos;
        do {
            try {
                System.out.println("Entre com o nome do Funcionário:");
                funcionario1.setNome(sc.next());
                System.out.println("Entre com o salário bruto do funcionário:");
                funcionario1.setSalarioBruto(sc.nextDouble());
                System.out.println("Entre com o valor do imposto:");
                imposto = sc.nextDouble();
                if (funcionario1.getSalarioBruto() <= 0 || imposto < 0) {
                    System.out.println("Favor inserir valores válidos!");
                    valoresCorretos = false;
                } else {
                    valoresCorretos = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir valores válidos!");
                valoresCorretos = false;
                sc.next();
            }
        } while (!valoresCorretos);
        System.out.printf("Nome: %s Salário Liquido: %.2f%n", funcionario1.getNome(), funcionario1.descontarImposto(imposto));
        System.out.println("Entre com o valor do aumento:");
        System.out.printf("Nome : %s Salário bruto com aumento: %.2f%n", funcionario1.getNome(), funcionario1.aumentarSalario(sc.nextDouble()));
        System.out.printf("Nome: %s Salário Liquido corrigido: %.2f%n", funcionario1.getNome(), funcionario1.descontarImposto(imposto));
        System.out.printf("Salário liquido: %.2f", funcionario1.getSalarioLiquido());

        sc.close();
    }
}
