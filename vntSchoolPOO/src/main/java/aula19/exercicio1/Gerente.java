package aula19.exercicio1;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senhaDigitada) {
        if (this.senha == senhaDigitada) {
            return true;
        }
        return false;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
