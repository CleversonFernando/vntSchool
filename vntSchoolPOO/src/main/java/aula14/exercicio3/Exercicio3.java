package aula14.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        int anoInicio = 2016;

        Salario salario = new Salario();
        salario.percentual = 0.015;
        salario.salario = 2000.0;

        for (int i = (anoInicio+1); i <= 2022; i++) {
            System.out.printf("Salario no ano de %d %.2f %n", i, salario.calcularAumento());
        }
    }
}
