package aula18.exercicio4;

public class LinguagemPrograma implements Linguagem {

    public String nome;
    public String linguagem;
    public Integer experiencia;

    public LinguagemPrograma(String nome, String linguagem, Integer experiencia) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.experiencia = experiencia;
    }

    @Override
    public void linguagemDeProgramacao() {
        System.out.printf("Linguagem que trabalha: %s%n", linguagem);

    }

    @Override
    public void pessoa() {
        System.out.printf("Funcionário: %s%n", nome);

    }

    @Override
    public void experiencia() {
        System.out.printf("Tempo de experiência: %d anos %n", experiencia);

    }
}
