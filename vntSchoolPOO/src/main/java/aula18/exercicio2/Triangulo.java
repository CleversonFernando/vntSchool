package aula18.exercicio2;

public class Triangulo implements FormaGeometrica {

    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    @Override
    public String getNomeFigura() {
        return "Triangulo";

    }

    @Override
    public double getArea() {
        if (base > 0 && altura > 0) {
            return (base * altura) / 2;
        } else if (verificaTriangulo()) {
            double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        } else {
            System.out.println("Medidas não formam triangulo!");
            return 0;
        }
    }

    @Override
    public double getPerimetro() {
        if (base > 0 && altura > 0) {
            double hipotenusa = Math.sqrt(Math.pow(base, 2) + (Math.pow(altura, 2)));
            return hipotenusa + base + altura;
        } else if (verificaTriangulo()) {
            return ladoA + ladoB + ladoC;
        } else {
            return 0;
        }
    }

    public boolean verificaTriangulo() {
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            return true;
        } else {
            return false;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

}
