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

                switch (candidatoEscolhido) {
                    case 1 -> contadorDeVotos.set(0, contadorDeVotos.get(0) + 1);
                    case 2 -> contadorDeVotos.set(1, contadorDeVotos.get(1) + 1);
                    case 3 -> contadorDeVotos.set(2, contadorDeVotos.get(2) + 1);
                    case 4 -> contadorDeVotos.set(3, contadorDeVotos.get(3) + 1);
                    case 5 -> contadorDeVotos.set(4, contadorDeVotos.get(4) + 1);
                }
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
        System.out.println("Candidato [1] " + candidatos.get(0) + " total de votos " + contadorDeVotos.get(0));
        System.out.println("Candidato [2] " + candidatos.get(1) + " total de votos " + contadorDeVotos.get(1));
        System.out.println("Candidato [3] " + candidatos.get(2) + " total de votos " + contadorDeVotos.get(2));
        System.out.println("Candidato [4] " + candidatos.get(3) + " total de votos " + contadorDeVotos.get(3));
        System.out.println("Candidato [5] " + candidatos.get(4) + " total de votos " + contadorDeVotos.get(4));
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