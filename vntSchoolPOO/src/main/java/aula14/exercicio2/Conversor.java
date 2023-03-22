package aula14.exercicio2;

public class Conversor {

    double precoDolar;
    double valorEmDolarDesejado;
    double IOF;

    double conversorDolar() {
        double total = valorEmDolarDesejado * precoDolar;
        total = total + (total * IOF);
        return total;
    }
}
