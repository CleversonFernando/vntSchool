package aula14.exercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudante estudante1 = new Estudante();

        boolean valoresOk;

        do {
            try {
                System.out.println("Entre com o nome do aluno:");
                estudante1.setNome(sc.next());
                System.out.println("Entre com a primeira nota do aluno:");
                estudante1.setNota1(sc.nextDouble());
                System.out.println("Entre com a segunda nota do aluno:");
                estudante1.setNota2(sc.nextDouble());
                System.out.println("Entre com a terceira nota do aluno:");
                estudante1.setNota3(sc.nextDouble());
                valoresOk = false;
            } catch (
                    InputMismatchException e) {
                System.out.println("Favor inserir valores válidos!");
                valoresOk = true;
                sc.next();
            }
        } while (valoresOk);
        System.out.println("Aluno " + estudante1.getNome());
        System.out.println("Nota final " + estudante1.calcularNotaFinal());
        System.out.println("Resultado " + estudante1.verificarAprovação());


        sc.close();
    }
}
