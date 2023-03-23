package aula16.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um produto:");
        System.out.println("[1]-Cachorro Quente");
        System.out.println("[2]-X-Salada");
        System.out.println("[3]-X-Bacon");
        System.out.println("[4]-Torrada");
        System.out.println("[5]-Refrigerante");
        int produto = sc.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();

        switch (produto) {
            case 1:
                Produto produto1 = new Produto();
                produto1.setNome("Cachorro Quente");
                produto1.setCodigo(1);
                produto1.setPreco(7.0);
                produto1.setQuantidade(quantidade);
                System.out.println(produto1);
                System.out.printf("Total: %.2f", produto1.calcularContaAPagar());
                break;
            case 2:
                Produto produto2 = new Produto();
                produto2.setNome("X-Salada");
                produto2.setCodigo(2);
                produto2.setPreco(9.0);
                produto2.setQuantidade(quantidade);
                System.out.println(produto2);
                System.out.printf("Total: %.2f", produto2.calcularContaAPagar());
                break;
            case 3:
                Produto produto3 = new Produto();
                produto3.setNome("X-Bacon");
                produto3.setCodigo(3);
                produto3.setPreco(11.0);
                produto3.setQuantidade(quantidade);
                System.out.println(produto3);
                System.out.printf("Total: %.2f", produto3.calcularContaAPagar());
                break;
            case 4:
                Produto produto4 = new Produto();
                produto4.setNome("Torrada");
                produto4.setCodigo(4);
                produto4.setPreco(5.0);
                produto4.setQuantidade(quantidade);
                System.out.println(produto4);
                System.out.printf("Total: %.2f", produto4.calcularContaAPagar());
                break;
            case 5:
                Produto produto5 = new Produto();
                produto5.setNome("Refrigerante");
                produto5.setCodigo(5);
                produto5.setPreco(4.0);
                produto5.setQuantidade(quantidade);
                System.out.println(produto5);
                System.out.printf("Total: %.2f", produto5.calcularContaAPagar());
                break;
            default:
                System.out.println("Favor escolher um valor válido!");
        }
    }
}

