package aula16.exercicio4;

public class Produto {

    protected Integer codigo;
    protected String nome;
    protected double preco;
    protected Integer quantidade;

    public double calcularContaAPagar() {
        return quantidade * preco;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto codigo: " + codigo +
                ", nome: " + nome + ", preco: " + preco +
                ", quantidade: " + quantidade;
    }
}
