package aula14.exercicio4;

public class Decaimento {

    private Integer meiaVida = 50;
    private double peso;
    private double pesoFinal;
    private double taxaDeDecaimento = 0.5;
    private double limiteDePesoMinimo;
    private double segundos;

    public Decaimento(double peso, double limiteDePesoMinimo) {
        this.peso = peso;
        this.limiteDePesoMinimo = limiteDePesoMinimo;
    }

    public void calcularDecaimentoEmMinutos() {
        for (double i = peso; i > limiteDePesoMinimo; i = peso) {
            peso *= taxaDeDecaimento;
            segundos = segundos + meiaVida;
        }
        pesoFinal = peso;;
    }

    public void calcularDecaimentoEmHoras() {
        calcularDecaimentoEmMinutos();
        double horas = Math.floor(segundos / 3600);
         double minutos = Math.floor((segundos - (horas * 3600)) / 60);
        System.out.printf("Tempo total %02.0f:%02.0f%n", horas, minutos);
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }
}