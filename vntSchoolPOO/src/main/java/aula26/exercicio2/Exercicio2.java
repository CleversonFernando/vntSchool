package aula26.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {

        String path = "src/main/java/aula26/exercicio2/Produtos.txt";
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linha = br.readLine();
            while (linha != null) {
                String[] vetor = linha.split(",");
                String nomeProduto = vetor[0];
                double precoProduto = Double.parseDouble(vetor[1]);
                Produto p1 = new Produto(nomeProduto, precoProduto);
                produtos.add(p1);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        double media = produtos.stream().mapToDouble(Produto::getPreco).average().orElse(0.0);
        System.out.printf("Média preços: %.2f%n", media);
                produtos.stream().filter(prdutoAbaixoDaMedia -> prdutoAbaixoDaMedia.getPreco() < media).forEach(System.out::println);
        }
    }


