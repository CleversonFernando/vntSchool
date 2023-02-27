package exerciciosAula;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a idade: ");
        int idade = sc.nextInt();
        String resultado = (idade >= 16 && idade <= 18) || (idade > 70) ? "Voto opcional" : "Voto obrigatório";
        System.out.println(resultado);

        sc.close();
    }
}
