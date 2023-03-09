package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    private static String posicionaQuadrante(String primeiro, String segundo) {
        int x = Integer.parseInt(primeiro);
        int y = Integer.parseInt(segundo);
        String texto = "";
        if (x > 0 && y > 0) texto = "Quadrante I";
        if (x < 0 && y > 0) texto = "Quadrante II";
        if (x < 0 && y < 0) texto = "Quadrante III";
        if (x > 0 && y < 0) texto = "Quadrante IV";
        if (x == 0 && y == 0) texto = "Ponto central";
        if (x == 0 && y != 0) texto = "Eixo Y";
        if (x != 0 && y == 0) texto = "Eixo X";
        return texto;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean i;
        do {
            System.out.println("Entre com o valor de X");
            String x = sc.nextLine();
            System.out.println("Entre com o valor de Y");
            String y = sc.nextLine();
            if (x == "" || y == "") {
                System.out.println("Algorítimo interrompido!");
                i = false;
            } else {
                i = true;
                System.out.println(posicionaQuadrante(x, y));
            }
        } while (i);

        sc.close();
    }
}

