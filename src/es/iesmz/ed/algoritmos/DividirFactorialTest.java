package es.iesmz.ed.algoritmos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DividirFactorialTest {

    @Test
    public void testDivisionNumeradorYDenominadorPositivos() {
        DividirFactorial prueba = new DividirFactorial(5, 3);
        assertEquals(20.0, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorPositivoYDenominadorNegativo() {
        DividirFactorial prueba = new DividirFactorial(6, -3);
        assertEquals(6.0, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorNegativoYDenominadorPositivo() {
        DividirFactorial prueba = new DividirFactorial(-4, 7);
        assertEquals(1.0, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorYDenominadorNegativos() {
        DividirFactorial prueba = new DividirFactorial(-2, -5);
        assertEquals(2.0, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorCeroYDenominadorPositivo() {
        DividirFactorial prueba = new DividirFactorial(0, 3);
        assertEquals(1.0, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorPositivoYDenominadorCero() {
        DividirFactorial prueba = new DividirFactorial(4, 0);
        assertEquals(Double.POSITIVE_INFINITY, prueba.division(), 0.0001);
    }

    @Test
    public void testDivisionNumeradorYDenominadorCero() {
        DividirFactorial prueba = new DividirFactorial(0, 0);
        assertEquals(Double.NaN, prueba.division(), 0.0001);
    }
}
