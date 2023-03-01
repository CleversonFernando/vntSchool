package exerciciosAula;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Entre com o segundo número: ");
        int segundoNumero = sc.nextInt();

        int resultado;

        if (primeiroNumero != segundoNumero) {
            resultado = primeiroNumero > segundoNumero ? primeiroNumero + segundoNumero : segundoNumero - primeiroNumero;
            System.out.println(resultado);

        } else {
            System.out.println("Os números são iguais:");
        }

        sc.close();
    }
}
