package aula9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    static List<Integer> sexos = new ArrayList<>();
    static List<Double> alturas = new ArrayList<>();

    private static int contadorMasculino() {
        int contador = 0;
        for (int i = 0; i < sexos.size(); i++) {
            if (sexos.get(i) == 0) {
                contador++;
            }
        }
        return contador;
    }

    private static double calcularMaiorAltura() {
        double maiorAltura = alturas.get(0);
        for (int i = 1; i < (alturas.size()); i++) {
            if (alturas.get(i) > maiorAltura) {
                maiorAltura = alturas.get(i);
            }
        }
        return maiorAltura;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            boolean preenchimentoCorreto = false;
            do {
                System.out.println("Entre com as informações da pessoa:");
                System.out.println("Sexo feminino [1] Sexo masculino [0]");
                int sexo = sc.nextInt();
                sexos.add(sexo);
                if (sexo != 0 && sexo != 1) {
                    System.out.println("Por favor digite uma opção válida!");
                    preenchimentoCorreto = true;
                } else {
                    System.out.println("Altura:");
                    double altura = sc.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Altura não pode ser menor ou igual a zero!");
                        preenchimentoCorreto = true;
                    } else {
                        alturas.add(altura);
                        preenchimentoCorreto = false;
                    }
                }
            }
            while (preenchimentoCorreto);
            System.out.println("Deseja adicionar mais pessoas? [SIM = 1]/[NAO = 0]");
            opcao = sc.nextInt();
            if (opcao != 0 && opcao != 1) {
                System.out.println("Por favor digite uma opção válida!");
                System.out.println("Deseja adicionar mais pessoas? [SIM = 1]/[NAO = 0]");
                opcao = sc.nextInt();
            }
        } while (opcao != 0);

        System.out.println("Maior altura: " + calcularMaiorAltura());
        System.out.println("Quantidade de pessoas do sexo masculino: " + contadorMasculino());

        sc.close();
    }
}
