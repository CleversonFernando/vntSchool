package aula21.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("23456", "Fer");

        PessoaJuridica pj = new PessoaJuridica("876543", "Escola");

        System.out.println(pf.getNome());
        System.out.println(pj.getNome());

    }
}
