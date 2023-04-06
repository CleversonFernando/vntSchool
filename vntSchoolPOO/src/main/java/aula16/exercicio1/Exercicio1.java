package aula16.exercicio1;


public class Exercicio1 {

    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco(0001,"CC", "João da Silva");
        ContaBanco conta2 = new ContaBanco(0002, "CP", "Maria Silva");

        conta1.abrirConta();
        conta1.depositar(300);
        conta1.fecharConta();
        conta1.sacar(338);
        conta1.fecharConta();
        System.out.println();

        conta2.abrirConta();
        conta2.depositar(400);
        conta2.fecharConta();
        conta2.sacar(530);
        conta2.fecharConta();
    }
}
