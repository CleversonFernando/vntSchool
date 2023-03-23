package aula16.exercicio3;

public class OperacaoMatematica {

    private String texto;

    public String parOuImpar(int numero) {
        if (numero % 2 == 0) {
            texto = "Número par!";
        } else {
            texto = "Número impar!";
        }
        return texto;
    }

    public String negativoOuPositivo(int numero) {
        if (numero > 0) {
            texto = "Número positivo!";
        } else if (numero < 0) {
            texto = "Número negativo!";

        } else {
            texto = "Número é igual a zero!";
        }
        return texto;
    }
}