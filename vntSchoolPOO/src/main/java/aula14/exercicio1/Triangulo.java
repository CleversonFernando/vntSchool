package aula14.exercicio1;

public class Triangulo {

    double a;
    double b;
    double c;

    double calcularArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
