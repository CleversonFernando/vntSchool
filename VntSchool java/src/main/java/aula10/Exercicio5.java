package aula10;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int produtoA = 0;
        int produtoB = 0;
        int produtoC = 0;
        do {
            System.out.println("Escolha o produto:");
            System.out.println("[1] - Produto A:");
            System.out.println("[2] - Produto B:");
            System.out.println("[3] - Produto C:");
            System.out.println("[4] - Fim!");
            codigo = sc.nextInt();
            if (codigo != 1 && codigo != 2 && codigo != 3 && codigo != 4) {
                System.out.println("Código inválido!");
            } else {
                switch (codigo) {
                    case 1 -> produtoA = produtoA + 1;
                    case 2 -> produtoB = produtoB + 1;
                    case 3 -> produtoC = produtoC + 1;
                    default -> System.out.println("Muito Obrigado!");
                }
            }
        } while (codigo != 4);
        System.out.println("Clientes que compraram o Produto A: " + produtoA);
        System.out.println("Clientes que compraram o Produto B: " + produtoB);
        System.out.println("Clientes que compraram o Produto C: " + produtoC);

        sc.close();
    }
}

