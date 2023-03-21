package aula10;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

    private static double calcularMedias(double nota1, double nota2) {
        return (nota1 + nota2) / 2;

    }

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();
        List<Double> medias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o número de alunos que deseje cadastrar:");
        int numeroAlunos = sc.nextInt();
        double mediaGeral = 0;

        do {
            System.out.println("entre com o nome do aluno:");
            alunos.add(sc.next());

            System.out.println("entre com a 1ª nota do aluno:");
            double nota1 = sc.nextDouble();
            System.out.println("entre com a 2ª nota do aluno:");
            double nota2 = sc.nextDouble();
            if (nota1 < 0 && nota2 < 0) {
                System.out.println("Valores de notas não podem ser menores que zero!");
            } else {
                medias.add(calcularMedias(nota1, nota2));
            }
            numeroAlunos--;
        } while (numeroAlunos > 0);

        for (
                int i = 0; i < medias.size(); i++) {
            if (medias.get(i) < 6) {
                System.out.println("Aluno " + alunos.get(i) + " Reprovado!");
            } else {
                System.out.println("Aluno " + alunos.get(i) + " Aprovado!");
            }
        }
        for (double item : medias) {
            mediaGeral = mediaGeral + item;
        }
        mediaGeral = mediaGeral / medias.size();
        System.out.printf("Média geral %.2f", mediaGeral);

        sc.close();
    }
}

