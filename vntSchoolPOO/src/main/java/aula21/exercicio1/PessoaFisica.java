package aula21.exercicio1;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String cpf , String nome) {
        this.cpf = cpf;
        setNome(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {

        return super.getNome() + " CPF: " + this.cpf;

    }
}

