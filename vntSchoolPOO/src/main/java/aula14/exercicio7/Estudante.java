package aula14.exercicio7;

public class Estudante {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    double calcularNotaFinal() {
        return ((nota1 * 3) + (nota2 * 3.5) + (nota3 * 3.5)) / 10;
    }

    String verificarAprovação() {
        double nota = calcularNotaFinal();
        if (nota < 6) {
            nota = 6 - nota;
            return "Reprovado!  faltou " + nota + " para obter o valor mínimo para ser aprovado!";
        } else {
            return "Aprovado!";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
