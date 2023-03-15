package aula14.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();
        conversor.precoDolar = 5;
        conversor.IOF = 0.06;
        conversor.reais = 100.0;
        System.out.printf("Valor total em reais: R$%.2f ",conversor.conversorDolar());
    }
}
