package aula13;

public class Carro {

    String cor;
    String modelo;
    double velocidade;
    void acelerar() {
        if (velocidade < 40) {
            velocidade = velocidade + 10;
            System.out.println("Acelerando!");

        } else if (velocidade <= 60) {
            velocidade = velocidade + 5;
            System.out.println("Acelerando!");

        } else {
            velocidade = velocidade + 0;
        }
    }
    void frear() {
        if (velocidade > 70) {
            velocidade = velocidade - 10;
            System.out.println("Freando!");

        } else {
            velocidade = velocidade + 0;
        }
    }

    void acenderFarol() {
        if (velocidade == 0) {
            System.out.println("Apagar farol!");
        } else {
            System.out.println("Acender farol!");
        }
    }

    @Override
    public String toString() {
        return "cor= " + cor + ", modelo= " + modelo + ", velocidade= " + velocidade;
    }
}
