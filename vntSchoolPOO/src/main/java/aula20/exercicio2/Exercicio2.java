package aula20.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

    static Scanner sc = new Scanner(System.in);
    static boolean verificador;
    static char forma = '0';

    public static void main(String[] args) {

        do {
            try {
                verificador = true;
                System.out.println("Entre com o número de formas:");
                int numeroDeformas = sc.nextInt();

                for (int i = 1; i <= numeroDeformas; i++) {
                    System.out.println("Forma #" + i + " Dados:");
                    System.out.println("Retângulo ou Circulo (r/c)?");
                    forma = sc.next().charAt(0);
                    if (forma != 'r' && forma != 'c') {
                        System.out.println("Opção inválida!");
                        i = i - 1;
                    } else {
                        RegistradorDeFormas.registrarForma(forma);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor inserir valores válidos!");
                verificador = false;
                sc.next();
            }
        } while (!verificador);
        RegistradorDeFormas.imprimirListaDeFormas();
    }
}
