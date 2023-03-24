package aula20.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double depositoInicial = 0;
        boolean verificador;
        int escolha;

        ContaJuridica conta1 = new ContaJuridica(depositoInicial);

        do {
            try {
                verificador = true;
                System.out.println("Entre com o número de uma nova conta:");
                conta1.setNumeroDeConta(sc.nextInt());
                System.out.println("Entre com o nome do cliente:");
                conta1.setProprietario(sc.next());
            } catch (InputMismatchException e) {
                System.out.println("Favor digitar valores válidos!");
                verificador = false;
                sc.next();
            }
        } while (!verificador);

        verificador = false;

        do {
            try {
                System.out.println("Escolha a operação:");
                System.out.println("[1]- Depositar:");
                System.out.println("[2]- Sacar:");
                System.out.println("[3]- Empréstimo:");
                System.out.println("[4]- Mostrar balanço:");
                System.out.println("[5]- Sair:");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Digite o valor do deposito:");
                        conta1.deposito(sc.nextDouble());
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque:");
                        conta1.saque(sc.nextDouble());
                        break;
                    case 3:
                        System.out.println("Digite o valor do empréstimo:");
                        conta1.emprestimo(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("Balanço:");
                        System.out.println(conta1);
                        break;
                    case 5:
                        System.out.println("Obrigado!");

                        verificador = true;
                        System.out.println(conta1);
                        break;
                    default:
                        System.out.println("Por favor escolha uma opção válida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Favor digitar valores válidos!");
                sc.next();
            }
        } while (!verificador);
    }
}
