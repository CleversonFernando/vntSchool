package aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double mediaTotal;
        List<Double> notas = new ArrayList<>();

        System.out.println("Entre com o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Entre com a idade: ");
        idade = sc.nextInt();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("Entre com a " + j + "ª nota do " + i + "º semestre:");
                notas.add(sc.nextDouble());
            }
        }
        System.out.println("Aluno: " + nome + " Idade: " + idade + " Anos");
        System.out.println("Todas as notas: ");
        for (int i = 1; i <= notas.size(); i++) {
            System.out.print(" Nota " + i + "-" + notas.get(i - 1));
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        calcularMedia(nome, notas);
        sc.close();
    }
    //calcula media
    private static void calcularMedia(String nome, List<Double> notas) {
        double soma = 0.0;
        double media = 0.0;
        for (Double notasBimestre : notas) {
            soma += notasBimestre;
        }
        media = soma / notas.size();
        System.out.printf("O aluno %s teve média anual de %.2f", nome, media);
    }
}