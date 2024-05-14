package es.iesmz.ed.algoritmos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    void testHiperpar(){
        assertTrue(Hyperpar.isHyperpar(24680));
    }

    @Test
    void testNoHiperpar(){
        assertFalse(Hyperpar.isHyperpar(2568));
    }

    @Test
    void test0(){
        assertTrue(Hyperpar.isHyperpar(0));
    }

    @Test
    void testHiperparNegativo(){
        assertTrue(Hyperpar.isHyperpar(-2684));
    }

    @Test
    void testNoHiperparNegativo(){
        assertFalse(Hyperpar.isHyperpar(-1256));
    }
}