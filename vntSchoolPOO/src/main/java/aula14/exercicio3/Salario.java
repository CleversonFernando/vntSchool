package aula14.exercicio3;

public class Salario {
    public double salario;
    public double percentual;

    double calcularAumento() {
        salario = salario + salario * percentual;
        percentual = percentual * 2;
        return salario;
    }

    public void imprimirSalario(Integer ano, double valor) {
        System.out.printf("Salario no ano de %d %.2f %n", ano, valor);

    }
}
