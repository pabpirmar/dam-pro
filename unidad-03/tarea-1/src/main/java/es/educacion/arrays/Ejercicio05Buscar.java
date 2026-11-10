package es.educacion.arrays;

/**
 * Clase que busca una posicion de un array
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    /**
     * Calcula suma de un array
     *
     * @param numeros [] de entero
     * @param objetivo int objetivo
     * @return int de la busqueda
     * @exception IllegalArgumentException
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }
        return -1;

    }
}
