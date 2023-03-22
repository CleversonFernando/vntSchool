package aula14.exercicio6;

public class Funcionario {

    private String nome;
    private double salarioBruto;

    private double salarioLiquido;

    double descontarImposto(double porcentagemDesconto) {
        return salarioLiquido = salarioBruto - (salarioBruto * porcentagemDesconto);
    }

    double aumentarSalario(double porcentagemAumento) {
        return salarioBruto = salarioBruto + (salarioBruto * porcentagemAumento);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
}
