package es.educacion.arrays;

/**
 * Clase que cuenta la longitud de un array
 *
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    /**
     * Funcion que cuenta la longiitud de un array
     *s
     * @param numeros int[] de los numeros de un array
     * @return int de la longitud del array
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        return numeros.length;
    }

    /**
     * Funcion que almacena un array
     * @param numeros int[] de los numeros de un array
     * @return int con la longitud
     */
    public static boolean tieneElementos(int[] numeros) {
        return longitud(numeros) > 0;
    }
}
