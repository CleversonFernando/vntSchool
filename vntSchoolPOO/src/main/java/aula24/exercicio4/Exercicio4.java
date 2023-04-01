package aula24.exercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Exercicio4 {

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public static void imprimirLista() {
        System.out.println("Lista de funcionários:");
        for (Funcionario item : funcionarios) {
            System.out.printf("%d, %s, %.2f%n", item.getId(), item.getNome(), item.getSalario());
        }
    }

    public static List<Funcionario> funcionarios = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    static boolean confirmarInformacoes;

    public static void main(String[] args) {
        do {
            try {
                confirmarInformacoes = true;
                System.out.println("Quantos funcionários serão registrados?");
                int numeroDeFuncionarios = sc.nextInt();
                if (numeroDeFuncionarios <= 0) {
                    System.out.println("Valor não pode ser menor ou igual a zero!");
                    confirmarInformacoes = false;
                } else {
                    cadastrarFuncionario(numeroDeFuncionarios);
                }
            } catch (InputMismatchException e) {
                System.out.println("Valores inválidos!");
                confirmarInformacoes = false;
                sc.next();
            }
        } while (!confirmarInformacoes);

        int escolha = 1;
        do {
            try {
                System.out.println("Deseja realizar um aumento? [1]-SIM [0]-NÃO");
                escolha = sc.nextInt();
                if (escolha == 1) {
                    System.out.println("Entre com o Id do funcionário que vai receber aumento:");
                    int idAumento = sc.nextInt();
                    System.out.println("Entre com a porcentagem:");
                    int porcentagem = sc.nextInt();

                    for (Funcionario item : funcionarios) {
                        if (item.getId() == idAumento) {
                            item.aumentoSalario(porcentagem);
                        }
                    }
                } else {
                    System.out.println("Fim do programa!");
                    escolha = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valores inválidos!");
                sc.next();
            }
        } while (escolha == 1);

        imprimirLista();
        sc.close();
    }

    public static void cadastrarFuncionario(int numeroDeFuncionarios) {
        int i = 1;
        int id;
        do {
            try {
                confirmarInformacoes = true;
                for (; i <= numeroDeFuncionarios; i++) {
                    System.out.println("Funcionário #" + i);
                    System.out.println("Id:");
                    id = sc.nextInt();
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Salário: ");
                    double salario = sc.nextDouble();
                    if (id <= 0 || salario <= 0) {
                        System.out.println("Valores devem ser maiores que zero!");
                        i--;
                    } else {
                        if (funcionarios.isEmpty()) {
                            Funcionario f1 = new Funcionario(id, nome, salario);
                            funcionarios.add(f1);
                        } else {
                            int j;
                            for (j = 0; j < (funcionarios.size()); j++) {
                                if (funcionarios.get(j).getId().equals(id)) {
                                    System.out.println("Id já cadastrado no sistema, favor escolher outro id!");
                                    i--;
                                    break;
                                } else {
                                    if (j == funcionarios.size() - 1) {
                                        Funcionario f1 = new Funcionario(id, nome, salario);
                                        funcionarios.add(f1);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (
                    InputMismatchException e) {
                System.out.println("Valores inválidos!");
                confirmarInformacoes = false;
                limparBuffer(sc);
            }
        } while (!confirmarInformacoes);
    }
}
