package aula20.exercicio1;

public class ContaJuridica extends Conta {

    private double limiteEmprestimo;

    public ContaJuridica(double balanco, double limiteEmprestimo) {
        super(balanco);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            deposito(getBalanco() + valor);
            System.out.println("Emprestimo de " + valor + " concedido!");
        } else {
            System.out.println("Emprestimo negado! Tente um valor menor.");
        }
    }
}
