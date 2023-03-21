package aula16.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBanco novaConta;
        int escolha;

        do {
            System.out.println("Que tipo de conta deseja abrir? [1]-Conta Corrente [0]-Conta Poupança");
            escolha = sc.nextInt();
        } while ((escolha != 1) && (escolha != 0));

        System.out.println("Entre com o nome do cliente:");
        String nome = sc.next();

        if (escolha == 1) {
            novaConta = new ContaCorrente(nome);
            novaConta.abrirConta();
        } else {
            novaConta = new ContaPoupanca(nome);
            novaConta.abrirConta();
        }

        novaConta.mostrarConta();

        sc.close();
    }
}
