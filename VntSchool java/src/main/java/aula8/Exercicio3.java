package aula8;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o valor do salário:");
        double salario = sc.nextDouble();
        System.out.println("Entre com o valor do financiamento:");
        double financiamento = sc.nextDouble();
        String texto;

        if ((salario > 0) && (financiamento > 0)) {
            if (financiamento <= (salario * 5)) {
                texto = "Financiamento concedido! ";
            } else {
                texto = "Financiamento negado! ";
            }
            System.out.println(texto + "Obrigado por nos cunsultar!");
        } else {
            System.out.println("Valores não podem ser negativos ou igual a zero!");
        }
        sc.close();
    }
}
