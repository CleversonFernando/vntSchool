package aula18.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean confereInformacoes;
        String nome;
        int numero;
        do {
            System.out.println("Entre com o nome do cliente:");
            nome = sc.next();
            System.out.println("Escolha um número de conta:");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("Por favor insira valores válidos!");
                confereInformacoes = false;
            } else {
                confereInformacoes = true;
            }
        } while (!confereInformacoes);

        Conta conta1 = new Conta(numero, nome);

        System.out.println(conta1);
        conta1.setProprietario("charles");
        conta1.depositar(300);
        System.out.println(conta1);
        conta1.sacar(50);
        System.out.println(conta1);

        sc.close();
    }
}
