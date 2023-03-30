package aula22.exercicio3;

import java.util.Objects;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println(" Au au au au au ");
    }

    public void enterrarOsso() {
    }

    public void abanarRabo() {
        System.out.println(" Abanar ");
    }

    public void reagir(boolean falarFraseAgressiva) {
        if (!falarFraseAgressiva) {
            abanarRabo();
            emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(String horario) {
        if (Objects.equals(horario, "Manhã")) {
            System.out.print("Manhã: ");
            abanarRabo();
        } else if (Objects.equals(horario, "Tarde")) {
            System.out.print("Tarde: ");
            abanarRabo();
            emitirSom();
        } else if (Objects.equals(horario, "Noite")) {
            System.out.println("Noite: Ignorar");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void reagir(int idade, double peso) {
        if (getIdade() < 5 && getPeso() < 10) {
            System.out.print("Novo e leve: ");
            abanarRabo();
        } else if (getIdade() > 5 && getPeso() > 10) {
            System.out.println("Velho e pesado: Ignorar");
        } else if (getIdade() > 5 && getPeso() < 10) {
            System.out.println("Velho e leve: Rosnar");
        } else {
            System.out.println("Novo e pesado: ");
            emitirSom();
        }
    }

    public void reagir(int dono) {
        if (dono == 1) {
            System.out.print("É dono: ");
            abanarRabo();
        } else if (dono == 0) {
            System.out.print("Não é o dono: Rosnar");
            emitirSom();
        } else {
            System.out.println("Opção inválida!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cachorro{");
        sb.append("corDoPelo='").append(corDoPelo).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", idade=").append(idade);
        sb.append(", membros=").append(membros);
        sb.append('}');
        return sb.toString();
    }
}
