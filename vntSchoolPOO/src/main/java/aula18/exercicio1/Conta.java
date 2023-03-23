package aula18.exercicio1;

public class Conta implements ControleConta {

    private Integer numeroDaConta;

    private String proprietario;
    private double balanco;

    public Conta(Integer numeroDaConta, String proprietario, double balanco) {
        this.numeroDaConta = numeroDaConta;
        this.proprietario = proprietario;
        this.balanco = balanco;
    }

    public void depositar(double valorDeposito) {
        balanco = balanco + valorDeposito;
    }

    public void sacar(double valorSaque) {
        balanco = (balanco - valorSaque) - 5.0;
    }
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getBalanco() {
        return balanco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numeroDaConta=").append(numeroDaConta);
        sb.append(", proprietario='").append(proprietario).append('\'');
        sb.append(", balanco=").append(balanco);
        sb.append('}');
        return sb.toString();
    }
}
