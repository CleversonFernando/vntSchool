package aula24.exercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercicio3 {

    public static void main(String[] args) {

        Map<String, Integer> candidatosVotos = new HashMap<>();
        String caminho = "src/main/java/aula24/exercicio3/Votos.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha = br.readLine();
            while (linha != null) {
                String nome = linha.substring(0, linha.indexOf(","));
                int votos = Integer.parseInt(linha.substring(linha.lastIndexOf(",") + 1));

                if (candidatosVotos.get(nome) != null) {
                    candidatosVotos.put(nome, candidatosVotos.get(nome) + votos);
                } else {
                    candidatosVotos.put(nome, votos);
                }
                linha = br.readLine();
            }
            System.out.println(candidatosVotos);

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
