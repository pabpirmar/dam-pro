package es.educacion.arrays;

import java.lang.reflect.Array;

/**
 * Clase que invierte un array
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    /**
     * Funcion que invierte el orden de un array
     * @param numeros int[] de los numeros de un array
     * @return int[] del arrau invertido
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int [] invertido = new int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        return invertido;
    }
}
