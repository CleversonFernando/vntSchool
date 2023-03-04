package aula8;

import java.util.Scanner;

public class Desafio1 {

    //Calcula preço com sumento
    private static double calcularPreco(double preco, double percentualAumento) {

        return preco + (preco * percentualAumento);
    }

    //Classifica o preço
    private static String classificarPreco(double preco) {
        String texto;
        if (preco <= 50) texto = " Barato!";
        else if (preco > 50 && preco < 120) texto = " Normal!";
        else texto = " Caro!";
        return texto;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Entre com o preço do produto:");
        double preco = sc.nextDouble();
        if (preco <= 0) {
            System.out.println("Preço deve ser maior que zero!");
        } else {
            System.out.println("Escolha uma categoria:");
            System.out.println("Categoria [1] - Limpeza");
            System.out.println("Categoria [2] - Alimentação");
            System.out.println("Categoria [3] - Vestuário");
            int categoria = sc.nextInt();
            if (categoria < 1 || categoria > 3) {
                System.out.println("Escolha uma categoria válida!");
            } else {
                System.out.println("Escolha uma Situação:");
                System.out.println("Situação [R] - Produtos que necessitam de refrigeração:");
                System.out.println("Situação [N] - Produtos que não necessitam de refrigeração:");
                char situacao = sc.next().charAt(0);
                if ((situacao == 'R') || (situacao == 'N')) {

                    String textoAumento = "";
                    double percentualTotalAumento = 0;
                    String textoDesconto = "";
                    double percentualTotalDesconto = 0;
                    double totalAumento;
                    double totalDesconto;
                    double percentualAumentoCat1;
                    double percentualAumentoCat2;
                    double percentualAumentoCat3;
                    double percentualDesconto1 = 0.05;
                    double percentualDesconto2 = 0.08;

                    //calcula aumento no preço

                    if (preco <= 25) {
                        percentualAumentoCat1 = 0.05;
                        percentualAumentoCat2 = 0.08;
                        percentualAumentoCat3 = 0.10;
                    } else {
                        percentualAumentoCat1 = 0.12;
                        percentualAumentoCat2 = 0.15;
                        percentualAumentoCat3 = 0.18;
                    }
                    switch (categoria) {
                        case 1 -> {
                            totalAumento = calcularPreco(preco, percentualAumentoCat1);
                            percentualTotalAumento = (percentualAumentoCat1 * 100);
                            textoAumento = String.format("%s%s", totalAumento, classificarPreco(totalAumento));
                        }
                        case 2 -> {
                            totalAumento = calcularPreco(preco, percentualAumentoCat2);
                            percentualTotalAumento = (percentualAumentoCat2 * 100);
                            textoAumento = String.format("%s%s", totalAumento, classificarPreco(totalAumento));
                        }
                        case 3 -> {
                            totalAumento = calcularPreco(preco, percentualAumentoCat3);
                            percentualTotalAumento = (percentualAumentoCat3 * 100);
                            textoAumento = String.format("%s%s", totalAumento, classificarPreco(totalAumento));
                        }
                    }
                    //Calcula desconto no preço
                    if (categoria == 2 || situacao == 'R') {
                        totalDesconto = preco - (preco * percentualDesconto1);
                        percentualTotalDesconto = (percentualDesconto1 * 100);
                        textoDesconto = String.format("%s%s", totalDesconto, classificarPreco(totalDesconto));
                    } else {
                        totalDesconto = preco - (preco * percentualDesconto2);
                        percentualTotalDesconto = (percentualDesconto2 * 100);
                        textoDesconto = String.format("%s%s", totalDesconto, classificarPreco(totalDesconto));
                    }
                    System.out.println("Produto " + nome + " percentual aumento " +
                            percentualTotalAumento + "% novo preço R$ " + textoAumento);
                    System.out.println("Produto " + nome + " percentual desconto " +
                            percentualTotalDesconto + "% novo preço R$ " + textoDesconto);
                } else {
                    System.out.println("Entre com um valor de situação válido!");
                }
            }
        }

        sc.close();
    }
}
