package aula4;

import java.time.*;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        Scanner sc = new Scanner(System.in);

        int ano_atual = data.getYear();
        int mes_atual = data.getMonthValue();
        int dia_atual = data.getDayOfMonth();
        int ano_nascimento, mes_nascimento, dia_nascimento;
        int idade;

        System.out.println("Entre com o dia de nascimento:");
        dia_nascimento = sc.nextInt();
        System.out.println("Entre com o mês de nascimento:");
        mes_nascimento = sc.nextInt();
        System.out.println("Entre com o ano de nascimento:");
        ano_nascimento = sc.nextInt();

        idade = ano_atual - ano_nascimento;

        if (mes_atual < mes_nascimento || mes_atual == mes_nascimento && dia_atual < dia_nascimento) {
            idade--;
        }
        System.out.println("Idade:" + idade);
    }
}
