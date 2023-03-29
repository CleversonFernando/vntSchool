package aula22.exercicio1;

public class FuncionarioTercerizado extends Funcionario{

    private double despesaAdicional;

    public FuncionarioTercerizado(String nome, double horas, double valorPorHoras, double despesaAdicional) {
        super(nome, horas, valorPorHoras);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return getHoras() * getValorPorHoras() + (despesaAdicional * 1.1);
    }
    @Override
    public String toString() {
        return  "Funcionario: " + getNome() + " Total Pagamento: " +  pagamento();
    }
}
