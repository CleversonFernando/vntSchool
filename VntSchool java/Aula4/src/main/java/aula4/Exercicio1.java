package aula4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int agencia;
        int conta;

        System.out.println("Entre com o nome do usuário:");
        nome = sc.nextLine();
        System.out.println("Entre com o número da agência:");
        agencia = sc.nextInt();
        System.out.println("Entre com o número da conta:");
        conta = sc.nextInt();

        System.out.println("Informações do usuário:");
        System.out.printf("Nome: %s Agência: %d Conta: %d", nome, agencia, conta);

        sc.close();
    }
}
