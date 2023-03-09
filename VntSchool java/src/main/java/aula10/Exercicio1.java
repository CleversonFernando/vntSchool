package aula10;

import java.util.Scanner;

public class Exercicio1 {

    private static String verificarPrimo(int numero) {
        String resposta;
        int contador = 0;
        int i = numero;
        do {
            if (numero % i == 0) {
                contador++;
            }
            i--;
        } while (i > 0);
        if (contador == 2) {
            resposta = " É um número primo. ";
        } else {
            resposta = " Não é um número primo. ";
        }
        return resposta;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número: ");
        int numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("Por favor insira números positivos e inteiros!");
        } else {
            System.out.println(numero + verificarPrimo(numero));
        }
        sc.close();
    }
}
    
