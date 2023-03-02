package aula4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do usuário:");
        String nome = sc.nextLine();
        System.out.println("Entre com o número da agência:");
        int agencia = sc.nextInt();
        System.out.println("Entre com o número da conta:");
        int conta = sc.nextInt();

        System.out.println("Informações do usuário:");
        System.out.printf("Nome: %s Agência: %d Conta: %d", nome, agencia, conta);

        sc.close();
    }
}
