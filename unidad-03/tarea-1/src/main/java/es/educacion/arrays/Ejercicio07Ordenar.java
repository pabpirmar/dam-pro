package es.educacion.arrays;
import java.util.Arrays;

/**
 * Clase que ordena los numeros de un array de menor a mayor
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    /**
     * Funcion que ordena los numeros de un array
     * @param numeros int [] de los numeros de un array
     * @return int[] de los numeros ordenados
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(numerosOrdenados);
        return numerosOrdenados;
    }
}
