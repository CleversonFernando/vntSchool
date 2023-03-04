package aula8;

import java.util.Scanner;

public class Exercicio13 {

    static double calcularImposto(double valor, double porcentagem) {
        return valor + valor * porcentagem;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a renda: ");
        double valor = sc.nextDouble();

        if (valor < 0) {
            System.out.println("Valor deve ser maior que zero!");
        } else {
            String texto;
            double porcentagem;
            double total = 0;
            if (valor >= 0 && valor < 1903.99) {
                texto = "Isento!";
            } else if (valor >= 1903.99 && valor < 2826.66) {
                porcentagem = 0.075;
                total = calcularImposto(valor, porcentagem);
                texto = "7,5%";
            } else if (valor >= 2826.66 && valor < 3751.06) {
                porcentagem = 0.15;
                total = calcularImposto(valor, porcentagem);
                texto = "15%";
            } else if (valor >= 3751.06 && valor <= 4664.68) {
                porcentagem = 0.225;
                total = calcularImposto(valor, porcentagem);
                texto = "22,5%";
            } else {
                porcentagem = 0.275;
                total = calcularImposto(valor, porcentagem);
                texto = "27.5%";
            }
            System.out.println("Porcentagem: " + texto + " Valor devido: " + total);
        }
        sc.close();
    }
}