package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        List<String> candidatos = new ArrayList<>();
        List<Integer> contadorDeVotos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Entre com o nome do " + i + "º candidato");
            candidatos.add(sc.nextLine());
            contadorDeVotos.add(0);
        }

        int confirma;
        int valorTotalDeVotos = 0;
        do {
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.println("Candidato [" + (i + 1) + "] " + candidatos.get(i));
            }
            System.out.println("Escolha um dos candidatos:");
            int candidatoEscolhido = sc.nextInt();
            if (candidatoEscolhido >= 1 && candidatoEscolhido <= 5) {

                contadorDeVotos.set((candidatoEscolhido - 1), contadorDeVotos.get(candidatoEscolhido - 1) + 1);

                valorTotalDeVotos = valorTotalDeVotos + 1;
            } else {
                System.out.println("Voto inválido!");
            }
            do {
                System.out.println("Deseja continuar? [1]-Sim [0]-Não");
                confirma = sc.nextInt();
            } while (confirma != 1 && confirma != 0);

        } while (confirma == 1);

        System.out.println("Vencedores:");

        checarVencedor(contadorDeVotos, candidatos);
        for (
                int i = 0; i < candidatos.size(); i++) {
            System.out.println("Candidato [" + (i + 1) + "] " + candidatos.get(i) + " total de votos " + contadorDeVotos.get(i));
        }
        System.out.println("Valor total de votos " + valorTotalDeVotos);

        sc.close();

    }

    private static void checarVencedor(List<Integer> contadorDeVotos, List<String> candidatos) {
        int maior = contadorDeVotos.get(0);
        for (int i = 1; i < contadorDeVotos.size(); i++) {
            if (maior < contadorDeVotos.get(i)) {
                maior = contadorDeVotos.get(i);
            }
        }
        for (int i = 0; i < contadorDeVotos.size(); i++) {
            if (maior == contadorDeVotos.get(i) && maior != 0) {
                System.out.println(candidatos.get(i));
            }
        }
    }
}