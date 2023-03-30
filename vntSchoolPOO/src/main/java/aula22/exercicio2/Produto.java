package aula22.exercicio2;

public class Produto {

    private String nome;
    private double preco;

    public void etiquetaPreco(){
        System.out.printf(" %s R$ %.2f%n",nome, preco);
    }

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

}
