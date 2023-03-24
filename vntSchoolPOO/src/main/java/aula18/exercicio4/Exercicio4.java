package aula18.exercicio4;

//        Crie um programa que contenha três classes conforme apresentado no diagrama ao lado.
//        O programa deve apresentar duas pessoas contendo nome,
//        a linguagem de programação que trabalha e quantos anos de experiência.
//        Faça um contrato através da interfac
//        e e depois implemente os métodos.
//        Instancia o objeto Maria que trabalha a 15 anos com Python.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        boolean informacoesCorretas = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entre com o nome do funcionário:");
                String nome = sc.next();
                System.out.println("Entre com a linguagem que programa:");
                String linguagemDeProgramacao = sc.next();
                System.out.println("Entre com a experiência (anos)");
                Integer experiencia = sc.nextInt();

                LinguagemPrograma funcionario1 = new LinguagemPrograma(nome, linguagemDeProgramacao, experiencia);
                funcionario1.pessoa();
                funcionario1.linguagemDeProgramacao();
                funcionario1.experiencia();

            } catch (InputMismatchException e) {
                System.out.println("Idade deve ser um numero!");
                informacoesCorretas = false;
            }
        } while (!informacoesCorretas);

    }
}
