package aula3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado, somar, dividir, multiplicar, subtrair;

        System.out.println("Etre com o primeiro valor:");
        numero1 = sc.nextDouble();
        System.out.println("Etre com o segundo valor:");
        numero2 = sc.nextDouble();
        // soma
        somar = numero1 + numero2;
        //subtrair
        subtrair = numero1 - numero2;
        //multiplicar
        multiplicar = numero1 * numero2;
        //dividir
        dividir = numero1 / numero2;

        System.out.println("Resultado soma:" + somar);
        System.out.println("Resultado subtração:" + subtrair);
        System.out.printf("Resultado divisão: %.3f\n",  dividir);
        System.out.println("Resultado multioplicação:" + multiplicar);





    }
}
