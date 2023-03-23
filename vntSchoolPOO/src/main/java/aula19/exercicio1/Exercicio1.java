package aula19.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        Gerente g1 = new Gerente(124);

        g1.setNome("Fernando");
        g1.apresentar();

        if (g1.autenticar(123)) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");

        }
    }
}

