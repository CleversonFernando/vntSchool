package aula16.exercicio1;

public class ContaCorrente implements ContaBanco{

    String nome;
    double total;

    boolean status = false;

    public ContaCorrente(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrirConta() {
        System.out.println("Parabéns você abriu uma conta corrente e ganhou R$50,0");
        total = 50;
        status = true;

    }

    @Override
    public void mostrarConta() {
        if (status) {
            System.out.print("Cliente: " + nome + " Saldo da conta: R$" + total);
        }else {
            System.out.println("A conta não foi aberta!");
        }
    }
}
