package es.iesmz.ed.algoritmos;

import java.util.ArrayList;

/**
 * Esta clase proporciona la funcionalidad para dividir los factoriales de dos números enteros.
 * @author Sopacasera
 * @version 1.0 14/05/2024
 */
public class DividirFactorial {
    // Campos de la clase
    private int numerador;
    private int denominador;

    /**
     * Constructor para la clase DividirFactorial
     * @param numerador El numerador de la división
     * @param denominador El denominador de la división
     */
    public DividirFactorial(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Método para realizar la división de los factoriales de los números dados
     * @return El resultado de la división de los factoriales
     */
    public double division(){
        if (numerador == denominador) return 1;
        if (numerador < 0 || denominador < 0) return 0;
        int result = 1;
        if (numerador > denominador){
            for (int i = denominador + 1; i <= numerador; i++) {
                result *= i;
            }
            return result;
        } else {
            for (int i = numerador + 1; i <= denominador; i++) {
                result *= i;
            }
            return (double) 1/result;
        }
    }

}
