package aula20.exercicio1;

public class ContaJuridica extends Conta {

    private double limiteEmprestimo = 1000;

    public ContaJuridica(double balanco) {
        super(balanco);
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            setBalanco(getBalanco() + valor);
            System.out.println("Emprestimo de " + valor + " concedido!");
        } else {
            System.out.println("Emprestimo negado! Tente um valor menor.");
        }
    }
}
