package es.iesmz.ed.algoritmos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnyoTest {

    @Test
    void testAnyoTodosDigitosDistintos(){
        Anyo a = new Anyo(1987);
        assertEquals(4, a.digitosDiferentes());
    }

    @Test
    void testAnyoUnDigitoRepetido(){
        Anyo a = new Anyo(2024);
        assertEquals(3, a.digitosDiferentes());
    }

    @Test
    void testAnyoSoloUnDigito(){
        Anyo a = new Anyo(1111);
        assertEquals(1, a.digitosDiferentes());
    }

    @Test
    void testAnyoDigitosRepetidosPorPares(){
        Anyo a = new Anyo(2002);
        assertEquals(2, a.digitosDiferentes());
    }

    @Test
    void testAnyoSinDigitosRepetidos(){
        Anyo a = new Anyo(2013);
        assertEquals(4, a.digitosDiferentes());
    }

    @Test
    void testAnyoNumeroNegativo(){
        Anyo a = new Anyo(-2021);
        assertEquals(3, a.digitosDiferentes());
    }
}
