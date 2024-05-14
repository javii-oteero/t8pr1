package es.iesmz.ed.algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase crea objetos capaces de identificar el número distinto de dígitos en un año
 * @author Sopacasera
 * @version 1.0 14/05/2024
 */

public class Anyo {

    // Campo de la clase
    private long anyo;

    /**
     * Constructor para la clase
     * @param anyo el año a comprobar los dígitos distintos
     */
    public Anyo(long anyo){
        this.anyo = anyo;
    }

    /**
     * Método para calcular el número de dígitos diferentes en el año
     * @return el número de dígitos diferentes
     */
    public int digitosDiferentes(){
        String anyoStr = Long.toString(anyo);
        List<Character> digitosUnicos = new ArrayList<>();

        for (int i = 0; i < anyoStr.length(); i++) {
            char digito = anyoStr.charAt(i);
            if (!digitosUnicos.contains(digito)) {
                digitosUnicos.add(digito);
            }
        }

        return digitosUnicos.size();
    }
}
