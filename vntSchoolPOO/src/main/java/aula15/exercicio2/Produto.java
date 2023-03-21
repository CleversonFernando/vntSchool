package aula15.exercicio2;

public class Produto {

    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto(String nome, double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto " + nome + " Preço " + preco + " Quantidade " + quantidade;
    }
}
