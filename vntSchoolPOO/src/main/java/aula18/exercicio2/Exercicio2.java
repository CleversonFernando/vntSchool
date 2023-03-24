package aula18.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {

        String unidadeDeMedida = "cm";
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(3);
        System.out.println(quadrado1.getNomeFigura());
        System.out.printf("Area: %.2f%s²%n", quadrado1.getArea(), unidadeDeMedida);
        System.out.printf("Perímetro: %.2f%s%n", quadrado1.getPerimetro(), unidadeDeMedida);
        System.out.printf("lado: %.2f%s%n", quadrado1.getLado(), unidadeDeMedida);

        Triangulo triangulo1 = new Triangulo();
        System.out.println(triangulo1.getNomeFigura());
        triangulo1.setBase(8);
        triangulo1.setAltura(15);
        System.out.printf("Area: %.2f%s²%n", triangulo1.getArea(), unidadeDeMedida);
        System.out.printf("Perímetro: %.2f%s%n", triangulo1.getPerimetro(), unidadeDeMedida);

        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2.getNomeFigura());

        triangulo2.setLadoA(2.25);
        triangulo2.setLadoB(1.1);
        triangulo2.setLadoC(1.5);
        System.out.printf("Area: %.2f%s²%n", triangulo2.getArea(), unidadeDeMedida);
        System.out.printf("Perímetro: %.2f%s%n", triangulo2.getPerimetro(), unidadeDeMedida);


    }
}
