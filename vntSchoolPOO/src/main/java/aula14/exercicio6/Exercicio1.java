package aula14.exercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Scanner sc = new Scanner(System.in);

        boolean valoresOk;
        do {
            try {
                System.out.println("Entre com o nome do Funcionário:");
                funcionario1.setNome(sc.next());
                System.out.println("Entre com o salário bruto do funcionário:");
                funcionario1.setSalarioBruto(sc.nextDouble());
                System.out.println("Entre com o valor do imposto:");
                funcionario1.setImposto(sc.nextDouble());
                valoresOk = false;
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir valores válidos!");
                valoresOk = true;
                sc.next();
            }
        } while (valoresOk);
        System.out.printf("Nome: %s Salário Liquido: %.2f%n", funcionario1.getNome(), funcionario1.salarioLiquido());

        System.out.println("Entre com o valor do aumento:");
        funcionario1.setPorcentagemAumento(sc.nextDouble());

        System.out.printf("Nome : %s Salário com aumento: %.2f", funcionario1.getNome(), funcionario1.aumentoSalario());

        sc.close();
    }
}
