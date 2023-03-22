package aula14.exercicio5;

public class Retangulo {

    private double altura;
    private double largura;

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    double calcularDiagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
