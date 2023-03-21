package aula16.exercicio1;

public class ContaPoupanca implements ContaBanco{

    String nome;
    double total;

    boolean status = false;

    public ContaPoupanca(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrirConta() {
        System.out.println("Parabéns você abriu uma conta poupanca e ganhou R$150,0");
        total = 150;
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
