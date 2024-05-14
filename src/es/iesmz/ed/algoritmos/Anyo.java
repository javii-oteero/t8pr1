package es.iesmz.ed.algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase crea objetos capaces de identificar el numero distinto de digitos en un anyo
 * @author Sopacasera
 * @version 1.1 14/05/2024
 */

public class Anyo {

    // Campo de la clase
    private long anyo;

    /**
     * Constructor para la clase
     * @param anyo el anyo a comprobar los digitos distintos
     */
    public Anyo(long anyo){
        this.anyo = anyo;
    }

    /**
     * Metodo para calcular el numero de digitos diferentes en el anyo
     * @return el numero de digitos diferentes
     */
    public int digitosDiferentes(){
        String anyoStr = Long.toString(Math.abs(anyo));
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
