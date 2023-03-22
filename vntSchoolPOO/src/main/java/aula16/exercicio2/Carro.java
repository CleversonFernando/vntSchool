package aula16.exercicio2;

public class Carro {

    public String cor;
    public String marca;
    public Integer ano;
    public Integer marcha;
    public boolean ligado;
    public double velocidadeAtual;
    public double velocidadeMaxima;

    public Carro(Integer marcha, boolean ligado, double velocidadeMaxima) {
        this.marcha = marcha;
        this.ligado = ligado;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    void ligar() {
        if (!ligado) {
            System.out.printf("O carro foi ligado! %n%n");
            ligado = true;
        }
    }

    void desligar() {
        System.out.printf("Carro foi desligado! %n%n");
        ligado = false;
    }

    void acelerar() {
        ligar();
        if (marcha >= 0) {
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            velocidadeAtual = velocidadeAtual + 10;
            System.out.println("Acelerando velocidade atual " + velocidadeAtual);

        } else if (marcha == -1 && velocidadeAtual > 0) {
            velocidadeAtual = 0;
            velocidadeAtual = velocidadeAtual - 10;
            System.out.println("Acelerando velocidade atual " + velocidadeAtual);
        } else {
            velocidadeAtual = velocidadeAtual - 10;
            System.out.println("Acelerando velocidade atual " + velocidadeAtual);
        }
        pegarmarcha(marcha);
    }

    void pegarmarcha(Integer marcha) {
        this.marcha = marcha;
        if (marcha == 0 && velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        if (velocidadeAtual <= 0 && velocidadeAtual >= -30 || marcha == -1) {
            System.out.printf("Engatado ré! Marcha %d %n%n", marcha);
        } else if (velocidadeAtual == 0 && marcha == 0) {
            System.out.println("Ponto morto! Marcha %n" + marcha);
        } else if (velocidadeAtual > 0 && velocidadeAtual < 40) {
            marcha = 1;
            System.out.printf("Velocidade média! Marcha %d %n%n", marcha);
        } else if (velocidadeAtual >= 40 && velocidadeAtual <= velocidadeMaxima) {
            marcha = 2;
            System.out.printf("Velocidade alta! Marcha %d %n%n", marcha);
        } else {
            marcha = 3;
            System.out.printf("Velocidade incompatível com o veículo! Marcha %d %n%n", marcha);
        }

    }

    public Carro() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "cor: " + cor + ", marca: " + marca + ", ano: " + ano;
    }
}
