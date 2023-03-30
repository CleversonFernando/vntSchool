package aula22.exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    private static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número de produtos que deseja cadastrar:");
        int numeroDeProdutos = sc.nextInt();
        if (numeroDeProdutos <= 0) {
            System.out.println("Número de produtos deve ser maior que zero!");
        } else {
            for (int i = 1; i <= numeroDeProdutos; i++) {
                System.out.println("[1]- Produto");
                System.out.println("[2]- Produto usado");
                System.out.println("[3]- Produto importado");
                int escolha = sc.nextInt();

                if (escolha != 1 && escolha != 2 && escolha != 3) {
                    System.out.println("Opção inválida!");
                    i--;
                } else {
                    System.out.println("Produto: " + i);
                    String nome;
                    double preco;
                    String dataDeFabricacao;
                    double taxa;

                    limparBuffer(sc);

                    switch (escolha) {
                        case 1:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.nextLine();
                            System.out.println("entre com o preço:");
                            preco = sc.nextDouble();
                            produtos.add(new Produto(nome, preco));
                            break;
                        case 2:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.nextLine();
                            System.out.println("Entre com o preço:");
                            preco = sc.nextDouble();
                            System.out.println("Entre com a data de fabricação (dd/MM/yyyy)");
                            dataDeFabricacao = sc.next();
                            produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                            break;
                        case 3:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.nextLine();
                            System.out.println("Entre com o preço:");
                            preco = sc.nextDouble();
                            System.out.println("Entre com o valor da taxa:");
                            taxa = sc.nextDouble();
                            produtos.add(new ProdutoImportado(nome, preco, taxa));
                            break;
                        default:
                            System.out.println("Selecione uma opção válida!");
                    }
                }
            }
        }

        System.out.println("ETIQUETAS PREÇOS:");
        for (Produto item : produtos) {
            item.etiquetaPreco();
        }

        sc.close();
    }
}