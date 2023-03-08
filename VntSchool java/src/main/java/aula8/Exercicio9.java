package aula8;

import java.util.Scanner;

public class Exercicio9 {

    static String verificador(int a, int b) {
        String texto;
        if (a % b == 0 || b % a == 0) {
            texto = "São multiplos!";
        } else {
            texto = "Não são multiplos!";
        }
        return texto;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor:");
        int primeiro = sc.nextInt();
        System.out.println("Entre com o segundo valor:");
        int segundo = sc.nextInt();
        if (primeiro != 0 && segundo != 0) {

            System.out.println(verificador(primeiro, segundo));
        }else {
            System.out.println("Valores não podem ser igual a zero!");
        }
        sc.close();
    }
}
