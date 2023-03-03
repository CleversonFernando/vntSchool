package aula8;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        double primeiro = sc.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double segundo = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Sair");
        int escolha = sc.nextInt();

        String texto = "";
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = primeiro + segundo;
                texto = "Resultado da soma é " + resultado;
                break;
            case 2:
                resultado = primeiro - segundo;
                texto = "Resultado da subtração é " + resultado;
                break;
            case 3:
                resultado = primeiro * segundo;
                texto = "Resultado da multiplicação é " + resultado;
                break;
            case 4:
                if (primeiro != 0 && segundo != 0) {
                    resultado = primeiro / segundo;
                    texto = "Resultado da divisão é " + resultado;
                } else {
                    System.out.println("Não existe divisão com zeros!");
                }
                break;
            case 5:
                texto = "Fim do programa!";
                break;
            default:
                texto = "Opção inválida!";
        }
        System.out.println(texto);

        sc.close();
    }
}
