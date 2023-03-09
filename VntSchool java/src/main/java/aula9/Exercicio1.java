package aula9;


import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Entre com o numero final:");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println(num1);
            while (num1 < num2) {
                num1++;
                System.out.println(num1);
            }
        } else {
            System.out.println(num1);
            while (num1 > num2) {
                num1--;
                System.out.println(num1);
            }
        }
    }
}