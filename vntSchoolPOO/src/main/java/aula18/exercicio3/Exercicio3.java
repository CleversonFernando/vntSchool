package aula18.exercicio3;

//        Crie um programa que contenha três classes conforme apresentado no diagrama ao lado.
//        O programa deve apresentar duas pessoas contendo nome,
//        a linguagem de programação que trabalha e quantos anos de experiência.
//        Faça um contrato através da interfac
//        e e depois implemente os métodos.
//        Instancia o objeto Maria que trabalha a 15 anos com Python e Joãoque trabalha a 10 anos com Java.

public class Exercicio3 {

    public static void main(String[] args) {

        LinguagemPrograma funcionario1 = new LinguagemPrograma("Maria", "Python", 15);
        funcionario1.pessoa();
        funcionario1.linguagemDeProgramacao();
        funcionario1.experiencia();

        LinguagemPrograma funcionario2 = new LinguagemPrograma("João", "Java", 10);
        funcionario2.pessoa();
        funcionario2.linguagemDeProgramacao();
        funcionario2.experiencia();

    }
}
