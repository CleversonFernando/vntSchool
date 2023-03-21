package aula17.exercicio1;

public class Motor implements ControladorCarro {

    private boolean ligado;
    private boolean gasoliona;

    @Override
    public boolean ligar() {
        if (gasoliona && !ligado) {
            ligado = true;
            System.out.println("O motor foi ligado!");
        } else if (!gasoliona) {
            ligado = false;
            System.out.println("Motor desligado!");
        } else {
            System.out.println("O motor foi ligado!");
        }
        return ligado;
    }

    @Override
    public boolean temGasolina() {
        return gasoliona;
    }

    public Motor(boolean ligado, boolean gasoliona) {
        this.ligado = ligado;
        this.gasoliona = gasoliona;
    }
}
