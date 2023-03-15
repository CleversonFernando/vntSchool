package aula14.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        String maior;
        Triangulo x = new Triangulo();
        x.a = 9;
        x.b = 7;
        x.c = 14;
        double resultadoX = x.calcularArea();
        System.out.println("Triangulo X " + resultadoX);

        Triangulo y = new Triangulo();
        y.a = 26;
        y.b = 26;
        y.c = 20;
        double resultadoY = y.calcularArea();
        System.out.println("Triangulo Y " + resultadoY);
        if (resultadoX > resultadoY) {
            maior = "Maior Area é a do Triangulo X";
        } else {
            maior = "Maior Area é a do Triangulo y";
        }
        System.out.println(maior);
    }
}
