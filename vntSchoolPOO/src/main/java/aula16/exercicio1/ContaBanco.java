package aula16.exercicio1;

public class ContaBanco {

    public Integer numeroDaConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
    }

    public ContaBanco(Integer numeroDaConta, String tipo, String dono, double saldo, boolean status) {
        this.numeroDaConta = numeroDaConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void abrirConta() {
        if (tipo.equals("CC")) {
            System.out.println("Parabéns " + dono + " você abriu uma conta corrente e ganhou R$50");
            saldo = 50;
        } else {
            System.out.println("Parabéns " + dono + "  você abriu uma conta poupança e ganhou R$150");
            saldo = 150;
        }
        status = true;
        pagarMensal();
    }

    public void fecharConta() {
        if (saldo != 0) {
            System.out.println("Seu saldo é " + saldo + " acerte o valor antes de fechar a conta!");
        } else {
            System.out.println("Conta fechada!");
            status = false;
        }
    }

    public void depositar(double valor) {
        if (status) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void sacar(double valor) {
        if (!status) {
            System.out.println("Conta não encontrada!");
        } else if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");

        } else {
            System.out.println("Operação não pode ser realizada, saldo insuficiente!");
        }
    }

    public void pagarMensal() {
        if (tipo.equals("CC")) {
            System.out.println("Desconto mensal R$ -12");
            saldo = saldo - 12;
        } else {
            System.out.println("Desconto mensal R$ -20");
            saldo = saldo - 20;

        }
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Correntista: " +
                dono + ", numeroDaConta: " + numeroDaConta +
                ", tipo de conta: " + tipo + ", saldo: " +
                saldo;
    }
}
