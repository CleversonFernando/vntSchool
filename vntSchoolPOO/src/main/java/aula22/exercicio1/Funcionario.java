package aula22.exercicio1;

public class Funcionario {

    private String nome;
    private double horas;
    private double valorPorHoras;

    public double pagamento(){
        return horas * valorPorHoras;
    }

    public Funcionario(String nome, double horas, double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    @Override
    public String toString() {
        return  "Funcionario: " + nome + " Total Pagamento: " +  pagamento();
    }
}
