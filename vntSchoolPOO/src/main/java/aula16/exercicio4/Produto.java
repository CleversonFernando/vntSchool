package aula16.exercicio4;

public class Produto {

    private Integer codigo;
    private String nome;
    private double preco;
    private Integer quantidade;

    public double calcularContaAPagar() {
        return quantidade * preco;
    }

    public Integer getCodigo() {
        return codigo;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
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
