package aula20.exercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RegistradorDeFormas {

    static List<Double> areas = new ArrayList<>();

    public static void registrarForma(char forma) {

        Scanner sc = new Scanner(System.in);
        boolean verificador;

        if (forma == 'r') {
            do {
                try {
                    verificador = true;
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Cor (BLACK/BLUE/RED):");
                    retangulo.setCor(Cor.valueOf(sc.next()));
                    System.out.println("Entre com a altura:");
                    retangulo.setAltura(sc.nextDouble());
                    System.out.println("Entre com a largura:");
                    retangulo.setLargura(sc.nextDouble());
                    if (retangulo.getAltura() <= 0 || retangulo.getLargura() <= 0) {
                        System.out.println("Valores não podem ser menores ou igual a zero!");
                        verificador = false;
                    } else {
                        areas.add(retangulo.area());
                        System.out.println(retangulo);
                    }
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.println("Favor inserir valores válidos!");
                    verificador = false;
                    limparBuffer(sc);
                }
            } while (!verificador);
        } else {
            do {
                try {
                    verificador = true;
                    Circulo circulo = new Circulo();
                    System.out.println("Cor (BLACK/BLUE/RED):");
                    circulo.setCor(Cor.valueOf(sc.next()));
                    System.out.println("Entre com o valor do raio:");
                    circulo.setRaio(sc.nextDouble());
                    if (circulo.getRaio() <= 0) {
                        System.out.println("Valores não podem ser menores ou igual a zero!");
                        verificador = false;
                    } else {
                        areas.add(circulo.area());
                        System.out.println(circulo);
                    }
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.println("Favor inserir valores válidos!");
                    verificador = false;
                    limparBuffer(sc);
                }
            } while (!verificador);
        }
    }

    private static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static void imprimirListaDeFormas() {
        for (double item : areas) {
            System.out.printf("Forma Areas: %.2f%n", item);
        }
    }
}