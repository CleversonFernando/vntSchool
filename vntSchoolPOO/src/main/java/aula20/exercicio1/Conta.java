package aula20.exercicio1;

public class Conta {

    private Integer numeroDeConta;
    private String proprietario;
    private double balanco;

    public Conta(double balanco) {
        this.balanco = balanco;
    }

    public void deposito(double valor) {
        balanco = balanco + valor;
        System.out.println("Depósito no valor de " + valor + " realizado com sucesso!");
    }

    public void saque(double valor) {
        balanco = balanco - valor;
        System.out.println("Saque no valor de " + valor + " realizado com sucesso!");

    }

    public void setNumeroDeConta(Integer numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numeroDeConta=").append(numeroDeConta);
        sb.append(", proprietario='").append(proprietario).append('\'');
        sb.append(", balanco=").append(balanco);
        sb.append('}');
        return sb.toString();
    }
}
