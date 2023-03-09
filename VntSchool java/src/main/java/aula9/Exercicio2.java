package aula9;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        char opcao;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre com o numero:");
            int numero = sc.nextInt();
            int fatorial = 1;

            do {
                fatorial = fatorial * numero;
                numero--;

            } while (numero >= 1);

            System.out.println(fatorial);
            System.out.println("Deseja continuar? [s/n]");
            opcao = sc.next().charAt(0);
        } while (opcao != 'n');
    }
}
