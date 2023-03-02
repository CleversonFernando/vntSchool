package aula7;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de X:");
        int x = sc.nextInt();
        System.out.println("Entre com o valor de Y:");
        int y = sc.nextInt();

        String mensagem;

        if (x == y && y == 0) {
            mensagem = "Origem";
        } else if (x == 0 && y != 0) {
            mensagem = "Eixo Y";
        } else if (y == 0 && x != 0) {
            mensagem = "Eixo X";
        } else if (y > 0 && x > 0) {
            mensagem = "1º Quadrante";
        } else if (y > 0 && x < 0) {
            mensagem = "2º Quadrante";
        } else if (y < 0 && x < 0) {
            mensagem = "3º Quadrante";
        } else {
            mensagem = "4º Quadrante";
        }
        System.out.println(mensagem);
        sc.close();
    }
}