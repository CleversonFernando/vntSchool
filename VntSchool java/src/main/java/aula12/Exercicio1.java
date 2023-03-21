package aula12;

import java.util.*;

public class Exercicio1 {

    static List<String> alunos = new ArrayList<>();
    static List<Double> medias = new ArrayList<>();

    private static double calcularMediasGeral(List<Double> medias) {
        DoubleSummaryStatistics total = new DoubleSummaryStatistics();
        for (Double item : medias) {
            total.accept(item.doubleValue());
        }
        return total.getAverage();
    }

    private static Double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            boolean confirma = true;
            do {
                System.out.println("Entre com o nome do " + i + "º aluno");
                alunos.add(sc.nextLine());
                System.out.println("Nota 1");
                double nota1 = sc.nextDouble();
                System.out.println("Nota 2");
                double nota2 = sc.nextDouble();
                if (nota1 < 0 || nota2 < 0) {
                    System.out.println("Valores não podem ser menores que zero!");
                } else {
                    medias.add(calcularMedia(nota1, nota2));
                    sc.nextLine();
                    confirma = false;
                }
            } while (confirma);
        }
        double resultadoMediaGeral = calcularMediasGeral(medias);
        System.out.println("Média geral da turma: " + resultadoMediaGeral);
        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i) > resultadoMediaGeral) {
                System.out.println("Aluno com nota acima da média: " + alunos.get(i));
            }
        }
        sc.close();
    }
}



