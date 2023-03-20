package aula14.exercicio4;

public class Decaimento {

    private double peso;
    private double pesoFinal;
    private double taxaDeDecaimento;
    private double limiteDePesoMinimo;
    private double tempo;

    public Decaimento(double peso, double taxaDeDecaimento, double limiteDePesoMinimo) {
        this.peso = peso;
        this.taxaDeDecaimento = taxaDeDecaimento;
        this.limiteDePesoMinimo = limiteDePesoMinimo;
    }

    public double calcularDecaimentoEmMinutos() {
        for (double i = peso; i > limiteDePesoMinimo; i = peso) {
            peso *= taxaDeDecaimento;
            tempo = tempo + 50;
        }
        pesoFinal = peso;
        return tempo / 60;
    }

    public double calcularDecaimentoEmHoras() {
        tempo = calcularDecaimentoEmMinutos();
        return tempo / 60;

    }

    public double getPeso() {
        return peso;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

}

