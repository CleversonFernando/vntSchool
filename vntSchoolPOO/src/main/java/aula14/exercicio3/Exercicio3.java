package aula14.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        int anoInicio = 2016;
        int anoLimite = 2022;

        Salario funcionario1 = new Salario();
        funcionario1.percentual = 0.015;
        funcionario1.salario = 2000.00;

        funcionario1.imprimirSalario(anoInicio, funcionario1.salario);

        for (int i = (anoInicio + 1); i <= anoLimite; i++) {
            funcionario1.imprimirSalario(i, funcionario1.calcularAumento());
        }
    }
}
