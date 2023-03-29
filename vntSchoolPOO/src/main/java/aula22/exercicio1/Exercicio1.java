package aula22.exercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    private static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static void main(String[] args) {


        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean informacoesCorretas;
        do {
            try {
                informacoesCorretas = true;
                System.out.println("Entre com o número de funcionários que deseja cadastrar:");
                int numeroDeFuncionarios = sc.nextInt();
                if (numeroDeFuncionarios <= 0) {
                    System.out.println("Número de funcionários deve ser maior que zero!");
                    informacoesCorretas = false;
                } else {
                    do {
                        try {
                            informacoesCorretas = true;
                            for (int i = 1; i <= numeroDeFuncionarios; i++) {
                                System.out.println("Funcionário " + i);
                                System.out.println("O funcionário é terceiro?[1]-SIM [0]-NÃ0");
                                int escolhaDoFuncionario = sc.nextInt();

                                limparBuffer(sc);
                                if (escolhaDoFuncionario == 1) {
                                    System.out.println("Entre com o nome:");
                                    String nome = sc.nextLine();
                                    System.out.println("entre com as horas trabalhadas:");
                                    int horas = sc.nextInt();
                                    System.out.println("Entre com o valor da hora:");
                                    double valorDaHora = sc.nextDouble();
                                    System.out.println("Entre com o valor da despesa adicional:");
                                    double despesaAdicional = sc.nextDouble();
                                    if (horas > 0 && valorDaHora > 0 && despesaAdicional >= 0) {
                                        Funcionario f1 = new FuncionarioTercerizado(nome, horas, valorDaHora, despesaAdicional);
                                        funcionarios.add(f1);
                                    } else {
                                        System.out.println("Valores devem ser maior que zero!");
                                        i--;
                                    }
                                } else if (escolhaDoFuncionario == 0) {
                                    System.out.println("Entre com o nome:");
                                    String nome = sc.nextLine();
                                    System.out.println("entre com as horas trabalhadas:");
                                    int horas = sc.nextInt();
                                    System.out.println("Entre com o valor da hora:");
                                    double valorDaHora = sc.nextDouble();
                                    if (horas > 0 && valorDaHora > 0) {
                                        Funcionario f1 = new Funcionario(nome, horas, valorDaHora);
                                        funcionarios.add(f1);
                                    } else {
                                        System.out.println("Valores devem ser maior que zero!");
                                        i--;
                                    }
                                } else {
                                    System.out.println("Opção inválida!");
                                    i--;
                                }
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Favor iserir valores válidos!");
                            informacoesCorretas = false;
                            limparBuffer(sc);
                        }
                    } while (!informacoesCorretas);
                }
            } catch (InputMismatchException e) {
                System.out.println("Favor iserir valores válidos!");
                informacoesCorretas = false;
                limparBuffer(sc);
            }
        } while (!informacoesCorretas);

        System.out.println(funcionarios);
        sc.close();
    }
}
