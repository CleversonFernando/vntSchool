package aula14.exercicio2;

public class Conversor {

    double precoDolar;
    double reais;
    double IOF;

    double conversorDolar() {
        double total = reais * precoDolar;
        total = total - (total * IOF);
        return total;
    }
}
