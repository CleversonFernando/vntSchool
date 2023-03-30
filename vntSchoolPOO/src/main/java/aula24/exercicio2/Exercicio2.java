package aula24.exercicio2;

import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {

    public static void main(String[] args) {


        Set<Integer> codigoAluno = new TreeSet<>();

        //Alunos do curso A: 3
        codigoAluno.add(21);
        codigoAluno.add(35);
        codigoAluno.add(22);

        //Alunos do curso B: 2
        codigoAluno.add(21);
        codigoAluno.add(50);

        //Alunos do curso C: 3
        codigoAluno.add(42);
        codigoAluno.add(35);
        codigoAluno.add(13);

        System.out.println("Total de estudantes: " + codigoAluno.size());
    }
}
