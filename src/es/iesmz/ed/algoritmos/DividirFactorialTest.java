package es.iesmz.ed.algoritmos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DividirFactorialTest {

    @Test
    public void testDivisionWhenNumeradorEqualsDenominador() {
        DividirFactorial df = new DividirFactorial(5, 5);
        assertEquals(1, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenNumeradorGreaterThanDenominador() {
        DividirFactorial df = new DividirFactorial(5, 3);
        assertEquals(20, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenDenominadorGreaterThanNumerador() {
        DividirFactorial df = new DividirFactorial(3, 5);
        assertEquals(0.05, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenBothAreZero() {
        DividirFactorial df = new DividirFactorial(0, 0);
        assertEquals(1, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenNumeradorIsZero() {
        DividirFactorial df = new DividirFactorial(0, 5);
        assertEquals(0.0083, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenBothAreNegative() {
        DividirFactorial df = new DividirFactorial(-5, -3);
        assertEquals(0, df.division(), 0.001);
    }

    @Test
    public void testDivisionWhenOneIsNegative() {
        DividirFactorial df = new DividirFactorial(5, -3);
        assertEquals(0, df.division(), 0.001);
    }
}
