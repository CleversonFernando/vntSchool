package aula26.exercicio2;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto p2) {
        if (this.preco > p2.getPreco()) {
            return 1;
        } else if (this.preco < p2.getPreco()) {
            return -1;
        } else
            return 0;
    }
}
