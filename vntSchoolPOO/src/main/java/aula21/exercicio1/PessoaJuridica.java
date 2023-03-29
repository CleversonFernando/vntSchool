package aula21.exercicio1;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String cnpj, String nome) {
        this.cnpj = cnpj;
        setNome(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String getNome() {

        return super.getNome() + " CNPJ: " + this.cnpj;

    }
}
