package es.educacion.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Clase que calcula que valor es el maximo de un array
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    /**
     * Funcion que calcula el maximo de un array
     * @param numeros int [] de los numeros de un array
     * @return int maximo
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException();
        }
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
}
