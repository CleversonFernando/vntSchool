package aula18.exercicio2;

public class Quadrado implements FormaGeometrica {

    private double lado;

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lado * lado;

    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
