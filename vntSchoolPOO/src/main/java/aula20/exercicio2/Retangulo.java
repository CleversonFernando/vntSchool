package aula20.exercicio2;

public class Retangulo extends Forma{

    private double largura;
    private double altura;

    public double area(){
        return (altura * largura);

    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Retangulo{");
        sb.append("largura=").append(largura);
        sb.append(", altura=").append(altura);
        sb.append(", cor=").append(cor);
        sb.append('}');
        return sb.toString();
    }
}
