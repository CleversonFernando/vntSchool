package aula14.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {

        Decaimento uranio = new Decaimento(100.0, 0.5, 0.5);

        System.out.printf("Massa inicial %.2fgm%n", uranio.getPeso());
        System.out.printf("Tempo de decaimento em Minutos %.1fmin - Tempo de decaimento em Horas %.4fhs%n"
                , uranio.calcularDecaimentoEmMinutos(), uranio.calcularDecaimentoEmHoras());
        System.out.printf("Massa final %.4f %n", uranio.getPesoFinal());
    }
}
