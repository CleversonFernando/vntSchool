package aula14.exercicio6;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;
    private double porcentagemAumento;

    double salarioLiquido() {
        return salarioBruto - (salarioBruto * imposto);
    }

    double aumentoSalario() {
        return salarioBruto + salarioBruto * porcentagemAumento;

    }

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBruto, double imposto, double porcentagemAumento) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.porcentagemAumento = porcentagemAumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setPorcentagemAumento(double porcentagemAumento) {
        this.porcentagemAumento = porcentagemAumento;
    }
}
