package aula2;

import java.awt.*;

public class Exercicio2 {

    public static void main(String[] args) {

        //programa para identificar a resolução da tela

        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        double largura = tamanhoTela.getWidth();
        double altura = tamanhoTela.getHeight();
        System.out.println("Sua resolução está em " + largura + "px de largura e " + altura + "px de altura.");
    }
}
