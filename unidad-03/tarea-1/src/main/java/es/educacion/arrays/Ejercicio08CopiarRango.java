package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que copia el rango de un array
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    /**
     * Funcion que copia el rango de un array
     *
     * @param numeros int [] de numeros de un array
     * @param inicio int de inicio
     * @param fin int de fin
     * @return int la copia de un array
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
        if (numeros == null || inicio < 0 || inicio > fin || fin > numeros.length) {
            throw new IllegalArgumentException();
        }
        return Arrays.copyOfRange(numeros, inicio, fin);
    }
}
