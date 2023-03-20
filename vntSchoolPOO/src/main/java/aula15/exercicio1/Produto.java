package aula15.exercicio1;

public class Produto {
    public String nome;
    protected int quantidade;
    protected double preco;

    public double totalValorEmEstoque() {
        return quantidade * preco;
    }

    public void addProdutos(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade = this.quantidade - quantidade;

    }
}
