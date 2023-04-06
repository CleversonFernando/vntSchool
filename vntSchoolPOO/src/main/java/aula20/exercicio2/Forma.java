package aula20.exercicio2;

public abstract class Forma {

    protected Cor cor;

    abstract double area();

    public Cor getCor(Cor cor) {
        return this.cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
