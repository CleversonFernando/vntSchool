package aula13;

public class Exercicio1 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        System.out.println("Carro1");
        carro1.cor = "Branco";
        carro1.modelo = "corsa";
        carro1.velocidade = 0.0;
        carro1.acelerar();
        carro1.frear();
        carro1.acenderFarol();
        System.out.println(carro1);


        Carro carro2 = new Carro();
        System.out.println("Carro2");
        carro2.cor = "Preto";
        carro2.modelo = "Gol";
        carro2.velocidade = 70;
        carro2.acelerar();
        carro2.frear();
        carro2.acenderFarol();
        System.out.println(carro2);

        Carro carro3 = new Carro();
        System.out.println("Carro3");
        carro3.cor = "Cinza";
        carro3.modelo = "Palio";
        carro3.velocidade = 80;
        carro3.acelerar();
        carro3.frear();
        carro3.acenderFarol();

        System.out.println(carro3);
    }
}
