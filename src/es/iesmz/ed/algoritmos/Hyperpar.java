package es.iesmz.ed.algoritmos;

import com.sun.security.jgss.GSSUtil;

/**
 * Esta clase define objetos que definen si un número es hiperpar
 * @author: Sopacasera
 * @version: 1.0 14/05/2024
 *
 */
public class Hyperpar {

    /**
     * Método para saber si un número es hiperpar
     * @param num el número del que se quiere saber si es hiperpar
     * @return true si es hiperpar, false si no lo es
     */
    public static boolean isHyperpar(long num){
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++){
            int individualNum = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (individualNum % 2 != 0) return false;
        }
        return true;
    }
}
