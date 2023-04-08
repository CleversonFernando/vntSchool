package aula28.exercicio1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {

    @Test
    public void somarValorEsperadoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.somar(2, 3);
        double esperado = 5;
        Assertions.assertEquals(esperado, atual);
    }

    @Test
    public void somarValorEsperadoNaoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.somar(2, 3);
        double esperado = 4;
        Assertions.assertNotEquals(esperado, atual);
    }

    @Test
    public void subtrairValorEsperadoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.subtrair(3, 2);
        double esperado = 1;
        Assertions.assertEquals(esperado, atual);
    }

    @Test
    public void subtrairValorEsperadoNaoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.subtrair(3, 2);
        double esperado = 4;
        Assertions.assertNotEquals(esperado, atual);
    }

    @Test
    public void dividirValorEsperadoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.dividir(4, 2);
        double esperado = 2;
        Assertions.assertEquals(esperado, atual);

    }

    @Test
    public void dividirValorEsperasdoNaoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.dividir(4, 2);
        double esperado = 4;
        Assertions.assertNotEquals(esperado, atual);
    }

    @Test
    public void multiplicarValorEsperadoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.multiplicar(2, 3);
        double esperado = 6;
        Assertions.assertEquals(esperado, atual);

    }

    @Test
    public void multiplicarValorEsperadoNaoAssert() {
        Calculadora calculadora = new Calculadora();
        double atual = calculadora.multiplicar(2, 3);
        double esperado = 4;
        Assertions.assertNotEquals(esperado, atual);
    }
}