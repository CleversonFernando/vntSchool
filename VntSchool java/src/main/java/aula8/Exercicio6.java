package aula8;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma das opções:");
        System.out.println("[1] Para doar R$ 10");
        System.out.println("[2] Para doar R$ 25");
        System.out.println("[3] Para doar R$ 50");
        System.out.println("[4] Outros valores");
        System.out.println("[5] Para cancelar");
        int escolha = sc.nextInt();
        String texto = "";

        switch (escolha) {
            case 1 -> texto = "Você doou R$ 10";
            case 2 -> texto = "Você doou R$ 25";
            case 3 -> texto = "Você doou R$ 50";
            case 4 -> {
                System.out.println("Entre com o valor da doação: ");
                double valor = sc.nextDouble();
                texto = "Você doou R$ " + valor;
            }
            case 5 -> texto = "Doação cancelada!";
            default -> System.out.println("Opção inválida!");
        }
        System.out.println(texto);

        sc.close();
    }
}
