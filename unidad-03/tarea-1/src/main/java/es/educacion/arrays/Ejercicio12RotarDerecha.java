package es.educacion.arrays;

/**
 * Clase que rota las posiciones de un array a la derecha
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    /**
     * Funcion que rota los posiciones de un array a la derecha
     *
     * @param numeros int[] de los numeros de un array
     * @param posiciones int de las posiciones de un array
     * @return int [] del array con las posiciones rotadas
     */
    public static int[] rotar(int[] numeros, int posiciones) {
        if (numeros == null || posiciones <0 ){
            throw new IllegalArgumentException();
        }
        int [] resultado = new int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            int nuevaPosicion = (i + posiciones) % numeros.length;
            resultado[nuevaPosicion] = numeros[i];
        }
        return resultado;
    }
}
