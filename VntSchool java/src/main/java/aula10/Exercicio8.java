package aula10;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    static List<String> alunos = new ArrayList<>();
    static List<Double> notas = new ArrayList<>();
    static List<Double> medias = new ArrayList<>();

    private static double calcularMedias(List<Double> list) {
        IntSummaryStatistics total = new IntSummaryStatistics();
        for (Double item : list) {
            total.accept(item.intValue());
        }
        list.clear();
        return total.getAverage();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o número de alunos que deseje cadastrar:");
        int numeroAlunos = sc.nextInt();

        do {
            System.out.println("entre com o nome do aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            alunos.add(nome);

            for (int i = 0; i < 3; i++) {
                System.out.println("entre com a " + (i + 1) + "ª nota do aluno:");
                double nota = sc.nextDouble();
                if (nota < 0) {
                    System.out.println("Valores de notas não podem ser menores que zero!");
                } else {
                    notas.add(nota);
                }
            }
            medias.add(calcularMedias(notas));

            numeroAlunos--;
        }
        while (numeroAlunos > 0);

        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i) < 6) {
                System.out.println("Aluno " + alunos.get(i) + " Reprovado!");
            } else {
                System.out.println("Aluno " + alunos.get(i) + " Aprovado!");
            }
        }
        System.out.println("Média geral " + calcularMedias(medias));

        sc.close();
    }
}

