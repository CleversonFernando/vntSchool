package aula20.exercicio2;

public class Circulo extends Forma{

    private double raio;

    public double area(){
        return (Math.PI * Math.pow(raio,2));

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circulo{");
        sb.append("raio=").append(raio);
        sb.append(", cor=").append(cor);
        sb.append('}');
        return sb.toString();
    }
}
