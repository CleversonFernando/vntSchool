package aula16.exercicio1;


public class Exercicio1 {

    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        ContaBanco conta2 = new ContaBanco();

        conta1.setTipo("CC");
        conta1.setNumeroDaConta(0001);
        conta1.setDono("João da Silva");
        conta1.abrirConta();

        conta1.depositar(300);
        conta1.fecharConta();
        conta1.sacar(338);
        conta1.fecharConta();
        System.out.println();

        conta2.setTipo("CP");
        conta2.setNumeroDaConta(0002);
        conta2.setDono("Maria Silva");
        conta2.abrirConta();

        conta2.depositar(400);
        conta2.fecharConta();
        conta2.sacar(530);
        conta2.fecharConta();
    }
}
