package aula10;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a senha:");
        int senha = sc.nextInt();
        while (senha != 2023) {
            System.out.println("Senha inválida!");
            System.out.println("Tente novamente!");
            System.out.println("Entre com a senha:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");

        sc.close();
    }
}
    
