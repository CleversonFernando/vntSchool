package aula26.exercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercicio3 {

    public static void main(String[] args) {

        String caminho = "src/main/java/aula26/exercicio3/Funcionarios.txt";
        List<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor limite de salário:");
        double limiteSalario = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();
            while (linha != null) {
                String[] vector = linha.split(",");
                String nome = vector[0];
                String email = vector[1];
                double salario = Double.parseDouble(vector[2]);

                Funcionario f1 = new Funcionario(nome, email, salario);
                funcionarios.add(f1);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Email cujo salário do funcionário é maior que " + limiteSalario);
        Collections.sort(funcionarios);
        funcionarios.stream().filter(salarioAcima -> salarioAcima.getSalario() > limiteSalario)
                .forEach(salarioEncontrado -> System.out.println(salarioEncontrado.getEmail()));

        System.out.println("Soma do salário das pessoas iniciadas com a letra M:");
        Double listaComALetraM = funcionarios.stream().filter(funcionario -> funcionario.getNome().toUpperCase().startsWith("M"))
                .map(Funcionario::getSalario).reduce(0.0, Double::sum);

        System.out.println(listaComALetraM);

        sc.close();
    }
}
