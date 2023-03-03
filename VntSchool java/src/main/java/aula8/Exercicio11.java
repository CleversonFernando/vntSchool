package aula8;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor: ");
        double valor = sc.nextDouble();
        String texto;

        if (valor >= 0 && valor < 25) {texto = "([0,25]";}
        else if (valor >= 25 && valor < 50) {texto = "([25,50]";}
        else if (valor >= 50 && valor < 75) {texto = "([50,75]";}
        else if (valor >= 75 && valor <= 100) {texto = "([75,100])";}
        else {texto = "Fora do intervalo!";}

        System.out.println("Intervalo " + texto);

        sc.close();
    }
}