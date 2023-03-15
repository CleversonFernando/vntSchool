package aula13;

public class Exercicio1 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Branco";
        carro1.modelo = "corsa";
        carro1.velocidade = 0.0;
        carro1.acelerar();
        carro1.frear();
        carro1.acenderFarol();

        System.out.println(carro1);
    }
}
