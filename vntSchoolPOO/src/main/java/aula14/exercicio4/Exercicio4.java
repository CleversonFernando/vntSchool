package aula14.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {

        Decaimento uranio = new Decaimento(50.0, 0.5);

        System.out.printf("Massa inicial %.2fg%n", uranio.getPeso());
        uranio.calcularDecaimentoEmHoras();
        System.out.printf("Massa final %.4fg%n", uranio.getPesoFinal());
    }
}
