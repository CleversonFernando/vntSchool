package aula16.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {

        Carro carro1 = new Carro(0, false, 90);
        carro1.cor = "Branco";
        carro1.marca = "Fiat";
        carro1.ano = 2000;
        carro1.ligar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.desligar();
        System.out.println(carro1);

        Carro carro2 = new Carro(0, false, 60);
        carro2.cor = "Preto";
        carro2.marca = "Ford";
        carro2.ano = 2017;
        carro2.ligar();
        carro2.pegarmarcha(-1);
        carro2.acelerar();
        carro2.acelerar();
        carro2.desligar();

        System.out.println(carro2);


    }
}